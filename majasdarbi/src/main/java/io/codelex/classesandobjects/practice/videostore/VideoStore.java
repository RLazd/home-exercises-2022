package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.Arrays;

public class VideoStore {

    public static ArrayList<Video> inventory = new ArrayList<>();


    public static void addVideo(String title) {
        Video video = new Video(title);
        inventory.add(video);
    }

    public static Video checkOutVideo(String title) {
        for (Video video : inventory) {
            if (video.getTitle().equals(title) && video.getIsInTheStore().equals(true)) {
                video.setIsInTheStore(false);
                System.out.println("Video taken!");
                //System.out.println(video.getIsInTheStore());
                return video;
            }
        }
        System.out.println("Video not there!");
        return null;
    }

    public static Video returnVideo(String title) {

        for (Video video : inventory) {
            if (video.getTitle().equals(title) && video.getIsInTheStore().equals(false)) {
                video.setIsInTheStore(true);
                System.out.println("Video returned!");
                //System.out.println(video.getIsInTheStore());
                return video;
            }
        }
        System.out.println("Video not there!");
        return null;

    }

    public static void takeRatingForTitle(String title, int rating) {
        for (Video video : inventory) {
            if (video.getTitle().equals(title)) {
                video.receiveRating(rating);
            }
        }
    }

    public static String listInventory() {
        for (int i = 0; i < inventory.size(); i++) {
            return inventory.toString();
        }
        return null;
    }


}
