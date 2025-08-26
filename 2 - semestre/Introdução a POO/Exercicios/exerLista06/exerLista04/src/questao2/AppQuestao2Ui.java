/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2;

import javax.swing.JOptionPane;

/**
 *
 * @author Lc Martendal
 */
public class AppQuestao2Ui {
    
    public static void  main(String[] args){
        
        Retangulo r = new Retangulo();
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog("informe a altura"));
        r.setAltura(altura);
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog("informe a comprimento"));
        r.setComprimento(comprimento);
        
        
        JOptionPane.showMessageDialog(null, "Area do triangulo: " + r.calcularArea()
                + "\nPerimetro: " + r.calcularPerimetro());
        
        
    }
}
