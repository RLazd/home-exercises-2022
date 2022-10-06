package io.codelex.enums.practice;

import io.codelex.enums.examples.Day;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class CardinalPointsTest {
    public static void main(String[] args) {
        Map<String, Integer> coordinates = new HashMap<>();
        coordinates.put(bothNamesForCardinalPoints(CardinalPoints.NORTH), 0);
        coordinates.put(bothNamesForCardinalPoints(CardinalPoints.SOUTH), 1);
        coordinates.put(bothNamesForCardinalPoints(CardinalPoints.EAST), 2);
        coordinates.put(bothNamesForCardinalPoints(CardinalPoints.WEST), 3);

        for (Map.Entry<String, Integer> valuePair : coordinates.entrySet()) {
            System.out.println(valuePair.getKey() + " : " + valuePair.getValue());
        }


    }

    public static String bothNamesForCardinalPoints(CardinalPoints point) {
        return point.getCardinalPoint() + ":" + point.getOtherOptionForDirection();
    }
}
