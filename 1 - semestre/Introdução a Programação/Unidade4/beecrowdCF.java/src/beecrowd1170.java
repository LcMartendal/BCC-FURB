import java.util.Scanner;

public class beecrowd1170 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 0;
        n = scan.nextInt();      

        for (int i = 0; i < n; i++){
            double c = scan.nextDouble();
            int dias = 0;            
            while(c > 1){
                dias++;
                c /= 2;
                
            }
            System.out.println(dias + " dias ");
        }
        scan.close();
    }
    
}
