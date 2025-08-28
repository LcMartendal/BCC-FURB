import java.util.Scanner;

public class beecrowdifelse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        int A=scan.nextInt();
        int B=scan.nextInt();
        int C=scan.nextInt();
        int D=scan.nextInt();

        if((B>C)&&(D>A)&&((C+D)>(A+B))&&((C>0)&&(D>0))&&(A%2==0)){
            System.out.println("valore aceitos");

        }else{
            System.out.println("Valores nao aceitos");
            scan.close();
        }
    }
    
}
