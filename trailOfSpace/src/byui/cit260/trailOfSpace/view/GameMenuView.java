/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.view;

import byui.cit260.trailOfSpace.control.GameControl;
import byui.cit260.trailOfSpace.control.InventoryItem;
import java.util.Scanner;
import trailofspace.TrailOfSpace;

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
            + "\nS - View player stats"
            + "\nM - Move to new location"         
            + "\nU - Upgrade"
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
                this.displayMap();
                break;
            case 'I':
                this.viewInventory();
                break;
            case 'S':
                this.viewStats();
                break;
            
            case 'M':
                this.move();
                break;
            case 'U':
                this.upgrade();
                break;
            case 'H':
                ;
                break;
            case 'Q':
                return false;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return true;
    }

    private void viewInventory() {
        
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t" + "Quantity");
        
        for (InventoryItem inventoryItem : inventory) {
            System.out.println(inventoryItem.getDescription() + "\t   " +
                                inventoryItem.getQuantity());
        }
        
    }

    public void displayMap() {
      TrailOfSpace.getCurrentGame().getMap();
    }

    public void viewStats() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void upgrade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
