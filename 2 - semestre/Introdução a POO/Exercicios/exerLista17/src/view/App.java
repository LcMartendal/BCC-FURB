/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import model.AnalizadorTexto;
import model.OrdenacaoFrequenciaDecresente;

/**
 *
 * @author Lc Martendal
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o arquivo a ser analizado!");
        String arquivo = scan.nextLine();
        
        AnalizadorTexto analizador = new AnalizadorTexto(new File(arquivo));
        
        analizador.processarArquivo();
        
        System.out.println("------RELACAO PALAVRAS DO ARQUIVO------");
        System.out.println("------ORDENANDO ARQUIVO------");
        List<Map.Entry<String, Integer>> listaOrdenada = new ArrayList<>(analizador.getPalavras().entrySet());
        Collections.sort(listaOrdenada, new OrdenacaoFrequenciaDecresente());
        
        for(Map.Entry<String, Integer> entrada : analizador.getPalavras().entrySet()){
            System.out.println("Palavras: " + entrada.getKey() + " - " 
                                + "Frequencia: " + entrada.getValue());
        }
        
        
    }
}
