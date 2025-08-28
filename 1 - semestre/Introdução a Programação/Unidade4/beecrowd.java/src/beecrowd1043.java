import java.text.DecimalFormat;
import java.util.Scanner;

public class beecrowd1043 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");


        double A=scan.nextDouble();
        double B=scan.nextDouble();
        double C=scan.nextDouble();
        
        if(A+B>C&&A+C>B&&C+B>A){
        double perimetro = A+B+C;   
        System.out.println("Perimetro = " + df.format(perimetro)); 

        }else{
        double area = ((A+B)*C)/2;
        System.out.println("Area = " + df.format(area));
        }
    }
    
}
