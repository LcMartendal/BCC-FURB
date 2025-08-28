/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02.view;

import questao02.Teclado;

/**
 *
 * @author Lc Martendal
 */
public class App {
    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        
        System.out.println("");
        int numInt = teclado.lerInt();
        System.out.println(numInt);
        
    }
    
}
