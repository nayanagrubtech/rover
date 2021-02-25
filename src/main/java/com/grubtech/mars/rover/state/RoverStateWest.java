package com.grubtech.mars.rover.state;

import com.grubtech.mars.rover.TwoDimensionCartesianPosition;

public class RoverStateWest implements RoverState{

    private TwoDimensionCartesianPosition position;

    public RoverStateWest(TwoDimensionCartesianPosition position) {
        this.position = position;
    }

    @Override
    public void move() {
        position.setxCoordinate(position.getxCoordinate() - 1);
    }

    @Override
    public RoverState turnLeft() {
        return new RoverStateSouth(position);
    }

    @Override
    public RoverState turnRight() {
        return new RoverStateNorth(position);
    }
}