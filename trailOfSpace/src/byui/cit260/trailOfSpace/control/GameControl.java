/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.control;

import byui.cit260.trailOfSpace.model.Game;
import byui.cit260.trailOfSpace.model.Inventory;
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
        
        ArrayList<Inventory> inventoryList = GameControl.createInventoryList();
        game.setInventoryList(inventoryList);
        
        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); //save map in game
        
        //move actors to starting position in map
        MapControl.moveActorsToStartingLocation(map);
    }

    private static ArrayList<Inventory> createInventoryList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
