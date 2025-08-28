/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Agua;
import model.Empresa;
import model.FormaPagamento;
import model.Gas;
import model.ItemPedido;
import model.Pedido;
import model.Produtos;

/**
 *
 * @author Lc Martendal
 */
public class App {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        ItemPedido iP = new ItemPedido();
        Empresa e = new Empresa("Noton");
        
        
        Produtos agua1 = new Agua("1" , "Agua de 1 litro", 10, 1);
        double qtdKg = 0;
        Produtos gas5 = new Gas("2", "Gas de 5 kg", 12, 5);
        
        iP.setProduto(agua1);
        iP.setQuantidada(5);
        iP.setProduto(gas5);
        iP.setQuantidada(2);
        
        
        
        
            
        
        
    }
}
