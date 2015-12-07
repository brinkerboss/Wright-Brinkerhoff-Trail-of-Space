/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.control;

import byui.cit260.trailOfSpace.view.View;
import trailofspace.TrailOfSpace;

/**
 *
 * @author landonwright
 */
public class InventoryControl extends View {
  
    
    public void addToInventory(String inventoryItem, int amount) {

    }
    
    public void removeFromInventory(String inventoryItem, int amount) {
        
    }
    
    public static InventoryItem getMostPotentItem() {
        InventoryItem[] originalInventoryList = TrailOfSpace.getCurrentGame().getInventory();
        
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
        InventoryItem maxValue = inventoryList[0];
        
        for (InventoryItem item : inventoryList) {
            if (item.getItemEffectValue() > maxValue.getItemEffectValue()) {
                maxValue = item;
            }
        }
        
     
        return maxValue;
    }
    
    public static void displayMostPotentItem () {
        
        InventoryItem item = getMostPotentItem();
        
        this.console.println("Your Best Item is : " + item.getDescription());
    }
    
}