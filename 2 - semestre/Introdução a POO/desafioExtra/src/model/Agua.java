package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lc Martendal
 */
public class Agua extends Produtos{
    
    private double litro;

    public Agua(String codigo, String descricao, double valorUnitario, double litro) {
        this.setCodigo(codigo);
        this.setDescricao(descricao);
        this.setValorUnitario(valorUnitario);
        this.litro = litro;
    }

    
    
    
}
