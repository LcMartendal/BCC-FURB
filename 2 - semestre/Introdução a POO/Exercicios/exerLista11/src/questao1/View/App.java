/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.View;

import javax.swing.JOptionPane;
import questao1Model.ContaAgua;
import questao1Model.Contas;
import questao1Model.MensalidadeEnsino;
import questao1Model.Pagavel;
import questao1Model.PrevidenciaPrivada;

/**
 *
 * @author Lc Martendal
 */
public class App {
    public static void main(String[] args) {
        Contas contas = new Contas();
        
        ContaAgua cA = new ContaAgua(8, 7);
        contas.incluirConta(cA);
        
        MensalidadeEnsino mE = new MensalidadeEnsino(6, 400);
        contas.incluirConta(mE);
        
        PrevidenciaPrivada pP = new PrevidenciaPrivada();
        pP.setValor(1000);
        pP.investir();
        pP.investir();
        contas.incluirConta(pP);
        
        System.out.println("Valor total: " + contas.calcularTotalContas());
        
        for(Pagavel conta : contas.getContas()){
            
            if(conta instanceof PrevidenciaPrivada){
                System.out.println("Valor das contas para previdencia privada = " + conta.calcularValorPagar()
                + " - saldo = " + ((PrevidenciaPrivada) conta).getSaldo() );
               
            }else if(conta instanceof ContaAgua){
                System.out.println("Valor das contas de agua = " + conta.calcularValorPagar());
                
            }else if(conta instanceof MensalidadeEnsino){
                System.out.println("Valor das contas de mensalidade de ensino = " + conta.calcularValorPagar());
            }
            System.out.println("--------------------------");
        }
        
        
    }
}
