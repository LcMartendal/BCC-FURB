import java.util.Scanner;

public class Uni03Exe06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a qtd (em KG) do cliente: ");
        double qtdKG=scan.nextDouble();

        System.out.println("Valor a pagar = " + ((qtdKG+0.750)*25.00));
        scan.close();
        


    }
}
