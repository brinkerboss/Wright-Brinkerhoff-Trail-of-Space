/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.control;

/**
 *
 * @author animejedifreak
 */
public class InventoryItem {
    private static String description;
    private static int itemEffectValue;
    private static int quantity;

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
        InventoryItem.quantity = quantity;
    }
    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        InventoryItem.description = description;
    }

    public static int getItemEffectValue() {
        return itemEffectValue;
    }

    public static void setItemEffectValue(int itemEffectValue) {
        InventoryItem.itemEffectValue = itemEffectValue;
    }

    
    
}
