/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.ismael.clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ismac
 */
public class Motor_Fichero implements Motor{
    
    
    Random rn = new Random();
    private List<String> palabras = new ArrayList<>();
    private String ruta = "." + File.separator + "data" + File.separator + "palabras.txt";
    File f = new File(ruta);
    
    public boolean existeFichero() {
        File f = new File(ruta);
        return f.exists();
    }

    public boolean existeCarpetaPadre() {
        File f = new File(ruta);
        return f.getParentFile().exists();
    }

     public boolean crearFicheroTexto(String texto){
        if(!existeFichero() && existeCarpetaPadre()){
            try(Writer bw = new BufferedWriter(new FileWriter(f))){
                bw.write(texto);
                return true;
            } catch (IOException ex) {
                Logger.getLogger(Motor_Fichero.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        else{
            return false;
        }        
    }
    @Override
    public boolean addWord(String word) {
         if(existeFichero() && existeCarpetaPadre()){
            try(Writer wr = new BufferedWriter(new FileWriter(f, true))){
                wr.write("\n" + word.toUpperCase());
                return true;
            } catch (IOException ex) {
                Logger.getLogger(Motor_Fichero.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        else{
            return false;
        }
    }

    @Override
    public boolean existsWord(String word) {
        boolean existe = false;
         try(BufferedReader br = new BufferedReader(new FileReader(f))){
                String linea = br.readLine();
                while(linea != null && existe == false){
                    if(linea != null){
                        palabras.add(linea);
                    } 
                    linea = br.readLine();
                    if(palabras.contains(word.toUpperCase())){
                        existe = true;
                    } 
                } 
                return existe;
            } catch (IOException ex) {
                Logger.getLogger(Motor_Fichero.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }  
    }

    @Override
    public boolean removeWord(String word) {
        word = word.toUpperCase();
        try(BufferedReader br = new BufferedReader(new FileReader(ruta))){
                String linea = br.readLine();
                while(linea != null){
                    if(linea != null){
                        palabras.add(linea);
                    } 
                    linea = br.readLine(); 
                }
            } catch (IOException ex) {
                Logger.getLogger(Motor_Fichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        if (!palabras.contains(word.toUpperCase())) {
            return false;
        }
        //System.out.println("antes de borrar " + palabras);
        Iterator<String> it = palabras.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (word.equals(next)) {
                it.remove();
            }
        }
        //System.out.println("despues de borrar" + palabras);
        String palabra = "";
        for (String palabra1 : palabras) {
            palabra += palabra1.toUpperCase() + "\n";
        }
        if (!f.exists()) {
            f.getParentFile().mkdirs();
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Motor_Fichero.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f));) {
            bw.append(palabra.toUpperCase());
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Motor_Fichero.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public FixedLengthString randomWord() {
            try(BufferedReader br = new BufferedReader(new FileReader(ruta))){
                String linea = br.readLine();
                while(linea != null){
                    if(linea != null){
                        palabras.add(linea);
                    } 
                    linea = br.readLine(); 
                }
                int nR = rn.nextInt(palabras.size());
                return new FixedLengthString(palabras.get(nR));
            } catch (IOException ex) {
                Logger.getLogger(Motor_Fichero.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
    }
    
}
