package io.codelex.enums.practice;

import java.util.Random;

public enum Rps {
    ROCK,
    PAPER,
    SCISSORS;

    public static Rps randomRps() {
        int pick = new Random().nextInt(Rps.values().length);
        return Rps.values()[pick];
    }

    public static Rps getRps(String firstLetter) {
        switch (firstLetter) {
            case "s":
                return SCISSORS;
            case "r":
                return ROCK;
            case "p":
                return PAPER;
        }
        return null;
    }

}
