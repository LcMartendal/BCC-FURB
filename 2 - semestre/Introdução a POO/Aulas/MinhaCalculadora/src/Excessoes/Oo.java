/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excessoes;

import java.util.Scanner;

/**
 *
 * @author Lc Martendal
 */
public class Oo {
    
    Scanner scan = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
        try{
           int a[] = new int[2];
           a[1] = 30 / 2;
            System.out.println(a[1]);
        }   catch(Exception ex){
                   System.out.println("Ocorreu algum erro");
        } 
    
    
    }
    

}
