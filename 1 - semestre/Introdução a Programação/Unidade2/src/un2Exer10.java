import java.util.Scanner;

public class un2Exer10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);        
        
        System.out.println("Digite o tempo de duração do evento (em segundos)!");
        int durEvento = scan.nextInt();

        if(durEvento>=3600){
            int hora = durEvento/3600;
            durEvento = durEvento - (hora*3600);
            System.out.println("hora " + hora);
             if(durEvento>=60){
                 int min = durEvento/60;
                 durEvento = durEvento - (min*60);
                 System.out.println("min " + min);
                if (durEvento<60){
                    int seg = durEvento/1;
                    
                    System.out.println("seg " + seg);
                }
            }
        }else{
            System.out.println("nada informado!");
        }

       scan.close();         
    }
    
}
