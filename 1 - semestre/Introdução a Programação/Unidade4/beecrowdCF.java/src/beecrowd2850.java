import java.util.Scanner;

public class beecrowd2850 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);      
        
        while(scan.hasNext()){

            String perna = scan.nextLine();            

            if(perna.equalsIgnoreCase("esquerda")){   
                System.out.println("ingles \n");

            }else if(perna.equalsIgnoreCase("direita")){
                System.out.println("frances \n");

            }else if(perna.equalsIgnoreCase("nenhuma")){
                System.out.println("portugues \n");

            }else if(perna.equalsIgnoreCase("as duas")){
                System.out.println("caiu \n");
            }
            
       }      
        scan.close();

    }
    
}
