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
public class FuncionarioTest {
    Funcionario func;
    public FuncionarioTest() {
    }
    
    @Before
    public void incializarContexto(){
        func = new Funcionario(null, 0);
    }
    
    @Test
    public void teste1VerificarCategoriaPrimeiraFaixa() {
        
        func.setSalario(850);
        assertEquals(FaixaIrpf.PRIMEIRA, func.identificarFaixaIrpf() );
    }
    
    @Test
    public void teste1VerificarCalculoSalarioPrimeiraFaixa() {
        
        func.setSalario(850);
        assertEquals(0.00, func.calcIrpf(), 0.01);
    }
    
    @Test
    public void teste2VerificarCategoriaPrimeiraFaixa() {
        
        func.setSalario(1903.98);
        assertEquals(FaixaIrpf.PRIMEIRA, func.identificarFaixaIrpf() );
    }
    
    @Test
    public void teste2VerificarCalculoSalarioPrimeiraFaixa() {
        
        func.setSalario(1903.98);
        assertEquals(0.00, func.calcIrpf(), 0.01);
    }
    
    @Test
    public void teste1VerificarCategoriaSegundaFaixa() {
        
        func.setSalario(1903.99);
        assertEquals(FaixaIrpf.SEGUNDA, func.identificarFaixaIrpf());
    }
    
    @Test
    public void teste1VerificarCalculoSalarioSegundaFaixa() {
        
        func.setSalario(1903.99);
        assertEquals(0, func.calcIrpf(), 0.01);
    }
    
    @Test
    public void teste2VerificarCategoriaSegundaFaixa() {
        
        func.setSalario(2000);
        assertEquals(FaixaIrpf.SEGUNDA, func.identificarFaixaIrpf());
    }
    
    @Test
    public void teste2VerificarCalculoSalarioSegundaFaixa() {
        
        func.setSalario(2000);
        assertEquals(7.20, func.calcIrpf(), 0.01);
    }
    
    @Test
    public void teste3VerificarCategoriaSegundaFaixa() {
        
        func.setSalario(2826.65);
        assertEquals(FaixaIrpf.SEGUNDA, func.identificarFaixaIrpf());
    }
    
    @Test
    public void teste3VerificarCalculoSalarioSegundaFaixa() {
        
        func.setSalario(2826.65);
        assertEquals(69.20, func.calcIrpf(), 0.01);
    }
    
    @Test
    public void teste1VerificarCategoriaTerceiraFaixa() {
        
        func.setSalario(2826.66);
        assertEquals(FaixaIrpf.TERCEIRA, func.identificarFaixaIrpf());
    }
    
    @Test
    public void teste1VerificarCalculoSalarioTerceiraFaixa() {
        
        func.setSalario(2826.66);
        assertEquals(69.20, func.calcIrpf(), 0.01);
    }
    
    @Test
    public void teste2VerificarCategoriaTerceiraFaixa() {
        
        func.setSalario(3000);
        assertEquals(FaixaIrpf.TERCEIRA, func.identificarFaixaIrpf());
    }
    
    @Test
    public void teste2VerificarCalculoSalarioTerceiraFaixa() {
        
        func.setSalario(3000);
        assertEquals(95.20, func.calcIrpf(), 0.01);
    }
    
    @Test
    public void teste3VerificarCategoriaTerceiraFaixa() {
        
        func.setSalario(3751.05);
        assertEquals(FaixaIrpf.TERCEIRA, func.identificarFaixaIrpf());
    }
    
    @Test
    public void teste3VerificarCalculoSalarioTerceiraFaixa() {
        
        func.setSalario(3751.05);
        assertEquals(207.86, func.calcIrpf(), 0.01);
    }
    
    @Test
    public void teste1VerificarCategoriaQuartaFaixa() {
        
        func.setSalario(3751.06);
        assertEquals(FaixaIrpf.QUARTA, func.identificarFaixaIrpf());
    }
    
    @Test
    public void teste1VerificarCalculoSalarioQuartaFaixa() {
        
        func.setSalario(3751.06);
        assertEquals(207.86, func.calcIrpf(), 0.01);
    }
    
    @Test
    public void teste2VerificarCategoriaQuartaFaixa() {
        
        func.setSalario(4000);
        assertEquals(FaixaIrpf.QUARTA, func.identificarFaixaIrpf());
    }
    
    @Test
    public void teste2VerificarCalculoSalarioQuartaFaixa() {
        
        func.setSalario(4000);
        assertEquals(263.87, func.calcIrpf(), 0.01);
    }
    
    @Test
    public void teste3VerificarCategoriaQuartaFaixa() {
        
        func.setSalario(4664.68);
        assertEquals(FaixaIrpf.QUARTA, func.identificarFaixaIrpf());
    }
    
    @Test
    public void teste3VerificarCalculoSalarioQuartaFaixa() {
        
        func.setSalario(4664.68);
        assertEquals(413.42, func.calcIrpf(), 0.01);
    }
    
    @Test
    public void teste1VerificarCategoriaQuintaFaixa() {
        
        func.setSalario(4664.69);
        assertEquals(FaixaIrpf.QUINTA, func.identificarFaixaIrpf());
    }
    
    @Test
    public void teste1VerificarCalculoSalarioQuintaFaixa() {
        
        func.setSalario(4664.69);
        assertEquals(413.42, func.calcIrpf(), 0.01);
    }
    
    @Test
    public void teste2VerificarCategoriaQuintaFaixa() {
        
        func.setSalario(5000);
        assertEquals(FaixaIrpf.QUINTA, func.identificarFaixaIrpf());
    }
    
    @Test
    public void teste2VerificarCalculoSalarioQuintaFaixa() {
        
        func.setSalario(5000);
        assertEquals(505.64, func.calcIrpf(), 0.01);
    }
        
    @Test(expected = IllegalArgumentException.class)
    public void testeRecusarSalarioNegativo(){
        func.setSalario(-100);
        
    }  
    
    
}
