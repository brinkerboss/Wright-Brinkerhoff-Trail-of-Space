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
                System.out.println("");
                break;
            case 'M':
                System.out.println("");
                break;
            case 'U':
                System.out.println("");
                break;
            case 'Q':
                return false;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return true;
    }
}
