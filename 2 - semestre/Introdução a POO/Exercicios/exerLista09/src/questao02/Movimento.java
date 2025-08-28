/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Lc Martendal
 */
public class Movimento {
    private double valor;
    private TipoMovimento tpMovimento;
    private LocalDate data;
    private LocalTime hora;

    public Movimento(double valor, TipoMovimento tpMovimento) {
        this.valor = valor;
        this.tpMovimento = tpMovimento;
        this.data = LocalDate.now();
        this.hora = LocalTime.now();
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public double getValor() {
        return valor;
    }
   
    public TipoMovimento getTpMovimento() {
        return tpMovimento;
    }

    
    
            
    
    
}
    
