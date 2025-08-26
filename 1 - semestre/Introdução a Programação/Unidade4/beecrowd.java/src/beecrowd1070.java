import java.util.Scanner;

public class beecrowd1070 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = 0;
        
        for(y=0;y<=5;y++){
           
        if(x%2!=0){
            System.out.println(x);
            x++;
           
        }else if(x%2==0){
            x=x+1;
            System.out.println(x);
            x++;
            }
        }
        
        
        }

    }

