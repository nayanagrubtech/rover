package com.grubtech.mars.controller;

import com.grubtech.mars.config.Configuration;
import com.grubtech.mars.mapper.InstructionMapper;
import com.grubtech.mars.mapper.MarsRoverDefaultInstructionMapper;
import com.grubtech.mars.rover.Rover;
import com.grubtech.mars.rover.state.factory.RoverStateFactory;
import com.grubtech.mars.validator.InitialRoverPositionValidator;
import com.grubtech.mars.validator.Validator;

public class MarsRoverController implements RoverController {

    Rover rover;
    Configuration configuration;

    public MarsRoverController(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public void deploy(RoverVector vector) {
        getInitialPositionValidator().validate(vector);
        rover = new Rover(RoverStateFactory.getState(vector));
    }

    @Override
    public void execute(String instructions) {
        for (Character instruction : instructions.toCharArray()) {
            instruction = getInstructionMapper().map(instruction);
            switch (instruction) {
                case 'M':
                    rover.move();
                    break;
                case 'R':
                    rover.turnRight();
                    break;
                case 'L':
                    rover.turnLeft();
                    break;
                default:
                    break;
            }
        }
    }

    public Validator getInitialPositionValidator(){
        return new InitialRoverPositionValidator(configuration);
    }

    /**
     * Instruction can be converted through this mapper
     * @return
     */
    public InstructionMapper getInstructionMapper(){
        return new MarsRoverDefaultInstructionMapper();
    }




}
