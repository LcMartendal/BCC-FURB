/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02;

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
    
    Pessoa luiz = new Pessoa(0, 0);
    System.out.print("Digite sua altura:");
    float altura = scan.nextFloat();
    luiz.setAltura(altura);
    System.out.print("Digite seu peso:");
    float peso = scan.nextFloat();
    luiz.setPeso(peso);
    
    double imc = luiz.calcularImc();
    System.out.print(df.format(imc));
    }
    
}
