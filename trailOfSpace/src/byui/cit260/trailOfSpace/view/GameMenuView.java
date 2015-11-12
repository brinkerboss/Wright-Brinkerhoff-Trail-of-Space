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
public class GameMenuView extends View {
    
    public GameMenuView() {
        
        super("\n"
            + "\n-----------------------------------------------------"
            + "\n| Game Menu                                          |"
            + "\n-----------------------------------------------------"
            + "\nV - View Map"
            + "\nI - View list of items in inventory"
            + "\nS - View ship stats"
            + "\nP - View player stats"
            + "\nM - Move to new location"
            + "\nX - Exit ship"
            + "\nE - Re-enter ship"
            + "\nU - Upgrade ship"
            + "\nH - Help"
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
            case 'V':
                System.out.println("");
                break;
            case 'I':
                System.out.println("");
                break;
            case 'S':
                System.out.println("");
                break;
            case 'P':
                System.out.println("");
                break;
            case 'M':
                System.out.println("");
                break;
            case 'X':
                System.out.println("");
                break;
            case 'E':
                System.out.println("");
                break;
            case 'U':
                System.out.println("");
                break;
            case 'H':
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
