package com.grubtech.mars;

import com.grubtech.mars.config.Configuration;
import com.grubtech.mars.controller.MarsRoverVector;
import com.grubtech.mars.controller.RoverController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the upper-right corner : ");
        String upperRightCorner = sc.nextLine();

        String[] edge = upperRightCorner.split("\\s+");

        Integer xCoordinateAtEdge = Integer.valueOf(edge[0]);
        Integer yCoordinateAtEdge = Integer.valueOf(edge[1]);


        /**
         * Configure and boot up rover controller
         */
        AppBootstrap bootstrapMarsRoverController = new BootstrapMarsRoverController() {
            @Override
            public void config(Configuration configuration) {
                //set grid end
                configuration.setUpperRightXCoordinate(xCoordinateAtEdge);
                configuration.setUpperRightYCoordinate(yCoordinateAtEdge);
                //set other configs
            }
        };

        RoverController controller = bootstrapMarsRoverController.boot();


//
        while (true){
            String position = sc.nextLine();
            String instructionString = sc.nextLine();

            String[] current = position.split("\\s+");

            Integer xCoordinateAtCurrent = Integer.valueOf(current[0]);
            Integer yCoordinateAtCurrent = Integer.valueOf(current[1]);
            String currentHeading = current[2];

            controller.deploy(new MarsRoverVector(currentHeading, xCoordinateAtCurrent, yCoordinateAtCurrent));
            controller.execute(instructionString);

//            System.out.print("" + finalPositionVector.getxCoordinate() + " " + finalPositionVector.getyCoordinate() + " " + finalPositionVector.getHeading() + "\n");

            System.out.print("executing ... \n");
            System.out.print("next rover ...\n");
        }
    }




}
