package io.codelex.classesandobjects.practice.Movie;

import java.util.ArrayList;

public class Movie {

    String title;
    String studio;
    String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";

    }

    public static ArrayList<Movie> getPG(Movie[] movies) {
        ArrayList<Movie> moviesWithRatingPG = new ArrayList<>();
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].rating.equals("PG")) {
                moviesWithRatingPG.add(movies[i]);
            }
        }
        return moviesWithRatingPG;

    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}

