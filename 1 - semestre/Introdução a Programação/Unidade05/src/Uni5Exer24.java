
import java.util.Scanner;

public class Uni5Exer24 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.println("digite o peso limite (Em KG)");
        double limite = scan.nextInt();
        double peso_do_peixe = 0, peso_total = 0;
        String continuar = "sim";
        limite = limite * 1000;
        while (continuar.equalsIgnoreCase("sim")) {            
        
            for(int i = 0; i < (int)limite; i++){
                System.out.println("digite o peso do peixe (Em GRAMAS)");
                peso_do_peixe = scan.nextDouble();
                peso_total+= peso_do_peixe;
                System.out.println("Peso total até aquele momento = " + (peso_total / 1000) + " KG");

                System.out.println("Continuar ?");
                continuar = scan.next();
            }
        }
        
        scan.close();
    }
    
}
