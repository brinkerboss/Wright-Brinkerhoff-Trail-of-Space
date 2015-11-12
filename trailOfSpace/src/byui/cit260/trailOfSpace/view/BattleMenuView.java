/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.view;

import byui.cit260.trailOfSpace.control.BattleControl;
import static byui.cit260.trailOfSpace.control.BattleControl.characterAttack;
import java.util.Scanner;

/**
 *
 * @author animejedifreak
 */
public class BattleMenuView extends View {
    BattleControl instance = new BattleControl();
    
    
    public BattleMenuView() {
        super ("\n"
            + "\n-----------------------------------------------------"
            + "\n| Battle Menu                                          |"
            + "\n-----------------------------------------------------"
            + "\nA - Attack"
            + "\nD - Defend"
            + "\nP - Predict outcome"
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
            case 'A':
                BattleControl.characterAttack();
                break;
            case 'D':
                BattleControl.characterDefend();
                break;
            case 'P':
                BattleControl.battle();
                break;
            case ' ':
                return false;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return true;
    }
    
}
