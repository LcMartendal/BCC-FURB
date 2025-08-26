import java.util.Scanner;

public class Uni03Exe13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite altura da parede:");
        Double altura = scan.nextDouble();
        System.out.println("Digite o comprimento da parede:");
        double comprimento = scan.nextDouble();

        double metroQua = altura * comprimento;
        double qtdNec = metroQua * 9;
        double valorT = qtdNec * 12.50;

        System.out.println("Valor gasto: R$ "  + valorT);
        scan.close();
    }
    
}
