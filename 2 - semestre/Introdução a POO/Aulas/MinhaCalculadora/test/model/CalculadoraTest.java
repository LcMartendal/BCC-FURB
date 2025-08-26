/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Lc Martendal
 */
public class CalculadoraTest {
    Calculadora calc;
    
    public CalculadoraTest() {
    }

    @Before
    public void inicializarContexto(){
        calc = new Calculadora();
    }
    
    @Test
    public void testValidaNumerosInteiros() {
                
        int retorno = calc.somar(10, 75);
        
        assertEquals(85, retorno);
    }
    
    @Test
    public void testValidaSubtracaoInteiros(){
               
        assertEquals(65, calc.subtrair(100, 35));
    }
    
    @Test
    public void testValidaMultiplicacaoInteiros(){
        
        assertEquals(40, calc.multiplicar(5, 8));
    }
    
    @Test
    public void testValidaDivisaoInteiros(){
        
        assertEquals(5, calc.dividir(10, 2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testValidaDivisaoPorZero(){
        
         calc.dividir(10, 0);
    }
    
}
