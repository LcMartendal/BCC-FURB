/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.view;

import java.util.Scanner;
import model.Diretorio;

/**
 *
 * @author rwsouza
 */
public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe um caminho: ");
        String caminho = teclado.nextLine();
        
        Diretorio dir = new Diretorio(caminho);
        
        long tamanho = dir.obterTamanhoArquivos();
        
        System.out.println("Tamanho em (bytes):"+ tamanho);
        System.out.println("Tamanho em (mega bytes):"+ (tamanho/1024.0/1024.0));
        
        
        teclado.close();
    }
}
