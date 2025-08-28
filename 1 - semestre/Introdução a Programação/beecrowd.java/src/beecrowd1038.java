import java.text.DecimalFormat;
import java.util.Scanner;

public class beecrowd1038 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        
        int Prod = scan.nextInt();
        int qtd = scan.nextInt();
        double total;

        if(Prod == 1){
            total = 4*qtd;
            System.out.println("Total: R$ " + df.format(total));
        }else if(Prod==2){
            total = 4.5*qtd;
            System.out.println("Total: R$ " + df.format(total));
        }else if(Prod==3){
            total = 5*qtd;
            System.out.println("Total: R$ " + df.format(total));
        }else if(Prod==4){
            total = 2*qtd;
            System.out.println("Total: R$ " + df.format(total));
        }else if(Prod==50){
            total = 1.5*qtd;
            System.out.println("Total: R$ " + df.format(total));
        }
        scan.close();
    }
    
}
