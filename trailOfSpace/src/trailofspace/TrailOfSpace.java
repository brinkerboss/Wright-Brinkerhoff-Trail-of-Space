/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trailofspace;

import byui.cit260.trailOfSpace.model.Battle;
import byui.cit260.trailOfSpace.model.Player;
import byui.cit260.trailOfSpace.model.Character;
import byui.cit260.trailOfSpace.model.Location;
import byui.cit260.trailOfSpace.model.MathTrap;
import byui.cit260.trailOfSpace.model.inventory;
import byui.cit260.trailOfSpace.model.Spaceship;
import byui.cit260.trailOfSpace.view.StartProgramView;

/**
 *
 * @author animejedifreak
 */
public class TrailOfSpace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
        Player playerOne = new Player();
        
        playerOne.setName("Fred");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        
        Character characterOne = new Character();
        characterOne.setName("Bill");
        characterOne.setType("hero");
        characterOne.setHealth(20);
        characterOne.setAttack(5);
        
        
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
        
        
        
        Location locationOne = new Location();
        locationOne.setRow(4);
        locationOne.setColumn('B');
        locationOne.setVisited("Visited");
        locationOne.setLocationType("Space");
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        
        Battle battleOne = new Battle();
        battleOne.setTurnNumber(2);
        
        String battleInfo = battleOne.toString();
        System.out.println(battleInfo);
        
        MathTrap mathTrapOne = new MathTrap();
        mathTrapOne.setEquation("4 + 4");
        mathTrapOne.setSolution(8);
        
        String mathTrapInfo = mathTrapOne.toString();
        System.out.println(mathTrapInfo);
        */
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
    }
    
}
