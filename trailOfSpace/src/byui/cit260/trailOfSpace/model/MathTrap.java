/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author animejedifreak
 */
public class MathTrap implements Serializable{
    
    private static String equation = "17 – 30 + 41";
    private int solution = 28;

    public MathTrap() {
    }

    public String getEquation() {
        return equation;
    }

    public void setEquation(String equation) {
        this.equation = equation;
    }

    public int getSolution() {
        return solution;
    }

    public void setSolution(int solution) {
        this.solution = solution;
    }

    @Override
    public String toString() {
        return "MathTrap{" + "equation=" + equation + ", solution=" + solution + '}';
    }

    
    
    
}
