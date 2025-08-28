/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao03;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Lc Martendal
 */
public class App {
    public static void main(String[] args){
    
    
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    
    for(int i = 0; i < 3; i++){
        Pessoa p1 = new Pessoa();
    
    System.out.print("Digite a altura da " + (i + 1) + " pessoa: ");
    float altura = scan.nextFloat();
    p1.setAltura(altura);
    System.out.print("Digite o peso: ");
    float peso = scan.nextFloat();
    p1.setPeso(peso);
    
            
    System.out.println("IMC: " + df.format(p1.calcularImc()));
    }
        
    }
}
