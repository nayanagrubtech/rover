package com.grubtech.mars.rover.state;

import com.grubtech.mars.rover.CartesianPosition;
import com.grubtech.mars.rover.TwoDimensionCartesianPosition;

public class RoverStateEast implements RoverState{
    private static final String STATE_CODE = "E";
    private TwoDimensionCartesianPosition position;

    public RoverStateEast(TwoDimensionCartesianPosition position) {
        this.position = position;
    }

    @Override
    public String getStateCode() {
        return STATE_CODE;
    }

    @Override
    public CartesianPosition getPosition() {
        return position;
    }

    @Override
    public void move() {
        position.setxCoordinate(position.getxCoordinate() + 1);
    }

    @Override
    public RoverState turnLeft() {
        return new RoverStateNorth(position);
    }

    @Override
    public RoverState turnRight() {
        return new RoverStateSouth(position);
    }
}
