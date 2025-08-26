/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package modelQ;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Lc Martendal
 */
public class PessoaTest {
    
    Pessoa p;
    public PessoaTest() {
    }
        
    @Before
    public void inicializa(){
        p = new Pessoa();
    }
    
    @Test
    public void test1() {
        p.setSalario(850);
        
        assertEquals(FaixaIRPF.PRIMEIRA, p.identificarFaixa());
    }
    
    @Test
    public void teste2() {
        p.setSalario(850);
        
        assertEquals(0, p.calculoIRPF(), 0.01);
    }
    
    @Test
    public void test3() {
        p.setSalario(1903.98);
        
        assertEquals(FaixaIRPF.PRIMEIRA, p.identificarFaixa());
    }
    
    @Test
    public void teste4() {
        p.setSalario(1903.98);
        
        assertEquals(0, p.calculoIRPF(), 0.01);
    }
    
    @Test
    public void teste5() {
        p.setSalario(1903.99);
        
        assertEquals(FaixaIRPF.SEGUNDA, p.identificarFaixa());
    }
    
    @Test
    public void teste6() {
        p.setSalario(1903.99);
        
        assertEquals(0, p.calculoIRPF(), 0.01);
    }
    
    @Test
    public void teste7() {
        p.setSalario(2000);
        
        assertEquals(7.20, p.calculoIRPF(), 0.01);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void teste8() {
        p.setSalario(-100);
        
        
    }
    
}
