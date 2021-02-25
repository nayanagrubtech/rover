package com.grubtech.mars.rover.state;

import com.grubtech.mars.rover.TwoDimensionCartesianPosition;

public class RoverStateSouth implements RoverState{

    private TwoDimensionCartesianPosition position;

    public RoverStateSouth(TwoDimensionCartesianPosition position) {
        this.position = position;
    }

    @Override
    public void move() {
        position.setyCoordinate(position.getyCoordinate() - 1);
    }

    @Override
    public RoverState turnLeft() {
        return new RoverStateEast(position);
    }

    @Override
    public RoverState turnRight() {
        return new RoverStateWest(position);
    }
}