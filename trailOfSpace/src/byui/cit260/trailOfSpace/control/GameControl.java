/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.control;

import byui.cit260.trailOfSpace.model.Game;
import byui.cit260.trailOfSpace.model.Inventory;
import byui.cit260.trailOfSpace.model.Item;
import byui.cit260.trailOfSpace.model.Map;
import byui.cit260.trailOfSpace.model.Player;
import java.util.ArrayList;
import trailofspace.TrailOfSpace;

/**
 *
 * @author landonwright
 */
public class GameControl {
    
    

    public static Player createPlayer(String playersName) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** createPlayer function called ***");
        
        if(playersName == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        TrailOfSpace.setPlayer(player);
        
        return player;
        
    }

    public static void createNewGame(Player player) {
        
        Game game = new Game(); //create new game 
        TrailOfSpace.setCurrentGame(game); //save in TrailOfSpace
        
        game.setPlayer(player); //save player in game
        
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventoryList(inventoryList);
        
        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); //save map in game
        
        //move actors to starting position in map
        MapControl.moveActorsToStartingLocation(map);
    }

    public static InventoryItem[] createInventoryList() {
    
        InventoryItem[] inventory = new InventoryItem[2];
        
        InventoryItem healthUpgrade = new InventoryItem();
        healthUpgrade.setDescription("Increase Max Health");
        healthUpgrade.setQuantity(0);
        healthUpgrade.setItemEffectValue(20);
        inventory[0] = healthUpgrade;
        inventory[Item.healthUpgrade.Ordinal()] = healthUpgrade;
        
        InventoryItem attackUpgrade = new InventoryItem();
        attackUpgrade.setDescription("Increase Max Attack");
        attackUpgrade.setQuantity(0);
        attackUpgrade.setItemEffectValue(15);
        inventory[1] = attackUpgrade;
        inventory[Item.attackUpgrade.Ordinal()] = attackUpgrade;
        
        InventoryItem healthRestore = new InventoryItem();
        healthRestore.setDescription("Restore Health");
        healthRestore.setQuantity(0);
        healthRestore.setItemEffectValue(20);
        inventory[2] = healthRestore;
        inventory[Item.healthRestore.Ordinal()] = healthRestore;
        
        InventoryItem attackIncrease = new InventoryItem();
        attackIncrease.setDescription("Increase attack temporarily");
        attackIncrease.setQuantity(0);
        attackIncrease.setItemEffectValue(20);
        inventory[3] = attackIncrease;
        inventory[Item.attackIncrease.Ordinal()] = attackIncrease;
        
        InventoryItem spaceMine = new InventoryItem();
        spaceMine.setDescription("Exploding Space Mine, does 40 damage.");
        spaceMine.setQuantity(0);
        spaceMine.setItemEffectValue(40);
        inventory[4] = spaceMine;
        inventory[Item.spaceMine.Ordinal()] = spaceMine;
        
        
        
        return inventory;
        
    }
    
    

    public static InventoryItem[] getSortedInventoryList() {
        InventoryItem[] originalInventoryList = TrailOfSpace.getCurrentGame().getInventory();
        
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1; i++) {
            for (int j = 0; j < inventoryList.length-1-i; j++){
                if (inventoryList[j].getDescription().compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempInventoryItem;
                }
                
            }
        }  
        return inventoryList;
    }
    
    public void startNewGame(){
    
    }
    
    public void initialize(){
    
    }
    
    public void saveGame(){
    
    }
    
    public void loadGame(){
    
    }
    
    public void createNewPlayer(){
    
    }
}
