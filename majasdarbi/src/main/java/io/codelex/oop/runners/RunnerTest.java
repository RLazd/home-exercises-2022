package io.codelex.oop.runners;

public class RunnerTest {


    public static void main(String[] args) {
        Runner slowRunner = Runner.BEGINNER;
        System.out.println(slowRunner);

        Runner runner2 = Runner.getFitnessLevel(135);
        System.out.println("Runner2 is: " + runner2);

        System.out.println(Runner.getFitnessLevel(210));


    }

}
