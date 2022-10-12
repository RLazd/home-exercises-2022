package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class Video {

    private String title;
    private Boolean isInTheStore = true;
    private int averageRating;

    private ArrayList<Integer> ratings = new ArrayList<>();


    public Video(String movieTitle) {
        this.title = movieTitle;
    }

    public void receiveRating(int rating) {
        ratings.add(rating);
        averageRating = ratings.stream().mapToInt(Integer::valueOf).sum() / ratings.size();

    }

    public String getTitle() {
        return title;
    }

    public Boolean getIsInTheStore() {
        return isInTheStore;
    }


    public void setIsInTheStore(Boolean isInTheStore) {
        this.isInTheStore = isInTheStore;
    }

    @Override
    public String toString() {
        return title + ", in store: " + isInTheStore + ", average Rating: " + averageRating;
    }

//    public ArrayList<Integer> getRatings() {
//        return ratings;
//    }
//
//    public int getAverageRating() {
//        return averageRating;
//    }

}
