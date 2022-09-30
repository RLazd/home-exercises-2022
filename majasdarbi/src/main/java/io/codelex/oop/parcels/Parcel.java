package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private final int MAX_SUM_OF_DIMENSIONS = 300;
    private final int MIN_DIMENSION_LENGTH = 30;
    private final int MAX_WEIGHT = 30;
    private final int MAX_WEIGHT_FOR_EXPRESS_DELIVERY = 15;
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;


    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {

        if (xLength + yLength + zLength > MAX_SUM_OF_DIMENSIONS) {
            System.out.println("Sum of dimensions exceeds 300!");
            return false;
        } else if (xLength < MIN_DIMENSION_LENGTH || yLength < MIN_DIMENSION_LENGTH || zLength < MIN_DIMENSION_LENGTH) {
            System.out.println("At least one dimension is less than 30");
            return false;
        }

        if (weight > MAX_WEIGHT && isExpress == false) {
            System.out.println("Weight exceeds limit");
            return false;
        } else if (weight > MAX_WEIGHT_FOR_EXPRESS_DELIVERY && isExpress == true) {
            System.out.println("Weight exceeds limit for express delivery");
            return false;
        }

        System.out.println("Parcel checks all the requirements");
        return true;


    }
}
