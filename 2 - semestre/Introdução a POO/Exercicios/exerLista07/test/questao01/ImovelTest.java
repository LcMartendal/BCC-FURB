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
public class ImovelTest {
    Imovel im;
    Bairro b;
    
    public ImovelTest() {
    }

    @Before
    public void incializarContexto(){
        im = new Imovel();
        b = new Bairro();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void teste1AreaNegativa() {
        
        im.setArea(-5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void teste2AreaNaoEspecificada() {
        
        b.setCoeficienteIptu(1);
        b.setNome("Centro");
        im.setBairro(b);
        im.setArea(0);
        im.calcularIptu();   
        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void teste3FinalidadeNaoEspecificada() {
        
        b.setCoeficienteIptu(1);
        b.setNome("Centro");
        im.setBairro(b);
        im.setFinalidade(null);
        im.setArea(250);
        im.calcularIptu();   
        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void teste4BairroNaoEspecificada() {
        
        im.setBairro(null);
        im.setFinalidade(Finalidade.RESIDENCIAL);
        im.setArea(400);
        im.calcularIptu();   
     
    }
    
    @Test
    public void teste5CalcImpImovRsidenciais() {
        
        b.setCoeficienteIptu(1);
        im.setBairro(b);
        im.setFinalidade(Finalidade.RESIDENCIAL);
        im.setArea(400);
        
        double iptu = im.calcularIptu(); 
        assertEquals(400, iptu, 0.01 );
     
    }
    
    @Test
    public void teste6ImovComAreaAte100() {
        
        b.setCoeficienteIptu(1);
        im.setBairro(b);
        im.setFinalidade(Finalidade.COMERCIAL);
        im.setArea(80);
        
        double iptu = im.calcularIptu(); 
        assertEquals(500, iptu, 0.01 );
     
    }
    
    @Test
    public void teste7CalcImpImovComArea100Ate400() {
        
        b.setCoeficienteIptu(1);
        im.setBairro(b);
        im.setFinalidade(Finalidade.COMERCIAL);
        im.setArea(250);
        
        double iptu = im.calcularIptu(); 
        assertEquals(1000, iptu, 0.01 );
     
    }
    
    @Test
    public void teste8CalcImpImovComAreaApos400() {
        
        b.setCoeficienteIptu(1);
        im.setBairro(b);
        im.setFinalidade(Finalidade.COMERCIAL);
        im.setArea(500);
        
        double iptu = im.calcularIptu(); 
        assertEquals(1275, iptu, 0.01 );
     
    }
    
    @Test
    public void teste9CalcImpImovIndAte2000() {
        
        b.setCoeficienteIptu(1);
        im.setBairro(b);
        im.setFinalidade(Finalidade.INDUSTRIAL);
        im.setArea(2000);
        
        double iptu = im.calcularIptu(); 
        assertEquals(1000, iptu, 0.01 );
     
    }
    
    @Test
    public void teste10CalcImpImovIndApos2000() {
        
        b.setCoeficienteIptu(1);
        im.setBairro(b);
        im.setFinalidade(Finalidade.INDUSTRIAL);
        im.setArea(3000);
        
        double iptu = im.calcularIptu(); 
        assertEquals(1650, iptu, 0.01 );
     
    }
    
    @Test
    public void teste9CalcImpImovCoef2_5() {
        
        b.setCoeficienteIptu(2.5);
        im.setBairro(b);
        im.setFinalidade(Finalidade.RESIDENCIAL);
        im.setArea(500);
        
        double iptu = im.calcularIptu(); 
        assertEquals(1250, iptu, 0.01 );
     
    }
    
    
    
}
