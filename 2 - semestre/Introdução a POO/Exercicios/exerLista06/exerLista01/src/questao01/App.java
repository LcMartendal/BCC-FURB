/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao01;

import java.text.DecimalFormat;

/**
 *
 * @author Lc Martendal
 */
public class App {
    public static void main(String[] args){
        
        Pessoa luiz = new Pessoa(1.75f, 78f);
        
        DecimalFormat df = new DecimalFormat("0.00");
        double imc = luiz.calcularImc();
        System.out.print(df.format(imc));
        
    }
}
