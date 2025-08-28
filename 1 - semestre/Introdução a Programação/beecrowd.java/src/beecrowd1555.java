import java.util.Scanner;

public class beecrowd1555 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        double rafael = 0, beto = 0, carlos = 0, x = 0, y = 0, ganhador = 0;

        for(int i = 0; i < N; i++){
            
            x = scan.nextDouble();
            y = scan.nextDouble();

            rafael =  Math.pow((3*x), 2) + Math.pow(y, 2);
            beto = 2 * Math.pow(x, 2) + Math.pow((5*y), 2);
            carlos = ((-100) * x) + Math.pow(y, 3);

            ganhador = Math.max(carlos, Math.max(rafael, beto));
            if(ganhador == rafael){
                System.out.println("Rafael ganhou");
            }else if(ganhador == beto){
                System.out.println("Beto ganhou");
            }else System.out.println("Carlos ganhou");

            
        }
        scan.close();
    }
    
}
