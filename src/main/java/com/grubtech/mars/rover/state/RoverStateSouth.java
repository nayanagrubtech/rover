package com.grubtech.mars.rover.state;

import com.grubtech.mars.rover.CartesianPosition;
import com.grubtech.mars.rover.TwoDimensionCartesianPosition;

public class RoverStateSouth implements RoverState{

    private static final String STATE_CODE = "S";
    private TwoDimensionCartesianPosition position;

    public RoverStateSouth(TwoDimensionCartesianPosition position) {
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