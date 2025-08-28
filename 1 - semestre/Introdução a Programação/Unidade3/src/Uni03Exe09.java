import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni03Exe09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.0000");

        
        double raio=scan.nextDouble();
        double altura=scan.nextDouble();

        double volume = (3.1415 * Math.pow(raio, 2)*altura);

        System.out.println("Volume = " + df2.format(volume));
        scan.close();
    }
}

