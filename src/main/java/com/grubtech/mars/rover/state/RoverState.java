package com.grubtech.mars.rover.state;

import com.grubtech.mars.rover.CartesianPosition;

public interface RoverState {
    String getStateCode();
    CartesianPosition getPosition();
    void move();
    RoverState turnLeft();
    RoverState turnRight();
}
