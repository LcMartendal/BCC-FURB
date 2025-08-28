import java.util.Scanner;

public class un2Exer19 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("a");
        int a=scan.nextInt();
        System.out.println("b");
        int b=scan.nextInt();
        System.out.println("c");
        int c=scan.nextInt();
        System.out.println("d");
        int d=scan.nextInt();
        
        System.out.println((a=b) * (c=d));
        scan.close();

    }
    
}
