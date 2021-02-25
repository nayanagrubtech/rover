package com.grubtech.mars;

import com.grubtech.mars.config.Configuration;
import com.grubtech.mars.controller.MarsRoverController;
import com.grubtech.mars.controller.MarsRoverVector;
import com.grubtech.mars.controller.RoverController;
import com.grubtech.mars.rover.CartesianPosition;
import com.grubtech.mars.rover.TwoDimensionCartesianPosition;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print(CONSTANT.ENTER_UPPER_RIGHT_CORNER_COORDINATES);
        String upperRightCorner = sc.nextLine();

        /**
         * Prepare upper right corners
         */
        String[] edge = upperRightCorner.split("\\s+");
        Integer xCoordinateAtEdge = Integer.valueOf(edge[0]);
        Integer yCoordinateAtEdge = Integer.valueOf(edge[1]);

        /**
         * Configure and boot up rover controller
         * config 1 ----> upper right corner is (0,0) unless configuration is not set here
         * config 2 ----> instructions if rover reach cliffs of the planet
         *                should it stop moving
         *                should it turn
         *                if turns, which side (L - left, R - right)
         */
        AppBootstrap bootstrapMarsRoverController = new BootstrapMarsRoverController() {
            @Override
            public void config(Configuration configuration) {
                configuration.setUpperRightXCoordinate(xCoordinateAtEdge);
                configuration.setUpperRightYCoordinate(yCoordinateAtEdge);
            }
        };

        MarsRoverController controller =  (MarsRoverController)bootstrapMarsRoverController.boot();

        while (true){
            System.out.print(CONSTANT.ENTER_THE_CURRENT_POSITION_VECTOR);
            String position = sc.nextLine();

            System.out.print(CONSTANT.ENTER_THE_INSTRUCTION_SERIES);
            String instructionString = sc.nextLine();

            /**
             * Prepare current position
             */
            String[] current = position.split("\\s+");
            Integer xCoordinateAtCurrent = Integer.valueOf(current[0]);
            Integer yCoordinateAtCurrent = Integer.valueOf(current[1]);
            String currentHeading = current[2];

            /**
             * Execution
             */
            controller.deploy(new MarsRoverVector(currentHeading, xCoordinateAtCurrent, yCoordinateAtCurrent));
            controller.execute(instructionString);


            TwoDimensionCartesianPosition positionFinal = (TwoDimensionCartesianPosition) controller.getRover().getState().getPosition();

            System.out.print(""
                    + positionFinal.getxCoordinate()
                    + " " + positionFinal.getyCoordinate() + " "
                    + controller.getRover().getState().getStateCode()
                    + "\n");
        }
    }




}
