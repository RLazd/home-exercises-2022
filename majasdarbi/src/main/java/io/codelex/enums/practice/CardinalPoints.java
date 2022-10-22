package io.codelex.enums.practice;

public enum CardinalPoints {
    NORTH("North", "up"),
    SOUTH("South", "down"),
    EAST("East", "right"),
    WEST("West", "left");

    private final String cardinalPoint;
    private final String otherOptionForDirection;

    CardinalPoints(String cardinalPoint, String otherOptionForDirection) {
        this.cardinalPoint = cardinalPoint;
        this.otherOptionForDirection = otherOptionForDirection;
    }

    public String getCardinalPoint() {
        return cardinalPoint;
    }

    public String getOtherOptionForDirection() {
        return otherOptionForDirection;
    }
}
