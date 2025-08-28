import java.text.DecimalFormat;
import java.util.Scanner;

public class un2Exer06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        int numF;
        double numHT;
        double valorH;

        System.out.println("Digite num do funcionário ");
        numF=scan.nextInt();
        System.out.println("Digite o número de horas trabalhadas.");
        numHT=scan.nextDouble();
        System.out.println("Digite valor por hora.");
        valorH=scan.nextDouble();


        double salario = numHT * valorH;

        System.out.println("Número do funcionario = " +  numF);
        System.out.println("salario = " + df_2.format(salario));
    }
    
}
