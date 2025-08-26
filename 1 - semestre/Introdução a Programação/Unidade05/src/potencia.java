import java.util.Scanner;

public class potencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 1;
        int potencia = 1;
        while(potencia<=100){
            potencia*=contador;
            contador++;
            
        }System.out.println(potencia);

        scan.close();
    }
    
}
