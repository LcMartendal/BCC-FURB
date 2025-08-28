import java.util.Scanner;

public class Uni5Exer7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double nD = 0;
        double maior=0, menor=0, comp1 = 0, comp2 = 0;

        System.out.println("Digite o número: ");
        for(int i = 1; i <=n;i++){
            
            nD = scan.nextDouble();
            comp1 = Math.max(maior, nD);
            maior = comp1;
            comp2 = Math.min(menor, nD);
            menor = comp2;
            

        }
        System.out.println("maior " + maior);
        System.out.println("menor " + menor);
        scan.close();
    }
    
}
