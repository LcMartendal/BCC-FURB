/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import model.ContaBancaria;

/**
 *
 * @author Lc Martendal
 */
public class AppDesserrializar{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        String objeto1;
        ContaBancaria objeto2;
        
        File f = new File("Objetos.bin");
        try (FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis)) {objeto1 = (String) ois.readObject();
        objeto2 = (ContaBancaria) ois.readObject();
        
}
            
        
    }
}
