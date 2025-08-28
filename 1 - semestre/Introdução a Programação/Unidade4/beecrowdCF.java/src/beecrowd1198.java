
import java.util.Scanner;

public class beecrowd1198 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       
        while (scan.hasNextLong()) {
            long soldados = scan.nextLong();
            long soldadosOponentes = scan.nextLong();
            
            long diferenca = Math.abs(soldadosOponentes - soldados);
            System.out.println( diferenca );
        }     
        scan.close();
    }
    
}
