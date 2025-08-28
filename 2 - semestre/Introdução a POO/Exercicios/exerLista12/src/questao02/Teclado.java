/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lc Martendal
 */
public class Teclado {

   
    Scanner scan;

    public Teclado() {
    this.scan = new Scanner(System.in);
    }
    
    
    public int lerInt(){
        
        System.out.println("Digite um numero inteiro");
        int num = 0;
        
        while(true){
            try{
                return num = Integer.parseInt(scan.nextLine());

            }catch(IllegalArgumentException ex){
                System.out.println("Nao e int");

            }catch(InputMismatchException ex){
                System.out.println("Nao e int");
            }
        }
        
    }
    
    
    public double lerDouble(){
        
        return Double.parseDouble(scan.nextLine());
    }
    
    public boolean lerBoolean(){
        
        return Boolean.parseBoolean(scan.nextLine());
    }
    
    public String lerString(){
        
        return scan.nextLine();
    }
}
