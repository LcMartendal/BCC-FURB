import java.text.DecimalFormat;
import java.util.Scanner;

public class beecrowd1036 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");

        double A=scan.nextDouble();
        double B=scan.nextDouble();
        double C=scan.nextDouble();


        
        double delta = (B*B)-(4*A*C);
        if(delta<0||A==0){
            System.out.println("Impossivel calcular");
        }else{
            double R1 = ((B*-1) + Math.sqrt(delta))/(2*A);          
            double R2 = ((B*-1) - Math.sqrt(delta))/(2*A);
            System.out.println("R1 " + df.format(R1));
            System.out.println("R2 " + df.format(R2));
        }
        scan.close();
    }
}
