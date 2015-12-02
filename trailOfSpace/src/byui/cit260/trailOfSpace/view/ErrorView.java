/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.view;

import java.io.PrintWriter;
import trailofspace.TrailOfSpace;

/**
 *
 * @author piprime
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = TrailOfSpace.getOutFile();
    private static final PrintWriter logFile = TrailOfSpace.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "------------------------------------------"
                 + "\n- ERROR - " + errorMessage
                 + "\n------------------------------------------");
        
        //log file
        logFile.println(className + " - " + errorMessage);
    }
}
