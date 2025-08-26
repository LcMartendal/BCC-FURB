public class Uni5Exer4 {
    public static void main(String[] args) {
        
        double s = 0;
        int cima=3, baixo = 2, inBaixo = 2;
        for(int i=1;i<=20;i++){
            s = s + (cima/(baixo*1.0));
            cima+=2;
            inBaixo+=2;
            baixo+=inBaixo;
        }System.out.println(s);
    }
    
}
