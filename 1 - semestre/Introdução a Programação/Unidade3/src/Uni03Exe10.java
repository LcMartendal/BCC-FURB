import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni03Exe10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        System.out.println("Cateto 1");
        double cat1=scan.nextDouble();
        System.out.println("Cateto 2");
        double cat2=scan.nextDouble();

        double hipotenusa = Math.sqrt((Math.pow(cat1, 2)+Math.pow(cat2, 2)));
        

        System.out.println("Hipotenusa = " + df2.format(hipotenusa));
        scan.close();
    }
}
