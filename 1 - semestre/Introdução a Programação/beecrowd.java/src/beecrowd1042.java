import java.util.Scanner;

public class beecrowd1042 {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        int n = 0, n1 = 0, n2 = 0, n3 = 0, menorN = 0, maiorN = 0, intN = 0;

        for(int i = 0; i < 3; i++){
            
            n = scan.nextInt();
            if(i == 0 ){
                n1 = n;
            }else if(i == 1 ){
                n2 = n;
            }else n3 = n;
            
            maiorN = Math.max(n1, Math.max(n2, n3));
            intN = Math.max(n1, Math.min(n2, n3));
            menorN = Math.min(n1, Math.min(n2, n3));
        }
            
            System.out.println(menorN + "\n" + intN + "\n" + maiorN);
            System.out.println();
            System.out.println(n1 + "\n" + n2 + "\n" + n3);
        scan.close();
    }
}