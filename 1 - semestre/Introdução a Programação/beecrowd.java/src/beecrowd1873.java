import java.util.Scanner;

public class beecrowd1873 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int C = scan.nextInt(), finalizar = 1;
        String escolha1 = " ", escolha2 = " ";

        for(int i = 0; i < C; i++){

        while(finalizar != 0){    
            escolha1 = scan.next();                      
            escolha2 = scan.next();
            
        
            if(escolha1.equals("tesoura") && escolha2.equals("tesoura")||escolha1.equals("papel") && escolha2.equals("papel")||
            escolha1.equals("pedra") && escolha2.equals("pedra")||escolha1.equals("lagarto") && escolha2.equals("lagarto")||
            escolha1.equals("spock") && escolha2.equals("spock")){
                System.out.println("empate");
            }else if(escolha1.equals("tesoura") && escolha2.equals("papel") || escolha1.equals("tesoura") && escolha2.equals("lagarto")){
                System.out.println("rajesh");
            }else if(escolha2.equals("tesoura") && escolha1.equals("papel") || escolha2.equals("tesoura") && escolha1.equals("lagarto")){
                System.out.println("sheldon");
            }else if(escolha1.equals("papel") && escolha2.equals("pedra") || escolha1.equals("papel") && escolha2.equals("spock")){
                System.out.println("rajesh");
            }else if(escolha2.equals("papel") && escolha1.equals("pedra") || escolha2.equals("papel") && escolha1.equals("spock")){
                System.out.println("sheldon");
            }else if(escolha1.equals("pedra") && escolha2.equals("lagarto") || escolha1.equals("pedra") && escolha2.equals("tesoura")){
                System.out.println("rajesh");
            }else if(escolha2.equals("pedra") && escolha1.equals("lagarto") || escolha2.equals("pedra") && escolha1.equals("tesoura")){
                System.out.println("sheldon");
            }else if(escolha1.equals("lagarto") && escolha2.equals("spock") || escolha1.equals("lagarto") && escolha2.equals("papel")){
                System.out.println("rajesh");
            }else if(escolha2.equals("lagarto") && escolha1.equals("spock") || escolha2.equals("lagarto") && escolha1.equals("papel")){
                System.out.println("sheldon");
            }else if(escolha1.equals("spock") && escolha2.equals("tesoura") || escolha1.equals("spock") && escolha2.equals("pedra")){
                System.out.println("rajesh");
            }else if(escolha2.equals("spock") && escolha1.equals("tesoura") || escolha2.equals("spock") && escolha1.equals("pedra")){
                System.out.println("sheldon");
            } 
            finalizar = 0;          
            }
            finalizar++;
        }

        scan.close();
        
    }
    
}
