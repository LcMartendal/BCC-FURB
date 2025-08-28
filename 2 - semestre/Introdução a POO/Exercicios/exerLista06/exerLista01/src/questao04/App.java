/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao04;

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
    String nome = scan.next();
    umaPessoa.setNome(nome);
    System.out.print("Digite a altura da pessoa:");
    float altura = scan.nextFloat();
    umaPessoa.setAltura(altura);
    System.out.print("Digite o peso:");
    float peso = scan.nextFloat();
    umaPessoa.setPeso(peso);
    scan.nextLine();
    
    vetorPessoa[i] = umaPessoa;
            
    }
    for(int i = 2; i >=0; i-- ){
        System.out.println("Nome: " + vetorPessoa[i].getNome() + " com IMC = " + df.format(vetorPessoa[i].calcularImc()));
    }
    
    } 
}
