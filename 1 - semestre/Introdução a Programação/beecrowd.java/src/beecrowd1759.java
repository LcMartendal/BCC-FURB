import java.util.Scanner;

public class beecrowd1759 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if(0 < n && n < 1000000){
            for(int i = 0; i < (n - 1); i ++){
                System.out.print("Ho" + " ");

            }
            System.out.println("Ho" + "!");
        }
        scan.close();
    }
}
