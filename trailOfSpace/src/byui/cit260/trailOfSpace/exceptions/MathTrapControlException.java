/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.exceptions;

/**
 *
 * @author piprime
 */
public class MathTrapControlException extends Exception {

    public MathTrapControlException() {
    }

    public MathTrapControlException(String message) {
        super(message);
    }

    public MathTrapControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public MathTrapControlException(Throwable cause) {
        super(cause);
    }

    public MathTrapControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
