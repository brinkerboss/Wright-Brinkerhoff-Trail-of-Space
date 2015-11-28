/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.control;

import byui.cit260.trailOfSpace.exceptions.BattleControlException;

/**
 *
 * @author animejedifreak
 */
public class BattleControl {
    
        int characterHealth = ;
        int characterAttack;
        int enemyHealth;
        int enemyAttack;
        
    public static void battle() {
    
       
        try {
        this.calcOutcome(characterHealth, characterAttack, enemyHealth, enemyAttack);
        }
        catch (BattleControlException me){
            System.out.println(me.getMessage());
        }
        /*switch (result) {
            case -1:
                System.out.println("Health is out of bounds");
                break;
            case -2:
                System.out.println("Attack is out of bounds");
                break;
            case -4:
                System.out.println("Character will win the battle!");
                break;
            case -5:
                System.out.println("The enemy will win the battle!");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }*/
    
    }
    
    public static void characterAttack() {
       // int health = enemy.getHealth();
       // int attack = hero.getAttack(;
       // health -= attack;
       //enemy.setHealth(health); 
        
    }
    
    public static void characterDefend() {
    
       // health += increaseAmount;
       // return health;
    }
    
    public static int enemyAttack(int health, int attack) {
    
        health -= attack;
        return health;
    }
    
    public static int enemyDefend(int health, int increaseAmount) {
    
        health += increaseAmount;
        return health;
    }
    
    
    public static int calcOutcome (int characterHealth, int characterAttack, int enemyHealth, int enemyAttack) throws BattleControlException{
        
        if ((characterHealth > 999 || enemyHealth > 999) || (characterHealth < 1 || enemyHealth < 1)) {  

            throw new BattleControlException("Health is out of bounds. Please enter a valid number."); // health for character or enemy is out of bounds
        }
        if ((characterAttack > 499 || enemyAttack > 499) || (characterAttack < 1 || enemyAttack < 1)) {

            throw new BattleControlException("Attack is out of bounds. Please enter a valid number."); //attack for character or enemy is out of bounds
        }
        
        //if (characterAttack != (int)characterAttack || characterHealth != (int)characterHealth || enemyAttack != (int)enemyAttack || enemyHealth != (int)enemyHealth) { //validate input
   
        //return -3;
        //}

          

        int outcome = ((enemyHealth / characterAttack) - (characterHealth / enemyAttack));

        if (outcome < 0) {
	
	throw new BattleControlException("The player's character will win the battle!"); //player's character will win the battle
        }
        if (outcome == 0) {
            return -5;
        }
        else {
	throw new BattleControlException("The enemy will win the battle!"); //enemy will win the battle
                }
        
    }
    
}
