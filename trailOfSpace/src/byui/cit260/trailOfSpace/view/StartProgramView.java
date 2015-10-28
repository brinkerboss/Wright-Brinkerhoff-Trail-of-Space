/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.view;

import java.util.Scanner;

/**
 *
 * @author animejedifreak
 */
public class StartProgramView {
 
    public void startProgram() {
    
        this.displayBanner();
        
        String playersName = this.getPlayersName();
    }

    private void displayBanner() {
        System.out.println("\n\n*************************************************");
        
        System.out.println("Description");
        
        System.out.println("Description");
        
        System.out.println("\n\n*************************************************");
        
        
    }

    public String getPlayersName() {
        
        boolean valid = false;
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            
            System.out.println("Enter the player's name:");
            
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            if (playersName.length() < 2) {
             System.out.println("Invalid name - name must not be blank");
             continue;
                
            }
            break;
            
        }
        return playersName;
    }
    
    
    
}
