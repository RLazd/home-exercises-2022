package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {

    int areaOfPoster;
    int copies;
    boolean isPrimeLocation;

    public Poster(int fee, int areaOfPoster, int copies, boolean isPrimeLocation) {
        super(fee);
        this.areaOfPoster = areaOfPoster;
        this.copies = copies;
        this.isPrimeLocation = isPrimeLocation;
    }

    @Override
    public int cost() {
        return super.cost() + areaOfPoster / 2 + (isPrimeLocation ? 3 * copies : copies);

    }

    @Override
    public String toString() {
        return super.toString() + " Area of poster: " + areaOfPoster + " Number of copies: " + copies
                + " Prime location: " + isPrimeLocation;
    }
}
