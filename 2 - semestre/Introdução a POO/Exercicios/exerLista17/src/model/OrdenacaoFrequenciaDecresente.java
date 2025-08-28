/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Comparator;
import java.util.Map;

/**
 *
 * @author Lc Martendal
 */
public class OrdenacaoFrequenciaDecresente implements Comparator<Map.Entry<String, Integer>>{

    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        if(o1.getValue() < o2.getValue()){
            return +1;
        }else if (o1.getValue() > o2.getValue()){
            return -1;
        }
        return o1.getKey().compareTo(o2.getKey());
    }
    
}
