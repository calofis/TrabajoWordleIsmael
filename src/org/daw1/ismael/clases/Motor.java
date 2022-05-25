/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.ismael.clases;

import java.sql.SQLException;

/**
 *
 * @author ismac
 */
public interface Motor{
    
    public boolean existsWord(String word);
    
    public boolean addWord(String word);
            
    public boolean removeWord(String word);
    
    public String randomWord() throws SQLException;
}
