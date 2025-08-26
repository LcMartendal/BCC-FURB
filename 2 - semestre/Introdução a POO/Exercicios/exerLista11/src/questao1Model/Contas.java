/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1Model;

import java.util.ArrayList;

/**
 *
 * @author Lc Martendal
 */
public class Contas {
    
    ArrayList<Pagavel> contas = new ArrayList<>();
    
    public void incluirConta(Pagavel conta){
        contas.add(conta);
    }

    public ArrayList<Pagavel> getContas() {
        return contas;
    }
    
    public double calcularTotalContas(){
        double total = 0;
        for(Pagavel p : contas){
            total+= p.calcularValorPagar();
        }
        return total;
    }
    
    
}
