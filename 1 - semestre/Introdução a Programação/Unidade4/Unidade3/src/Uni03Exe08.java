import java.util.Scanner;

public class Uni03Exe08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite qtd de Dolares: ");
        double d=scan.nextDouble();

        System.out.println("Quantidade reais a receber = " + (d*5.00));
        scan.close();
       
    }
    
}
