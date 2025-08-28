import java.text.DecimalFormat;
import java.util.Scanner;

public class un2Exer09 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Digite a qtd de doláres para a troca!");
        double qtdDolar = scan.nextDouble();
        double reais = 5;
        double vlTrDeMoedas = qtdDolar*reais;;
        System.out.println("Você recebeu " + df_2.format(vlTrDeMoedas) + " na moeda reais!");

        scan.close();
    }
    
}
