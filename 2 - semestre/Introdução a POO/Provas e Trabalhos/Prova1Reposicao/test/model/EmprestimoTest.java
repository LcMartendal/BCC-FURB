/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Lc Martendal
 */
public class EmprestimoTest {
    
    Emprestimo e;
    public EmprestimoTest() {
    }

    @Before
    public void inicializa(){
        e = new Emprestimo();
    }
    
    @Test
    public void test1() {
        e.setDataEmprestimo(LocalDate.of(2024, 12, 01));
        e.setDataDevolucao(LocalDate.of(2024, 12, 05));
        
        assertEquals(5, e.calcularValorDevido(), 0.01);
    }
    
    @Test
    public void test2() {
        e.setDataEmprestimo(LocalDate.of(2024, 12, 01));
        e.setDataDevolucao(LocalDate.of(2024, 12, 10));
        
        assertEquals(7, e.calcularValorDevido(), 0.01);
    }
    
    @Test
    public void test3() {
        e.setDataEmprestimo(LocalDate.of(2024, 12, 01));
        e.setDataDevolucao(LocalDate.of(2024, 12, 10));
        
        assertEquals(9, e.calcularDiasEmprestimo());
    }
    
}
