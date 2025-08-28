/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



/**
 *
 * @author Lc Martendal
 */
public class ContaEspecial extends ContaBancaria {
    
    private double limite_credito;

    public double getLimite_credito() {
        return limite_credito;
    }

    public void setLimite_credito(double limite_credito) {
        this.limite_credito = limite_credito;
    }
    
    @Override
    public void sacar(double valor){
        if(valor > (this.getSaldo() + this.limite_credito)){
            throw new IllegalArgumentException("Valor maior que saldo e limite de credito");
            
        }
    setSaldo(this.getSaldo() - valor);
        
     Movimento m = new Movimento(valor, TipoMovimento.DEBITO);
     incluirMovimento(m);
    }
    
}
