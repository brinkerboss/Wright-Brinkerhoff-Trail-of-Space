/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.view;

import byui.cit260.trailOfSpace.control.MathTrapControl;
import byui.cit260.trailOfSpace.exceptions.BattleControlException;
import byui.cit260.trailOfSpace.exceptions.MathTrapControlException;
import java.util.Scanner;

/**
 *
 * @author landonwright
 */
public class MathTrapOneView extends View{
    
    
        public void displayMathTrap() {
    
            System.out.println("You have encountered an Ancient Alien Math Trap!");
            System.out.println("You must solve the math problem in order to procede.");
            System.out.println("Enter the solution to the following equation:");
            System.out.println("17 – 30 + 41");
            
            
            
        }
    
    public String getInput(int solution) {
            boolean valid = false;
            
        
            String input = null;
        try {
            while(!valid) {
            
           
                input = this.keyboard.readLine();
                input = input.toUpperCase();
                input = input.trim();
        
                try {
                solution = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Error");
                }
                
                MathTrapControl.mathTrapOne(solution);
        
            
            continue;
        
            }
            } catch (Exception e) {
                System.out.println("Error reading input: " + e.getMessage());
            }
            return input;
        }
 

}
