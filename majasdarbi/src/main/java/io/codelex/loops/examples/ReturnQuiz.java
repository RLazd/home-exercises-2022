package io.codelex.loops.examples;

public class ReturnQuiz {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                System.out.print("Bye!");
                return;
            }
            System.out.print("Currently @" + i + ", ");
        }
        // What will be the output?

        // !!3. Currently @0, Bye! - correct!!!

    }
}
