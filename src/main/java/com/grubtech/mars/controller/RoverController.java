package com.grubtech.mars.controller;

public interface RoverController {

    void deploy(RoverVector roverVector);

    void execute(String instructions);
}
