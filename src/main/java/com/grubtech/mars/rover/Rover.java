package com.grubtech.mars.rover;

import com.grubtech.mars.config.Configuration;
import com.grubtech.mars.rover.state.RoverState;

public class Rover implements RoverState {

    private RoverState state;
    private Configuration configuration;

    public Rover(RoverState state) {
        this.state = state;
    }

    public RoverState getState() {
        return state;
    }

    public void setState(RoverState state) {
        this.state = state;
    }

    @Override
    public void move(){
        state.move();
    }

    @Override
    public RoverState turnLeft(){
        setState(state.turnLeft());
        return state;
    }

    @Override
    public RoverState turnRight(){
        setState(state.turnRight());
        return state;
    }

}
