import java.util.Scanner;

public class un2Exer20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a qtd de dobras:");
        int qtdDobra = scan.nextInt();
        int qtdQua = (qtdDobra*qtdDobra);

        System.out.println("Qtd de quadrados: " + qtdQua);
        scan.close();
    }
    
}
