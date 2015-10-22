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
public class BattleControl {
    
    
    
    public int calcOutcome (int characterHealth, int characterAttack, int enemyHealth, int enemyAttack) {
        
        if ((characterHealth > 999 || enemyHealth > 999) || (characterHealth < 1 || enemyHealth < 1)) {  

            return -1; // health for character or enemy is out of bounds
        }
        if ((characterAttack > 499 || enemyAttack > 499) || (characterAttack < 1 || enemyAttack < 1)) {

            return -2; //attack for character or enemy is out of bounds
        }
        
        if (characterAttack != (int)characterAttack || characterHealth != (int)characterHealth || enemyAttack != (int)enemyAttack || enemyHealth != (int)enemyHealth) { //validate input
   
        return -3;
        }

          

        int outcome = ((enemyHealth / characterAttack) - (characterHealth / enemyAttack));

        if (outcome < 0) {
	
	return -4; //player's character will win the battle
        }
        else {
	return -5; //enemy will win the battle
                }
        
    }
    
}
