package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus,
 * extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car
 * if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        Volvo volvo = new Volvo();
        Subaru subaru = new Subaru();
        Audi audi = new Audi();
        Bmw bmw = new Bmw();
        Lexus lexus = new Lexus();
        Tesla tesla = new Tesla();

        List<Car> cars = new ArrayList<>();
        cars.add(volvo);
        cars.add(subaru);
        cars.add(audi);
        cars.add(bmw);
        cars.add(lexus);
        cars.add(tesla);

        for (int i = 1; i <= 10; i++) {

            for (Car car : cars) {
                if (i == 3 && car instanceof NitrousOxideEngine) {
                    ((NitrousOxideEngine) car).useNitrousOxideEngine();
                }
            }

        }

        int maxSpeed = 0;
        Car fastest = null;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).showCurrentSpeed() > maxSpeed) {
                maxSpeed = cars.get(i).showCurrentSpeed();
                fastest = cars.get(i);
            }

        }

        System.out.println("Fastest car: " + fastest.getName() + ". Max speed:" + maxSpeed);
    }
}
