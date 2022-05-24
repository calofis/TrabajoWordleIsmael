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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ismac
 */
public class Motor_BDes implements Motor{
    
     private List<String> palabras = new ArrayList<>();
    private final String URL = "jdbc:sqlite:data/dbwordle.db";
    Random rn = new Random();

    
    public Motor_BDes() throws SQLException{
       getWords();
    }

    public List getWords() throws SQLException{
        try(Connection conn = DriverManager.getConnection(URL);
                Statement consulta = conn.createStatement();
                ResultSet rs = consulta.executeQuery("SELECT palabra from palabras where lang = 'es'")){
                    while(rs.next()){
                        String palabra = rs.getString("palabra");
                        palabras.add(palabra);
                    }
        
        }
        return palabras;
    }
    @Override
    public boolean existsWord(String word) {
        try(Connection conn = DriverManager.getConnection(URL);
                PreparedStatement ps = conn.prepareStatement("SELECT palabra from palabras where lang = 'es' and palabra = ?")){
                ps.setString(1, word.toUpperCase());
                try(ResultSet rs = ps.executeQuery()){
                    if(rs.next()){
                        return true;
                    }
                }
        } catch (SQLException ex) {
            Logger.getLogger(Motor_BDgl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }   

    @Override
    public boolean addWord(String word) {
       try(Connection conn = DriverManager.getConnection(URL);
          PreparedStatement ps = conn.prepareStatement("INSERT INTO palabras (palabra, lang) VALUES (?, 'es')")){
           ps.setString(1, word.toUpperCase());
           int insertadas = ps.executeUpdate();
           return insertadas > 0;
       } catch (SQLException ex) {
            Logger.getLogger(Motor_BDgl.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
    }

    @Override
    public boolean removeWord(String word) {
        try(Connection conn = DriverManager.getConnection(URL);
          PreparedStatement ps = conn.prepareStatement("DELETE FROM palabras WHERE palabra='?' AND lang='es'")){
           ps.setString(1, word.toUpperCase());
           int borradas = ps.executeUpdate();
           return borradas > 0;
       } catch (SQLException ex) {
            Logger.getLogger(Motor_BDgl.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
    }

    @Override
    public String randomWord() {
        int nR = rn.nextInt(palabras.size());
        String palabra = palabras.get(nR);
        return palabra;
    }
    
    
}
