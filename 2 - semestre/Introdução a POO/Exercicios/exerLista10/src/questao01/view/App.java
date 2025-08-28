/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao01.view;

import java.util.Scanner;
import questao01.model.Circulo;
import questao01.model.Figura;
import questao01.model.Quadrado;
import questao01.model.Retangulo;
import questao01.model.Triangulo;

/**
 *
 * @author Lc Martendal
 */
public class App {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero correspondente a figura que deseja fazer o calculo"
        +"\n1 - Retangulo"
        +"\n2 - triangulo"
        +"\n3 - circulo"
        +"\n4 = Quadrado");
        
        int op = scan.nextInt();
        
        Figura figura = null;
        switch (op) {
            case 1:
                System.out.println("Altura: ");
                int altura = scan.nextInt();
                System.out.println("Largura: ");
                int largura = scan.nextInt();
                figura = new Retangulo(altura, largura);
                break;
               
            case 2:    
                System.out.println("Medida: ");
                int medida = scan.nextInt();
                figura = new Quadrado(medida);
                break;
            
            case 3: 
                System.out.println("Lado1: ");
                int lado1 = scan.nextInt();
                System.out.println("Lado2: ");
                int lado2 = scan.nextInt();
                System.out.println("Lado3: ");
                int lado3 = scan.nextInt();
                figura = new Triangulo(lado1, lado2, lado3);
                break;
                
            case 4: //Círculo
                System.out.println("Raio: ");
                int raio = scan.nextInt();               
                
                figura = new Circulo(raio);
                break;    
            
        }
        
        System.out.println("Area da figuura = " + figura.calcularArea());
    }
}
