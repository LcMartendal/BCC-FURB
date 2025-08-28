/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao01;

import javax.swing.JOptionPane;

/**
 *
 * @author Lc Martendal
 */
public class App {
    public static void main(String[] args){
        
        
        Ponto p = new Ponto();
        
        p.setX(7);
        p.setY(7);
        
        JOptionPane.showMessageDialog(null, p.identificarQuadrante());
        
        
    }
}
