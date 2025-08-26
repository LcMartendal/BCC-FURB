package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lc Martendal
 */
public class Gas extends Produtos{
    
    private double kg;

    public Gas(String codigo, String descricao, double valorUnitario,double kg) {
        this.setCodigo(codigo);
        this.setDescricao(descricao);
        this.setValorUnitario(valorUnitario);
        this.kg = kg;
    }

    
    
    
    
}
