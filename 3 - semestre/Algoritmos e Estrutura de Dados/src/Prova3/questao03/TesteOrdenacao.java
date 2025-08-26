package Prova3.questao03;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;



public class TesteOrdenacao {
    @Test
    public void teste01(){
        Integer[] dados = {70, 2, 88, 15, 90, 30};
        OrdenacaoBolha<Integer> bolha = new OrdenacaoBolha<>();
        bolha.setInfo(dados);
        bolha.ordenar();
        bolha.ordenarDecrescente();

        Integer[] esperado = {90, 80, 70, 30, 15, 2};
        assertArrayEquals(esperado, bolha.getInfo());
    }
}
