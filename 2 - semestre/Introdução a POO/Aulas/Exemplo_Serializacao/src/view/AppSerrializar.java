/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import model.ContaBancaria;

/**
 *
 * @author Lc Martendal
 */
public class AppSerrializar {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File f = new File("Objetos.bin");
        try (FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream o = new ObjectOutputStream(fos)) {
        o.writeObject("Boa noite");
        o.writeObject(new ContaBancaria("1","Lucas",300.00));
        
        }
        
            
        
    }
}
