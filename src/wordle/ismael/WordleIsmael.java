/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wordle.ismael;

import java.sql.SQLException;
import org.daw1.ismael.clases.*;



/**
 *
 * @author ismac
 */
public class WordleIsmael {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Motor_BDgl motor = new Motor_BDgl();
        System.out.println(motor.getWords().toString());
    }
    
}
