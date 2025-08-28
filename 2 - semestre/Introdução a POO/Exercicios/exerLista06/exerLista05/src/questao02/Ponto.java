/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02;

/**
 *
 * @author Lc Martendal
 */
public class Ponto {
    
    private int x ;    
    private int y ;

    /**
     * Este construtor inicializa as variaveis com 0
     */
    public Ponto() {
        int x = 0;    
        int y = 0;
    }
    /**
     * Este construtor indica o que se deve informar
     * @param x indica o valor de x
     * @param y indica o valor de y
     */
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * Este metodo identifica aonde esta posicionado as coordenadas
     * @return Retorna em que
        quadrante do plano cartesiano o ponto se encontra
     */
    public  Quadrante identificarQuadrante(){
        
        if(this.x > 0 && this.y > 0){
           return Quadrante.PRIMEIRO;
        }else if(this.x < 0 && this.y > 0){
            return Quadrante.SEGUNDO;
        }else if(this.x < 0 && this.y < 0){
            return Quadrante.TERCEIRO;
        }else if(this.x > 0 && this.y < 0){
            return Quadrante.QUARTO;
        }else{
            return Quadrante.NENHUM;
        }
        
    }
    
    /**
     * Este metodo mostra se a coordenada esta incindindo em x
     * @return Retorna true (para que sim) ou false(para que nao)
     */
    public boolean estaIncidindoSobreX(){
        boolean incidindoX;
        if(this.x == 0){
            incidindoX = true;
        }else{
            incidindoX = false;
        }
        return incidindoX;
        
    }
    
    /**
     * Este metodo mostra se a coordenada esta incindindo em y
     * @return Retorna true (para que sim) ou false(para que nao)
     */
    public boolean estaIncidindoSobreY(){
        boolean incidindoY;
        if(this.y == 0){
            incidindoY = true;
        }else{
            incidindoY = false;
        }
        return incidindoY;
    }
    
    /**
     * Este metodo pega um outro ponto informado pelo usuario
     para pegar coordenada do x2 e do y2
     * @param outroPonto 
     * @return Retorna o calculo da distancia entre dois pontos
     */
    public double calcularDistancia(Ponto outroPonto){
        
        int x1 = this.x;
        int x2 = outroPonto.getX();
        int y1 = this.y;
        int y2 = outroPonto.getY();
        
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    
    /**
     * Este metodo pega dois pontos informados pelo usuario
     * @param p1 sera usado para o ponto x2
     * @param p2 sera usado para o ponto y2
     * @return Retorna o calculo da distancia entre dois pontos
     */
    public static double  calcularDistancia(Ponto p1, Ponto p2){
        
        return p1.calcularDistancia(p2);
    }
}
