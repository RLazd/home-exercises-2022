package io.codelex.secondTest.exercise3;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class JoinerTest {
    @Test
    public void shouldJointIntegersTogether() {

        Joiner<Integer> joiner = new Joiner<>("-", (a, b) -> a.toString() + b);

        String result = joiner.join(1, 2, 3, 4);

        assertEquals("1-2-3-4-", result);
    }
}