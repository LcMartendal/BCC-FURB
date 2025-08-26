/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao02;

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
        Funcionario[] vetorF = new Funcionario[5];
        
        for(int i = 0; i < vetorF.length; i++){
            
            Funcionario f = new Funcionario();
            System.out.print("Digite o nome do funcionario: ");
            f.setNome(scan.next());
            System.out.print("Digite o salario: ");
            f.setSalario(Double.parseDouble(scan.next()));
            System.out.println(" ");
            
            vetorF[i] = f;
        }
        for(int i = 0; i < vetorF.length; i++){
            System.out.println("Nome do funcionario " + (i+1) +": " + vetorF[i].getNome()
            +"\nSalario: " + vetorF[i].getSalario()
            +"\nIRPF: " + df.format(vetorF[i].calcIrpf()));
            System.out.println("--- --- --- --- ---");
        }
        
    }
}
