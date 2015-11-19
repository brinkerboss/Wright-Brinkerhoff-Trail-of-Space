/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.model;

import java.io.Serializable;
import java.util.Objects;


public enum Inventory implements Serializable {
    
    Heal(20),
    AttackUpgrade(20),
    HealthUpgrade(20);
    
    
    private final int itemPoints;
    
    public int getItemPoints() {
        return itemPoints;
    }
    
    Inventory(int itemPoints) {
        
        this.itemPoints = itemPoints;       
    }
    
}
