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
public class HelpMenuView extends View {
    
    public HelpMenuView () {
        super("\n"
            + "\n-----------------------------------------------------"
            + "\n| Help Menu                                          |"
            + "\n-----------------------------------------------------"
            + "\nG - What is the goal of the game?"
            + "\nM - How to move"
            + "\nU - How to upgrade"
            + "\nQ - Quit"
            + "\n-----------------------------------------------------"
            + "\n"
            + "Enter your selection below");
    }
    private GameMenuView New;
            

    
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'G':
                this.console.println("");
                break;
            case 'M':
                this.console.println("");
                break;
            case 'U':
                this.console.println("");
                break;
            case 'Q':
                return false;
            default:
                ErrorView.display(this.getClass().getName(),
                            "*** Invalid selection *** Try again");
                break;
        }
        return true;
    }
}
