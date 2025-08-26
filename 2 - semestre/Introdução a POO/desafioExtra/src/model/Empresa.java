package model;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lc Martendal
 */
public class Empresa {
    
    private String nome;
    private ArrayList <Pedido> pedidos = new ArrayList<>();
    
    public Empresa(String nome) {
        this.nome = nome;
    }
    
    public void inserirPedido(Pedido p){
        if(pedidos.size() < 60){
            pedidos.add(p);
            System.out.println("Total de pedidos: " + pedidos.size());
                
        }else 
            throw new IllegalArgumentException("Limite de pedidos alcançado!");
            
        }
        
    
}
