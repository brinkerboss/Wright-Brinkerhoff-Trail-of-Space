/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import trailofspace.TrailOfSpace;


public abstract class View implements ViewInterface {
    
    private String promptMessage;
    
    protected final BufferedReader keyboard = TrailOfSpace.getInFile();
    protected final PrintWriter console = TrailOfSpace.getOutFile();
    
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {
        
        char selection = ' ';
        do {
            this.console.println(promptMessage);
      
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        } while (selection != 'Q');
        
    }
    
    @Override
    public String getInput() {
        boolean valid = false;
        
        String input = null;
        
        try {
        while(!valid) {
            
            
            
            
                input = this.keyboard.readLine();
                input = input.toUpperCase();
                input = input.trim();
                
                if (input.length() < 1) {
                    ErrorView.display(this.getClass().getName(),
                            "you must enter a value");
                    continue;
                    
                }
                break;
        }
            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            }
        
        
        
    return input;
    }
    
    // implement display and getInput functions in this superclass
}
