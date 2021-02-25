package com.grubtech.mars.rover.state.factory;

import com.grubtech.mars.controller.MarsRoverVector;
import com.grubtech.mars.controller.RoverVector;
import com.grubtech.mars.rover.TwoDimensionCartesianPosition;
import com.grubtech.mars.rover.state.*;

public class RoverStateFactory {

    public static RoverState getState(RoverVector vector) {
        TwoDimensionCartesianPosition position = new TwoDimensionCartesianPosition(((MarsRoverVector) vector).getxCoordinate(), ((MarsRoverVector) vector).getyCoordinate());
        switch (((MarsRoverVector) vector).getHeading()) {
            case "N":
                return new RoverStateNorth(position);
            case "E":
                return new RoverStateEast(position);
            case "S":
                return new RoverStateSouth(position);
            case "W":
                return new RoverStateWest(position);
            default:
                return new RoverStateNotFound(position);
        }
    }
}
