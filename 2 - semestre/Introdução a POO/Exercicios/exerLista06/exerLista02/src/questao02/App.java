/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Lc Martendal
 *  
 */
public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        ContaBancaria[] conta = new ContaBancaria[2];
        
        for(int i = 0; i < conta.length; i++){
            ContaBancaria c = new ContaBancaria(null, null);
            
            System.out.print("Digite o numero da conta: ");
            String numero = scan.next();
            c.setNumero(numero);
            System.out.print("Digite o titular da conta: ");
            String titular = scan.next();
            c.setTitular(titular);                
            conta[i] = c;
            System.out.println("Saldo da conta: RS" + df.format(conta[i].getSaldo()));
            System.out.println("--- --- --- --- --- ---");
        }
        
        conta[0].depositar(1700);
        conta[1].depositar(5000);
        conta[1].sacar(3000);
        conta[1].transferir(conta[0], 1800);
        
       
        for (ContaBancaria conta1 : conta) {
            System.out.println("---CONTA NUM " + conta1.getNumero() + "---" 
                    + "\nTITULAR: " + conta1.getTitular() 
                    + "\nSALDO: RS" + df.format(conta1.getSaldo()));
        }
        
        
        
    }
}
