/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.ismael.clases;

/**
 *
 * @author ismac
 */
public class Motor_Test implements Motor{


    @Override
    public String randomWord() {
        String palabra = "CICLO";
        return palabra;
    }
    
   

    @Override
    public boolean addWord(String word) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean existsWord(String palabra) {
         return true;
    }

    @Override
    public boolean removeWord(String word) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
