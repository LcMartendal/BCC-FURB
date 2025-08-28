import java.util.Scanner;

public class Uni03Exe11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsios!");
        double C=scan.nextDouble();

        Double F = ((C/5)*9)+32;
        System.out.println("-> Fahrenheit = " + F);
        scan.close();
    }
    
}
