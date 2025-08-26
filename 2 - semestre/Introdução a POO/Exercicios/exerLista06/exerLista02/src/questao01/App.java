/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao01;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Lc Martendal
 */
public class App {
    public static void main(String[] args){
    Pessoa[] vetorPessoa = new Pessoa[3];
    
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    
    for(int i = 0; i < 3; i++){
        Pessoa umaPessoa = new Pessoa();
    System.out.print("Diigite o nome da pessoa " + (i + 1) + "\n");
    umaPessoa.setNome(scan.next());
    
    System.out.print("Digite a altura da pessoa:");
    umaPessoa.setAltura(scan.nextFloat());
    System.out.print("Digite o peso:");
    umaPessoa.setPeso(scan.nextFloat());
    scan.nextLine();
    
    vetorPessoa[i] = umaPessoa;
            
    }
    for(int i = 2; i >=0; i-- ){
        System.out.println("Nome: " + vetorPessoa[i].getNome()
                +"\nAltura: " + vetorPessoa[i].getAltura()
                +"\nPeso: " + vetorPessoa[i].getPeso()
                +"\nIMC = " + df.format(vetorPessoa[i].calcularImc())
                +"\n--- --- --- --- ---");
    }
    
    } 
}
