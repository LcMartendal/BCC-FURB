package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lc Martendal
 */
public class ItemPedido {
    
    private int quantidada;
    private Produtos produto;

    public int getQuantidada() {
        return quantidada;
    }

    public void setQuantidada(int quantidada) {
        this.quantidada = quantidada;
    }

    public Produtos getProduto() {
        return produto;
    }

    public void setProduto(Produtos produto) {
        this.produto = produto;
    }
    
    
    public double calcularTotal(){
        
        return produto.getValorUnitario() * this.quantidada;
    }
    
}
