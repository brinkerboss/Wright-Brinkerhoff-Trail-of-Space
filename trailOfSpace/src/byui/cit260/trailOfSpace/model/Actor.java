/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author animejedifreak
 */
public enum Actor implements Serializable {
    
    Shepard("The sentinel of his star system. Tasked to warn the nearby planets of danger."),
    SmallEnemy("A small space creature, usually easily defeated."),
    MediumEnemy("A medium strength enemy, moderately difficult to deafeat."),
    BigEnemy("A boss, the most difficult to fight and survive.");
    
    
    private final String description;
    private final Point coordinates;

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
    
    
    private int health;
    private int attack;
    
    

    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }
    
    

    public int getHealth() {
        return health;
    }

    
    public int getAttack() {
        return attack;
    }

    
    

    @Override
    public String toString() {
        return "Character{" + ", health=" + health + ", attack=" + attack + '}';
    }

    
    
    
    
    
}
