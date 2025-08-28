import java.text.DecimalFormat;
import java.util.Scanner;

public class un2Exer07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        String nomeVendedor;
        double salarioFx;
        double totalVendas;

        System.out.println("Nome do funcionário:");
        nomeVendedor=scan.nextLine();
        System.out.println("Salario fixo:");
        salarioFx=scan.nextDouble();
        System.out.println("Total de vendas(em dinheiro)");
        totalVendas=scan.nextDouble();

        double comissao = (totalVendas*15)/100;
        double salario = salarioFx + comissao;

        System.out.println(df_2.format(salario));


    }
    
}
