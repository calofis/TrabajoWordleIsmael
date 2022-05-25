/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.ismael.clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ismac
 */
public class Motor_BD implements Motor{
    
    private final String URL = "jdbc:sqlite:data/dbwordle.db";
    Random rn = new Random();
    private final String lang;

    
    public Motor_BD(String lang){
       this.lang = lang;
    }
    
    private int getNumPalabras(){
         int total = 0;
        try(Connection conn = DriverManager.getConnection(URL);
          PreparedStatement ps = conn.prepareStatement("SELECT count(palabra) as total FROM palabras WHERE lang= ?")){
           ps.setString(1, lang);
           try(ResultSet rs = ps.executeQuery()){
               rs.next();
               total = rs.getInt("total");
           }
        }catch (SQLException ex) {
            Logger.getLogger(Motor_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    
    @Override
    public boolean existsWord(String word) {
        try(Connection conn = DriverManager.getConnection(URL);
                PreparedStatement ps = conn.prepareStatement("SELECT palabra from palabras where lang = ? and palabra = ?")){
                ps.setString(2, word.toUpperCase());
                ps.setString(1, lang);
                try(ResultSet rs = ps.executeQuery()){
                    if(rs.next()){
                        return true;
                    }
                }
        } catch (SQLException ex) {
            Logger.getLogger(Motor_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }   

    @Override
    public boolean addWord(String word) {
       try(Connection conn = DriverManager.getConnection(URL);
          PreparedStatement ps = conn.prepareStatement("INSERT INTO palabras (palabra, lang) VALUES (?, ?)")){
           ps.setString(1, word.toUpperCase());
           ps.setString(2, lang);
           int insertadas = ps.executeUpdate();
           return insertadas > 0;
       } catch (SQLException ex) {
            Logger.getLogger(Motor_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
    }

    @Override
    public boolean removeWord(String word) {
        try(Connection conn = DriverManager.getConnection(URL);
          PreparedStatement ps = conn.prepareStatement("DELETE FROM palabras WHERE palabra = ? AND lang= ?")){
           ps.setString(1, word.toUpperCase());
           ps.setString(2, lang);
           int borradas = ps.executeUpdate();
           return borradas > 0;
       } catch (SQLException ex) {
            Logger.getLogger(Motor_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
    }

    @Override
    public String randomWord() throws SQLException{
        int total = getNumPalabras();
        try(Connection conn = DriverManager.getConnection(URL);
           PreparedStatement sp = conn.prepareStatement("SELECT palabra FROM palabras WHERE lang= ? limit ?, 1")){
            int nR = rn.nextInt(total);
            sp.setString(1, lang);
            sp.setInt(2, nR);
            try(ResultSet rs = sp.executeQuery()){
              return rs.getString("palabra");
            }
           }  
        }
    }
    
    

