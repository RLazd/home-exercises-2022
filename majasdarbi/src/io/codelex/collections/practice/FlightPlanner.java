package io.codelex.collections.practice;

//import jdk.internal.access.JavaIOFileDescriptorAccess;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";
    private static Set<String> citiesToStartFrom = new HashSet<>();
    private static Map<String, ArrayList<String>> citiesWithDestinations = new HashMap<>();
    private static String startCity = null;
    private static ArrayList<String> route = new ArrayList<>();
    private static final Scanner scan = new Scanner(System.in);


    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(FlightPlanner.class.getResource(file).toURI());

        for (String line : Files.readAllLines(path, charset)) {
            String[] cities = line.split("->");
            String firstCity = cities[0].trim();
            String secondCity = cities[1].trim();

            citiesToStartFrom.add(firstCity);
            citiesWithDestinations.computeIfAbsent(firstCity, v -> new ArrayList<>()).add(secondCity);
        }

        System.out.println("What would you like to do:\n" +
                "To display list of the cities press 1\n" +
                "To exit program press #");

        String input = scan.nextLine();
        if (input.equals("#")) {
            System.exit(0);
        } else if (input.equals("1")) {
            selectStartCity();
        }

        do {
            nextCity();
        }
        while (!route.get(0).equals(route.get(route.size() - 1)));


        System.out.println("Your route: " + route);


    }

    private static void selectStartCity() {

        System.out.println("Cities to start from: " + citiesToStartFrom);
        System.out.println("To select a city from which you would like to start press 1, " +
                "if you wish to see next city press enter. Press # to exit.");

        for (String city : citiesToStartFrom) {
            System.out.println(city);
            String choice = scan.nextLine();
            if (choice.equals("1")) {
                startCity = city;
                route.add(city);
                break;
            }
            if (choice.equals("#")) {
                System.exit(0);
            }
        }

    }

    private static void nextCity() {

        String currentCity = route.get(route.size() - 1);
        ArrayList<String> possibleDestinations = citiesWithDestinations.get(currentCity);
        System.out.println("Next city choice: " + possibleDestinations);

        System.out.println("To select a next city press 1, " +
                "if you wish to see next city press enter. To exit press #.");
        for (String nextCity : possibleDestinations) {
            System.out.println(nextCity);
            String choice = scan.nextLine();
            if (choice.equals("1")) {
                route.add(nextCity);
                break;
            }
            if (choice.equals("#")) {
                System.exit(0);
            }
        }


    }
}
