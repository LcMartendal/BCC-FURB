import java.util.Scanner;

public class Uni5Exer8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int num1 = 0, menorNumN=0, MNN=0;
        double mediaNumP=0;

        for(int i=1;i<=num;i++){
            num1 = scan.nextInt();
            if(num1<0){                
                MNN = Math.min(num1, menorNumN);
                menorNumN = MNN;
                

                
            }else mediaNumP+= num1;
        }
        System.out.println("O menor valor negativo: " + MNN);
        System.out.println("A média dos números positivos: " + (mediaNumP/num));
        scan.close();
    }
    
}
