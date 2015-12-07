/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trailofspace;

import byui.cit260.trailOfSpace.model.Battle;
import byui.cit260.trailOfSpace.model.Player;
import byui.cit260.trailOfSpace.model.Actor;
import byui.cit260.trailOfSpace.model.Game;
import byui.cit260.trailOfSpace.model.Location;
import byui.cit260.trailOfSpace.model.MathTrap;
import byui.cit260.trailOfSpace.model.Inventory;
import byui.cit260.trailOfSpace.model.Spaceship;
import byui.cit260.trailOfSpace.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author animejedifreak
 */
public class TrailOfSpace {
    
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        TrailOfSpace.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        TrailOfSpace.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        TrailOfSpace.inFile = inFile;
    }
    
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TrailOfSpace.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TrailOfSpace.player = player;
    }
        
        

    
    public static void main(String[] args) {
        
        try {
            
            //open character stream files for end user input and output
            TrailOfSpace.inFile = new BufferedReader(new InputStreamReader(System.in));
            
            TrailOfSpace.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "logfile.txt";
            TrailOfSpace.logFile = new PrintWriter(filePath);
            
        StartProgramView startProgramView = new StartProgramView();
        
        startProgramView.startProgram();
        } catch (Throwable e) {
            System.out.println("Exception: " + e.getMessage() +
                    "\nCause: " + e.getCause() +
                    "\nMessage: " + e.getMessage());
            e.printStackTrace();
            
        }
        finally {
            try {
                if (TrailOfSpace.inFile != null)
                    TrailOfSpace.inFile.close();
                if (TrailOfSpace.outFile !=null)
                    TrailOfSpace.outFile.close();
                if (TrailOfSpace.logFile !=null)
                    TrailOfSpace.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
            
            
        }
        
        
    }
    
}
