import java.util.Scanner;

public class beecrowd1805 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            long A = scan.nextInt();
            long B = scan.nextInt();  

            long somaB = B * (B + 1) / 2;
            long somaA1 = (A - 1) * A / 2;      
            System.out.println(somaB - somaA1);
        }
        
        scan.close();
    }
    
}
