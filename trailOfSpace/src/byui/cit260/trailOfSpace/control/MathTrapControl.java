/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.control;

import byui.cit260.trailOfSpace.exceptions.MathTrapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author animejedifreak
 */
public class MathTrapControl {
    

    public static void mathTrapOne(int solution) {
        if(solution != 28) {
            try {
                throw new MathTrapControlException("Incorrect! Try again!");
            } catch (MathTrapControlException ex) {
                Logger.getLogger(MathTrapControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    



 


    
    
}
