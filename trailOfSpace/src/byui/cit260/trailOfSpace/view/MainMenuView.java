/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.view;

import byui.cit260.trailOfSpace.control.GameControl;
import java.util.Scanner;
import trailofspace.TrailOfSpace;

/**
 *
 * @author animejedifreak
 */
public class MainMenuView {
    
    HelpMenuView helpMenu = new HelpMenuView();
    
    
    private final String MENU = "\n"
            + "\n-----------------------------------------------------"
            + "\n| Main Menu                                          |"
            + "\n-----------------------------------------------------"
            + "\nG - Start game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save Game"
            + "\n-----------------------------------------------------"
            + "\n"
            + "Enter your selection below";
    private GameMenuView New;
            

    public void displayMenu() {
        
        char selection = ' ';
        do {
            System.out.println(MENU);
      
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        } while (selection != 'E');
        
    }
   
    public String getInput() {
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);
        
        String input = null;
        
        while(!valid) {
            
            
            
          input = keyboard.nextLine();
          input = input.toUpperCase();
          input = input.trim();
        
          if (input.length() < 1) {
             System.out.println("Invalid - please enter a valid letter");
             continue;
        
          }
          break;
        
        }
    return input;
    }
    
    public void doAction(char choice) {
        
        switch (choice) {
            case 'N':
                this.startNewGame();
                break;
            case 'G':
                this.startExistingGame();
                break;
            case 'H':
                helpMenu.displayMenu();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(TrailOfSpace.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    

    private void startExistingGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    



}