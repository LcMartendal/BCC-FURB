import java.text.DecimalFormat;
import java.util.Scanner;

public class beecrowd1051 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double salary = scan.nextDouble();

        if(salary>=0&&salary<=2000.00){
            System.out.println("Isento");

        }else if(salary>2000.01&&salary<=3000.00){
            System.out.println("R$ " + df.format(((salary-2000)*0.08)));

        }else if(salary>3000.01&&salary<=4500.00){
            System.out.println("R$ " + df.format((((salary-3000)*0.18) + ((1000 *8)/100))));

        }else if(salary>4500.00){
            System.out.println("R$ " + df.format(((salary-4500)*0.28) + ((1500*18)/100) + (1000 *8)/100));
            
        }
    }
}
