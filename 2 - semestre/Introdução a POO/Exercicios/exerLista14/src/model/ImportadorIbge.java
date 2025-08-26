/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author rwsouza
 */
public class ImportadorIbge {
    private Pais pais;
    
    public ImportadorIbge(Pais pais){
        this.pais = pais;
    }
    
    public void carregarDados(File arquivo) throws FileNotFoundException{
       
       try(Scanner sc = new Scanner(arquivo); ){
           
           if (sc.hasNextLine()){
               //Código IBGE;Cidade;Estado;População
               //Ignora o Cabeçalho
               sc.nextLine();
           }
           
           while(sc.hasNextLine()){
              //1100015;Alta Floresta d'Oeste; Rondônia;25437
             String[] linha = sc.nextLine().split(";");
             
             Cidade novaCidade = new Cidade();
             novaCidade.setCodigoIbge(Integer.parseInt(linha[0]));
             novaCidade.setNome(linha[1]);
             novaCidade.setPopulacao(Long.parseLong(linha[3]));
             
             Estado novoEstado = pais.localizarEstado(linha[2]);
             
             if (novoEstado == null){
                 novoEstado = new Estado(linha[2]);
             }
             
             novaCidade.setEstado(novoEstado);
             
             pais.incluirCidade(novaCidade);
             pais.incluirEstado(novoEstado);   
             
               
           }
           
           
       }
        
        
    }
}
