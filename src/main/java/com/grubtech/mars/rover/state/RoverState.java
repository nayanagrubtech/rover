package com.grubtech.mars.rover.state;

public interface RoverState {
    void move();
    RoverState turnLeft();
    RoverState turnRight();
}
