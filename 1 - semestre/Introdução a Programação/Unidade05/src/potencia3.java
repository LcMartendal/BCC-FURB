import java.util.Scanner;

public class potencia3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contador = 1;
        int potencia = 1;
        do{
        potencia*=contador;
        contador++;
        }while(potencia<=100);            
            
        System.out.println(potencia);
        scan.close();
    }
    
}
