import java.util.Scanner;

public class un2Exer17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("digite o nome do funconário");
        String nome = scan.nextLine();
        System.out.println("Digite qtd horas trabalhadas por mês");
        Double qtdHT = scan.nextDouble();
        System.out.println("Digite qtd de dependentes");
        int qtdDep = scan.nextInt();

        double salarioBruto = (qtdHT * 10) + 60;
        double INSS = (salarioBruto*8.5)/100;
        double IR = (INSS*5)/100;
        double DescontoT = INSS + IR;
        double salarioLiquido = salarioBruto - DescontoT;

        System.out.println(nome);
        System.out.println("salário bruto " + salarioBruto);
        System.out.println("Salário liquído " + salarioLiquido);
        System.out.println(qtdDep);
        scan.close();




    }
    
}
