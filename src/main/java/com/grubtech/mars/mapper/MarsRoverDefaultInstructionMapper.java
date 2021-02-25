package com.grubtech.mars.mapper;

public class MarsRoverDefaultInstructionMapper implements InstructionMapper{

    @Override
    public Character map(Object inputInstruction) {
        return (Character) inputInstruction;
    }
}
