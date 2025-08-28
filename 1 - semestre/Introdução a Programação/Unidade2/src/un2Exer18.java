import java.util.Scanner;

public class un2Exer18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite altura");
        Double altura = scan.nextDouble();
        System.out.println("Digite o comprimento");
        double comprimento = scan.nextDouble();

        double metroQua = altura * comprimento;
        double qtdNec = metroQua * 9;
        double valorT = qtdNec * 12.50;

        System.out.println("Valor gasto "  + valorT);
        scan.close();
    }
    
}
