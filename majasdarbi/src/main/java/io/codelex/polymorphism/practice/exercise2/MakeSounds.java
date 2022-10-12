package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {

        Parrot parrot = new Parrot();
        Firework firework = new Firework();
        Radio radio = new Radio();

        List<Sound> sounds = new ArrayList<>();
        sounds.add(parrot);
        sounds.add(radio);
        sounds.add(firework);
        sounds.add(parrot);
        sounds.add(parrot);
        sounds.add(firework);

        sounds.forEach(sound -> sound.playSound());


    }
}
