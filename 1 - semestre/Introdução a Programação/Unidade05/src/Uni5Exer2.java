import java.util.Scanner;

public class Uni5Exer2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int somapar = 0;
        int somaimpar = 0;
        for(int i=1;i<=100;i++){

            if(i%2!=0){
                somaimpar+=i;                 
               
            }else{
                somapar+=i;                                        
                
            }
        } 
        System.out.println("soma dos números impares " + somaimpar);
        System.out.println("soma dos números pares " + somapar);
        scan.close();

    }
    
}
