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
public class Pedido {
     
    private ArrayList<ItemPedido> item = new ArrayList<>();
    
    ItemPedido iP;
    FormaPagamento fP;
    
    public double calcularTotalPagar(){
        double total = 0;
        for(ItemPedido i : item){
            total+= i.calcularTotal();
        }
        
        return fP.pagar(total);
    }
   
    public void inserirItem(Produtos p, int quantidade ){
        iP = new ItemPedido();
        iP.setProduto(p);
        iP.setQuantidada(quantidade);
        item.add(iP);
    }
}
