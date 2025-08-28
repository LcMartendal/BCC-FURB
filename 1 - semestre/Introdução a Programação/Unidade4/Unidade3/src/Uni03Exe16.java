import java.util.Scanner;

public class Uni03Exe16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor para calculo do troco: ");
        int valor=scan.nextInt();
       
        int cem = valor/100;       
        int dez = (valor%100)/10;        
        int um = (valor%10)/1;      

        System.out.println("A qtd minima de notas para troco é: " + (cem+dez+um));
        System.out.println( cem + " R$100\n " + dez + " R$10\n " + um + " R$1");

        scan.close();
    }
    
}
