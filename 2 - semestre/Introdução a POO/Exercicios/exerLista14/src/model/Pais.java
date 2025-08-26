/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author rwsouza
 */
public class Pais {
    private String nome;
    private ArrayList<Cidade> cidades = new ArrayList<>();
    private ArrayList<Estado> estados = new ArrayList<>();

    public Pais(String nome) {
        this.nome = nome;
    }
    
    
    public void incluirCidade(Cidade cidade){
       cidades.add(cidade);
    }
    
    public void incluirEstado(Estado estado){
      estados.add(estado);
    }
    
    public Cidade cidadeMaiorPopulacao(){
       Cidade maiorPopulacao = cidades.get(0);
       
       for (Cidade cid : cidades){
           if (cid.getPopulacao() > maiorPopulacao.getPopulacao()){
              maiorPopulacao = cid;  
           }
       }
       return maiorPopulacao; 
    }
    
    public Cidade cidadeMenorPopulacao(){
       Cidade menorPopulacao = cidades.get(0);
       
       for (Cidade cid : cidades){
           if (cid.getPopulacao() < menorPopulacao.getPopulacao()){
              menorPopulacao = cid;  
           }
       }
       return menorPopulacao; 
    }
    
    public Estado localizarEstado(String nome){
       for (Estado est : estados){
         if (est.getNome().equals(nome)){
            return est;   
         }    
       }  
       
       return null;
    }
    
}
