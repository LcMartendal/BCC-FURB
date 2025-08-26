/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Comparator;

/**
 *
 * @author Lc Martendal
 */
public class ComparadorHora implements Comparator<Movimento>{

    @Override
    public int compare(Movimento o1, Movimento o2) {
        return o1.getHora().compareTo(o2.getHora());
    }

    
    
}
