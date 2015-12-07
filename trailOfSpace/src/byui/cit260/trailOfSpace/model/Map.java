/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.model;

import byui.cit260.trailOfSpace.view.View;
import java.io.Serializable;
import trailofspace.TrailOfSpace;

/**
 *
 * @author landonwright
 */
public class Map implements Serializable extends View {
    
    private int noOfRows;
    private int noOfColumns;
    private Location[][] locations;

    public Map(int noOfRows, int noOfColumns) {
        if (noOfRows < 1 || noOfColumns < 1) {
            this.console.println("The number of rows and columns must be greater than zero.");
        return;
        }
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        //create 2D array of location objects
        this.locations = new Location[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++) {
            for(int column = 0; column < noOfColumns; column++){
                //create and intialize new Location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                //asign the Location object to the current position in the array
                locations[row][column] = location;
            }
        }
    }

    

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }
    

    
    public int getRowCount() {
        return noOfRows;
    }

    public void setRowCount(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    

    public Map() {
        
        
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + noOfRows + ", columnCount=" + noOfColumns + '}';
    }
    
    

    
    
    
    
    
    
}
