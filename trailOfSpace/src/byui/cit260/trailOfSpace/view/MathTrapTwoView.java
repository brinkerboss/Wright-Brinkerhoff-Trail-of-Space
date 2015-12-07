/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.view;

import java.util.Scanner;

/**
 *
 * @author landonwright
 */
public class MathTrapTwoView extends View {
    
    public void displayMathTrap() {
    
            System.out.println("You have encountered an Ancient Alien Math Trap!");
            System.out.println("You must solve the math problem in order to procede.");
            System.out.println("Enter the solution to the following equation:");
            System.out.println("7 * 9 / 3");
            
            
            
        }
    
    public String getInput() {
            boolean valid = false;
            
        
            String input = null;
            try {
            while(!valid) {
            
           
                input = this.keyboard.readLine();
                input = input.toUpperCase();
                input = input.trim();
        
                int solution = Integer.parseInt(input);
          
                if (solution != 21) {
                    System.out.println("Incorrect answer, please try again.");
                continue;
        
                }
            break;
        
            }
            } catch (Exception e) {
                System.out.println("Error reading input: " + e.getMessage());
            }
            return input;
        }
 

}
