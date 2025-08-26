/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.io.File;
import java.io.FileNotFoundException;
import model.Cidade;
import model.ImportadorIbge;
import model.Pais;

/**
 *
 * @author rwsouza
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException {
        
        Pais brasil = new Pais("Brasil");
        
        ImportadorIbge ii = new ImportadorIbge(brasil);
        
        ii.carregarDados(new File("C:\\Users\\luizc\\Downloads\\POO\\L14_municipios.csv"));
        
        Cidade maiorPopulacao = brasil.cidadeMaiorPopulacao();
        Cidade menorPopulacao = brasil.cidadeMenorPopulacao();
        
        System.out.println("******* Cidade Menor Populacao ******");
        System.out.println(" Nome: "+ menorPopulacao.getNome());
        System.out.println(" Codigo IBGE: "+ menorPopulacao.getCodigoIbge());
        System.out.println(" Populacao: "+ menorPopulacao.getPopulacao());
        System.out.println(" Estado: "+ menorPopulacao.getEstado().getNome());
        
        System.out.println("******* Cidade Maior Populacao ******");
        System.out.println(" Nome: "+ maiorPopulacao.getNome());
        System.out.println(" Codigo IBGE: "+ maiorPopulacao.getCodigoIbge());
        System.out.println(" Populacao: "+ maiorPopulacao.getPopulacao());
        System.out.println(" Estado: "+ maiorPopulacao.getEstado().getNome());
        
        
        
    }
 
}
