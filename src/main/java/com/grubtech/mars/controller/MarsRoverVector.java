package com.grubtech.mars.controller;

public class MarsRoverVector implements RoverVector{

    private String heading;
    private Integer xCoordinate;
    private Integer yCoordinate;

    public MarsRoverVector(String heading, Integer xCoordinate, Integer yCoordinate) {
        this.heading = heading;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public Integer getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(Integer xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public Integer getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(Integer yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
}
