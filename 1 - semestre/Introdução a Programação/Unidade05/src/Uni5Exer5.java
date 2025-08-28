import java.util.Scanner;

public class Uni5Exer5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite qtd de valores");
        int n=scan.nextInt();
        int valor=8;
        
            if(n<=2)
                System.out.println("Erro, qtd de termos tem de ser superrior a 2!");
            else for(int i = 1; i<=n;i++){              
                System.out.println(valor);
                i++;
                if(i<=n)
                System.out.println(valor + 2);
                valor*=2;
            
        }
        
        scan.close();

        
    }
    
}
