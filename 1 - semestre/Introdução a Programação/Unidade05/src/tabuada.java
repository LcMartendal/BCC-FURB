import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe qual tabuada deseja: ");
        int valor=scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(valor + " x " + i + " = " + (valor *i));
        }
        scan.close();
    }
    
}
