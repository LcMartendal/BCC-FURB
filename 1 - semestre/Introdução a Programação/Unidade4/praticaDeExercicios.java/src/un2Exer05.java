import java.util.Scanner;

public class un2Exer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero inteiro para A");
        int a = scan.nextInt();
        System.out.println("Digite um numero inteiro para B");
        int b = scan.nextInt();
        System.out.println("Digite um numero inteiro para C");
        int c = scan.nextInt();
        System.out.println("Digite um numero inteiro para D");
        int d = scan.nextInt();

        int diferenca = ((a*b)-(c*d));

        System.out.println("Diferença = " + diferenca);


    }
    
}
