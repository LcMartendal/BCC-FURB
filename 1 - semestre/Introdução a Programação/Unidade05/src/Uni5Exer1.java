
import java.util.Scanner;


public class Uni5Exer1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor=0;
        int i=0;
        while(i<20){
        valor = scan.nextInt();
        i+=1;
        if(valor%2!=0){
            System.out.println("Número " + valor + " é impar!");
        }else{
            System.out.println("Número " + valor + " é par!");
        }
    }

        scan.close();

    }
    
}
