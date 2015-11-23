/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.model;

import java.io.Serializable;
import java.util.Objects;
import trailofspace.TrailOfSpace;

/**
 *
 * @author animejedifreak
 */
public class Location implements Serializable{
    
    private int row;
    private int column;
    private boolean visited;
    private String locationType;
    private Battle battle;
    private MathTrap mathtrap;

    public MathTrap getMathtrap() {
        return mathtrap;
    }

    public void setMathtrap(MathTrap mathtrap) {
        this.mathtrap = mathtrap;
    }

    public Battle getBattle() {
        return battle;
    }

    public void setBattle(Battle battle) {
        this.battle = battle;
    }
    
    
    
    public Location() {
    }

    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", locationType=" + locationType + '}';
    }

    private static Scene[] createScene() {
        Game game = TrailOfSpace.getCurrentGame();
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription("Greetings Sentinel Shepard. Your job in this quadrant is to protect the "
                + "inhabitants of nearby planets from those that mean them harm.  Inspect every space for enemies and destroy them!"); 
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription("Well done Sentinel Shepard! Your bravery has ensured the"
                + "safety of nearby inhabitants. YOU ARE A HERO!");
        scenes[SceneType.finish.ordinal()] = finishScene;
        return scenes;
        
        
        
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][1].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.finish.ordinal()]);
        
    }

    private void setScene(Scene scene) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
