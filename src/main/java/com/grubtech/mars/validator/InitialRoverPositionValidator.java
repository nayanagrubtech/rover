package com.grubtech.mars.validator;

import com.grubtech.mars.config.Configuration;
import com.grubtech.mars.controller.MarsRoverVector;
import com.grubtech.mars.controller.RoverVector;

public class InitialRoverPositionValidator implements Validator{

    Configuration configuration;

    public InitialRoverPositionValidator(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public void validate(RoverVector vector) {

        if(configuration.getUpperRightXCoordinate() < ((MarsRoverVector) vector).getxCoordinate()
            ||  configuration.getUpperRightYCoordinate() < ((MarsRoverVector) vector).getyCoordinate()){
            throw new RuntimeException("Trying to deploy rover out of the planet surface.");
        }
    }
}
