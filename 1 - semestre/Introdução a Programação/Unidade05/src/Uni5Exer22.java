import java.util.Scanner;

public class Uni5Exer22 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int ano = 1995;
        double salarioInicial = 2000, aumento = 0, salarioAtual = 0;
        while (ano != 2024) {
            ano++;
            aumento = (salarioInicial*1.5)/100;
            salarioInicial = salarioInicial + aumento;
            
            
        }
        salarioAtual = salarioInicial;
        System.out.println(salarioAtual);
        scan.close();
    }
    
}
