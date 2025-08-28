import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni03Exe12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
    
        System.out.println("digite o nome do funconário");
        String nome = scan.nextLine();
        System.out.println("Digite qtd horas trabalhadas por mês");
        Double qtdHT = scan.nextDouble();
        System.out.println("Digite qtd de dependentes");
        int qtdDep = scan.nextInt();

        double salarioBruto = (qtdHT * 10) + (qtdDep*60);
        double INSS = (salarioBruto*8.5)/100;
        double IR = (salarioBruto*5)/100;
        double salarioLiquido = salarioBruto - (INSS + IR);
        System.out.println("Nome: " + nome);
        System.out.println("salário bruto: " + salarioBruto);
        System.out.println("Salário liquído: " + salarioLiquido);

        scan.close();
        df_2.clone();

        
    }
    
}
