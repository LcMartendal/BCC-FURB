/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02.model;

import java.util.ArrayList;

/**
 *
 * @author Lc Martendal
 */
public class Vendedor extends Funcionario{
    
    private double percentualComissao;

    public Vendedor(String nome, double salario, double percentualComissao) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }

    ArrayList<Venda> vendas = new ArrayList<>();
    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }
    
    public void incluirVenda(Venda v){
        vendas.add(v);
    }
    
    @Override
    public double calcularSalario(){
        double totalVendas = 0;
        
        for(Venda v : vendas){
            totalVendas+=v.getValor();
        }
        
        return getSalario() + ((totalVendas * this.getPercentualComissao())/100);
    }
    
}
