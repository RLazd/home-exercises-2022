package io.codelex.exceptions.practice;

public class Exercise2 {

    public void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public void methodB() throws ArithmeticException {
        methodC();
    }

    public void methodC() throws ArithmeticException {
        int impossible = 2 / 0;
    }
}
