import java.util.Scanner;

public class Uni03Exe04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nota 1:");
        double n1=scan.nextDouble();
        System.out.println("Nota 2:");
        double n2=scan.nextDouble();
        System.out.println("Nota 3:");
        double n3=scan.nextDouble();

        System.out.println("Sua média ponderada é: " + (((n1*5)+(n2*3)+(n3*2))/10));
        scan.close();

    }
}
