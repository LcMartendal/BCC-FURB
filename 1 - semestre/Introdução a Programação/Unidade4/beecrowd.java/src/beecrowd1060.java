import java.text.DecimalFormat;
import java.util.Scanner;

public class beecrowd1060 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");

        double vp = 0;
        double a=scan.nextDouble();
        if(a>0.0){
            vp = vp + 1;
        
        }
        double b=scan.nextDouble();
        if(b>0.0){
            vp = vp + 1;
        
        }
        double c=scan.nextDouble();
        if(c>0.0){
            vp = vp + 1;
       
        }
        double d=scan.nextDouble();
        if(d>0.0){
            vp = vp + 1;
       
        }
        double e=scan.nextDouble();
        if(e>0.0){
            vp = vp + 1;
       
        }
        double f=scan.nextDouble();
        if(f>0.0){
            vp = vp + 1;
        
        }
       
        System.out.println(df.format(vp) + " valores positivos");
      

      
    
                                 
                       

        }
             

        
        
    }
    

