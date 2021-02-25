package com.grubtech.mars.rover.state;

import com.grubtech.mars.rover.TwoDimensionCartesianPosition;

public class RoverStateNotFound implements RoverState{

    private TwoDimensionCartesianPosition position;

    public RoverStateNotFound(TwoDimensionCartesianPosition position) {
        this.position = position;
    }

    @Override
    public void move() {
        throw new FeatureNotFoundException("This state does not have this feature");
    }

    @Override
    public RoverState turnLeft() {
        throw new FeatureNotFoundException("This state does not have this feature");
    }

    @Override
    public RoverState turnRight() {
        throw new FeatureNotFoundException("This state does not have this feature");
    }
}
