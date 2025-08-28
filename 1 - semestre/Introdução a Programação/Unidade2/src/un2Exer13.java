import java.util.Scanner;

public class un2Exer13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor=scan.nextInt();

        int c100 = valor/100;
        int c50 = (valor%100)/50;
        int c20 = (valor%50)/20;
        int c10 = (valor%20)/10;
        int c5 = (valor%10)/5;
        int c2 = (valor%5)/2;
        int c1 = (valor%2)/1;

        System.out.println(valor + "\r\n "+   
                              c100 +" nota(s) de R$ 100,00\r\n" + //
                            + c50 + " nota(s) de R$ 50,00\r\n" + //
                            + c20 + " nota(s) de R$ 20,00\r\n" + //
                            + c10 + " nota(s) de R$ 10,00\r\n" + //
                            + c5 + " nota(s) de R$ 5,00\r\n" + //
                            + c2 + " nota(s) de R$ 2,00\r\n" + //
                            + c1 + " nota(s) de R$ 1,00" );

    
           scan.close();
    }
    
}
