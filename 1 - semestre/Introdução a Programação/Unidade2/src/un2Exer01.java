import java.util.Scanner;

public class un2Exer01 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("digite dois numeros inteiros!");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        System.out.println(n1 + " " + n2);
        scan.close();
    }
    
}
