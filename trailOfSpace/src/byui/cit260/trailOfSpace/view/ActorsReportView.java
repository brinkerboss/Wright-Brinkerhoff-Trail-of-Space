/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.view;

import byui.cit260.trailOfSpace.model.Actor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import trailofspace.TrailOfSpace;

/**
 *
 * @author piprime
 */
public class ActorsReportView extends View {

    static String input = null;

    public ActorsReportView() {
        
        super("\n"
            + "\n                LIST OF ACTORS                  "           
            + "\n            NAME           LOCATION" 
            + "\n          " + Actor.values()[0]   
            + "\n          " + Actor.values()[1] + "Explore the map and find out!"
            + "\n          " + Actor.values()[2] + "Explore the map and find out!"
            + "\n          " + Actor.values()[3] + "Explore the map and find out!"
        );
    }
    
    public void printReport() {
       
        this.getFilePath();
        ActorsReportView();
       
    try {
            
            //open character stream files for end user input and output
            
            
            TrailOfSpace.outFile = new PrintWriter(input);
            
            TrailOfSpace.outFile = this.display();
            
        
        
        
        } catch (Throwable e) {
            ErrorView.display(this.getClass().getName(),
                            "Error printing report to file.");
            
        }
        finally {
            try {
                
                if (TrailOfSpace.outFile !=null)
                    TrailOfSpace.outFile.close();
                
            } catch (Exception e) {
                this.console.println("Error closing files");
                return;
            }
               
        }
        this.console.println("File was printed successfully to " + input + ".");
        
    }
    public String getInput() {
        boolean valid = false;
               
        try {
        while(!valid) {
            
                input = this.keyboard.readLine();
                //input = input.toUpperCase();
                input = input.trim();
                
                if (input.length() < 3) {
                    ErrorView.display(this.getClass().getName(),
                            "you must enter a valid pathname");
                    continue;
                    
                }
                break;
        }
            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            }
                
    return input;
    }
    
    public void getFilePath() {
    
        this.console.println("Please enter a filename where the report will be saved: ");
        this.getInput();
        
    }
    
}
