/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.control;

import byui.cit260.trailOfSpace.model.Map;

/**
 *
 * @author animejedifreak
 */
public class MapControl {

    static Map createMap() {
         
        Map map = new Map(20, 20);
        
        return map;
    }

    static void moveActorsToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void move(int shipPosition){
    
    }
    
    public boolean validLocation(String characterLocation, String position) {
        boolean isValid = false;
        
        return isValid;
    }
    
    public boolean visitInhabitableLocation(String characterLocation) {
        
        boolean isValid = false;
        
        return isValid;
    }
    
    public boolean visitItemLocation(String characterLocation) {
        
        boolean isValid = false;
        
        return isValid;
    }
    
    public boolean visitEnemyLocation(String characterLocation) {
        
        boolean isValid = false;
        
        return isValid;
    }
    
    public boolean visitMathLocation(String characterLocation) {
        
        boolean isValid = false;
        
        return isValid;
    }
}
