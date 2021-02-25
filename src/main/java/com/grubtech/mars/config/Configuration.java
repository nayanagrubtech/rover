package com.grubtech.mars.config;

import com.grubtech.mars.controller.RoverController;

public class Configuration {

    Character[] compassPoints = {'N', 'E', 'S', 'W'};
    Character[] roverInstructions = {'M', 'L', 'R'};
    Boolean isTurnAtCliff = true;
    Character turnInstructionAtCliff = 'L';
    RoverController roverController;
    Integer upperRightXCoordinate = 0;
    Integer upperRightYCoordinate = 0;

    public Character[] getCompassPoints() {
        return compassPoints;
    }

    public void setCompassPoints(Character[] compassPoints) {
        this.compassPoints = compassPoints;
    }

    public Character[] getRoverInstructions() {
        return roverInstructions;
    }

    public void setRoverInstructions(Character[] roverInstructions) {
        this.roverInstructions = roverInstructions;
    }

    public Boolean getTurnAtCliff() {
        return isTurnAtCliff;
    }

    public void setTurnAtCliff(Boolean turnAtCliff) {
        isTurnAtCliff = turnAtCliff;
    }

    public Character getTurnInstructionAtCliff() {
        return turnInstructionAtCliff;
    }

    public void setTurnInstructionAtCliff(Character turnInstructionAtCliff) {
        this.turnInstructionAtCliff = turnInstructionAtCliff;
    }

    public RoverController getRoverController() {
        return roverController;
    }

    public void setRoverController(RoverController roverController) {
        this.roverController = roverController;
    }

    public Integer getUpperRightXCoordinate() {
        return upperRightXCoordinate;
    }

    public void setUpperRightXCoordinate(Integer upperRightXCoordinate) {
        this.upperRightXCoordinate = upperRightXCoordinate;
    }

    public Integer getUpperRightYCoordinate() {
        return upperRightYCoordinate;
    }

    public void setUpperRightYCoordinate(Integer upperRightYCoordinate) {
        this.upperRightYCoordinate = upperRightYCoordinate;
    }
}
