package com.grubtech.mars.config;

import com.grubtech.mars.controller.RoverController;

/**
 * Configuration holder for system
 */
public class Configuration {

    /**
     * To validate compass points
     */
    Character[] compassPoints = {'N', 'E', 'S', 'W'};

    /**
     * Validate instruction
     * This will limit instructions to followings
     */
    Character[] roverInstructions = {'M', 'L', 'R'};

    /**
     * instructions if rover reach cliffs of the planet
     *  *          *                should it stop moving
     *  *          *                should it turn
     *  *          *                if turns, which side (L - left, R - right)
     */
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
