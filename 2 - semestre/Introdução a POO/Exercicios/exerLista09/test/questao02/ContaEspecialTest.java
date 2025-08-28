/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package questao02;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Lc Martendal
 */
public class ContaEspecialTest {
    
    ContaBancaria cb;
    ContaEspecial cE;
    
    public ContaEspecialTest() {
    }

    @Before
    public void iniciarContexto(){
        cb = new ContaBancaria();
        cE = new ContaEspecial();
        
    }
    @Test
    public void test1() {
        
 
        cE.depositar(1000);
        cE.sacar(250);
        
        assertEquals(2, cE.getContaBancaria().size());
        
        Movimento mov1 = cE.getContaBancaria().get(0);
        
        assertEquals("",TipoMovimento.CREDITO, mov1.getTpMovimento());
        assertEquals("",1000, mov1.getValor(), 0.01);
        
        Movimento mov2 = cE.getContaBancaria().get(1);
        
        assertEquals("",TipoMovimento.DEBITO, mov2.getTpMovimento());
        assertEquals("",250, mov2.getValor(), 0.01);
        
        
    }
    
}
