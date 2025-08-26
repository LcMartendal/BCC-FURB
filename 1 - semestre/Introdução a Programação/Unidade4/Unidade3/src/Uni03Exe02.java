import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni03Exe02 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        System.out.println("informe o valor do sapato: ");
        double vParSap = scan.nextDouble();

        System.out.println("Valor do desconto (12%) = " + (vParSap*0.12));
        System.out.println("Valor preço do sapato com desconto = " + (vParSap-(vParSap*0.12)));
        scan.close();
        df2.clone();

    }
}
