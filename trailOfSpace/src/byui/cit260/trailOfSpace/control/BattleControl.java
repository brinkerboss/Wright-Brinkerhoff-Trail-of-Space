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
    
    int characterHealth;
    int characterAttack;
    int enemyHealth;
    int enemyAttack;
    
    public int calcOutcome (int characterHealth, int characterAttack, int enemyHealth, int enemyAttack) {
        
        if ((characterHealth > 999 || enemyHealth > 999) || (characterHealth < 1 || enemyHealth < 1)) {  

            return -1;
        }
        if ((characterAttack > 499 || enemyAttack > 499) || (characterAttack < 1 || enemyAttack < 1)) {

            return -2;
        }
        //if (isNotInt)

          //  return -3;

        int outcome = ((enemyHealth / characterAttack) - (characterHealth / enemyAttack));

        if (outcome < 0) {
	
	return -4;
        }
        else {
	return -5;
                }
        
    }
    
}
