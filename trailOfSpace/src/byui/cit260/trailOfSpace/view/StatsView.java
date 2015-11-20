/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.view;

import static byui.cit260.trailOfSpace.model.Actor.Shepard;

/**
 *
 * @author animejedifreak
 */
public class StatsView extends View {
    
    public StatsView() {
        super ("\n"
            + "\n-----------------------------------------------------"
            + "\n| Stats                                          |"
            + "\n-----------------------------------------------------"
            + "\n Health:" + Shepard.getHealth()
            + "\n Attack:" + Shepard.getAttack()
            + "\nQ - Quit"
            + "\n-----------------------------------------------------"
            + "\n");
    }
    
     @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'Q':
                return false;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return true;
    }
    
    
    
    
}
