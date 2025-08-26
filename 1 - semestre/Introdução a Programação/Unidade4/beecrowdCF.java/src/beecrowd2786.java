import java.util.Scanner;

public class beecrowd2786 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int L = scan.nextInt();
        int C = scan.nextInt();
        int qtd_LJT1 = 0;
        int qtd_LJT2 = 0;

        qtd_LJT1 = (L * C) + ((L - 1) * (C - 1));
        qtd_LJT2 = ((L - 1) * 2) + ((C - 1) * 2);

        System.out.println(qtd_LJT1);
        System.out.println(qtd_LJT2);
        scan.close();

    }
    
}
