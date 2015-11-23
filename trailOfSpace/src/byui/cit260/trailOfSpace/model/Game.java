/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.model;


import byui.cit260.trailOfSpace.control.InventoryItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author landonwright
 */
public class Game implements Serializable{

    
   
    private String totalTime;
    private Player player;
    private Map map;
    
    

    


    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Game() {
    }
    
    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }
    
    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + '}';
    }

    public void setInventoryList(InventoryItem[] inventoryList) {
        }

    public InventoryItem[] getInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
       
}
