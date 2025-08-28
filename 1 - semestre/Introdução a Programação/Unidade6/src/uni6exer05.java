import java.util.Scanner;

public class uni6exer05 {
    

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in); 
            String[] rapaz = new String[5];
            String[] moca = new String[5]; 
            String[] Perguntas = {"Gosta de música sertaneja?", "Gosta de futebol?", "Gosta de seriados?", "Gosta de redes sociais?", "Gosta da Oktoberfest?"}; 
            lerRespostaRapaz(rapaz, Perguntas, scan);
            lerRespostaMoca(moca, Perguntas, scan);
            CalcularAfinidade(rapaz, moca);     

            
        }
        public static void lerRespostaRapaz(String[] rapaz, String[] Perguntas, Scanner scan) {
            for(int i = 0; i < rapaz.length; i++){
                System.out.println(Perguntas[i]);
                rapaz[i] = scan.next();
            }
        } 
        public static void lerRespostaMoca(String[] moca, String[] Perguntas, Scanner scan) {
            for(int i = 0; i < moca.length; i++){
                System.out.println(Perguntas[i]);
                moca[i] = scan.next();
            }     
            
        }
        public static void CalcularAfinidade(String[] moca, String[] rapaz ) {
            int pontos = 0;     
            
            for(int i = 0; i < 5; i++){
                if(moca[i].trim().equalsIgnoreCase(rapaz[i])){
                    pontos+=3;
                }else if (moca[i].trim().equalsIgnoreCase("Sim") && rapaz[i].trim().equalsIgnoreCase("Nao") || moca[i].trim().equalsIgnoreCase("Nao") && rapaz[i].trim().equalsIgnoreCase("Nao")) {
                    pontos-=2;
                }else {
                    pontos+=1;
                }
        
            }
                        
            
                if (pontos == 15){
                    System.out.println("Casem");
                }else if (pontos >= 10 && pontos <= 14){
                    System.out.println("Voces tem muita coisa em comum!");
                }else if (pontos >= 5 && pontos <= 9 ){
                    System.out.println("Talvez não de certo");
                }else if (pontos <= 0 && pontos <= 4){
                    System.out.println("Vale um encontro");
                }else if (pontos <= -1 && pontos >= -9){
                    System.out.println("Melhor não perder tempo");
                }else {
                    System.out.println("Voces se odeiam!");
                }
        }
            
            
}


