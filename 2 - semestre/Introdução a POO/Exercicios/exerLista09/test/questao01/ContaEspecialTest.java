/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package questao01;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Lc Martendal
 */
public class ContaEspecialTest {
    
    ContaEspecial cE;
    
    @Before
    public void iniciarContexto(){
        cE = new ContaEspecial();
    }
    
    public ContaEspecialTest() {
    }

    @Test
    public void test1SacarMaiorQueSaldo() {
        
        cE.setLimite_credito(100);
        cE.depositar(20);
        cE.sacar(50);
        
        assertEquals(-30, cE.getSaldo(), 0.01);
        
    }
    
     @Test
    public void test2SacarMaiorQueSaldoMenorLimCred() {
        
        cE.setLimite_credito(100);
        cE.depositar(20);
        cE.sacar(120);
                
        assertEquals(-100, cE.getSaldo(), 0.01);
        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test3SacarMaiorQueSaldoMaiorLimCred() {
        
        cE.setLimite_credito(100);
        cE.depositar(20);
        cE.sacar(120.01);
    }
    
}
