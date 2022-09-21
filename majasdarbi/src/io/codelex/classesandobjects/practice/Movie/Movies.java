package io.codelex.classesandobjects.practice.Movie;

import java.util.Arrays;

public class Movies {
    public static void main(String[] args) {
        Movie casinoRoyale = new Movie("Casino Royale", "Eon Productions", "PG13");
        Movie glass = new Movie("Glass", "Buena Vista", "PG13");
        Movie spiderMan = new Movie("Spider-Man", "Columbia Pictures");

        Movie[] movies = new Movie[]{casinoRoyale, glass, spiderMan};

        System.out.println(Arrays.toString(movies));


        System.out.println(Arrays.deepToString(Movie.getPG(movies).toArray()));


    }
}
