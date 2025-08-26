import java.util.Scanner;

public class Uni5Exer12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdLinhas = scan.nextInt();
        int num = 1;
        for(int i = 0; i < qtdLinhas; i++){
            for(int j = 0; j < i; j++){
                String spaces = num < 10 ? "  " : " ";
                System.out.print(num + spaces);
                num++;
            }
            System.out.println();
        }
        scan.close();
    }
    
}
