/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Funcionario;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Lc Martendal
 */
public class App {
    
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("0.00");
        
        Funcionario func = new Funcionario("Alberto", 3000);


        JOptionPane.showMessageDialog(null, func.identificarFaixaIrpf() 
                               + "\nValor IRPF: " + df.format(func.calcIrpf()));
    }
    
    
    
}
