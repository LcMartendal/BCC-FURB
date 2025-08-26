import java.util.Scanner;

public class beecrowd2766 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = " ", terceiro = "", setimo = "", nono = "";

        for(int i = 0; i < 10; i++){

            nome = scan.next();

            if( i == 2 ){
                terceiro = nome; 
            }
            if( i == 6){
                setimo = nome;
            }
            if( i == 8){
                nono = nome;
            }
        }
        System.out.println("");
        System.out.println(terceiro);
        System.out.println(setimo);
        System.out.println(nono);
        scan.close();
    }
    
}
