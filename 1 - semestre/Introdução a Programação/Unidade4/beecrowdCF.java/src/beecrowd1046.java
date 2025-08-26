import java.util.Scanner;

public class beecrowd1046 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int comeco = scan.nextInt();
        int termino = scan.nextInt();
        int tmp = 0;

        
                
            if(termino <= comeco){
                tmp = (termino + 24) - comeco  ;
                }
            else tmp = termino - comeco  ;          
            
        
        System.out.println("O JOGO DUROU "+ tmp + " HORA(S)");
        scan.close();
    }
    
}
