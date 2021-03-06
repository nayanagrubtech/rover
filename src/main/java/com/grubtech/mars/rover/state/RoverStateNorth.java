package com.grubtech.mars.rover.state;

import com.grubtech.mars.rover.CartesianPosition;
import com.grubtech.mars.rover.TwoDimensionCartesianPosition;

public class RoverStateNorth  implements RoverState{

    private static final String STATE_CODE = "N";
    private TwoDimensionCartesianPosition position;

    public RoverStateNorth(TwoDimensionCartesianPosition position) {
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
        position.setyCoordinate(position.getyCoordinate() + 1);
    }

    @Override
    public RoverState turnLeft() {
        return new RoverStateWest(position);
    }

    @Override
    public RoverState turnRight() {
        return new RoverStateEast(position);
    }

}
