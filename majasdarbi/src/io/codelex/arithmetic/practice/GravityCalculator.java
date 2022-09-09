package io.codelex.arithmetic.practice;

public class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81;  // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;

        finalPosition = 0.5 * gravity * Math.pow(fallingTime, 2) + initialVelocity * fallingTime + initialPosition;

        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }
}

//See [GravityCalculator.java](./GravityCalculator.java)
//
//        Modify the example program to compute the position of an object after
//        falling for 10 seconds, outputting the position in
//        meters. The formula in Math notation is:
//
//        ![Gravity formula](./gravity-formula.png)
//
//        *Note:* The correct value is -490.5m.