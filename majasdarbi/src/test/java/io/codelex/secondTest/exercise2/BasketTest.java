package io.codelex.secondTest.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {
    @Test
    public void shouldThrowBasketFullException() {
        Basket apples = new Basket(10);
        BasketFullException fullException = assertThrows(BasketFullException.class, () -> {
            apples.addToBasket(new Apples());
        });
        Assertions.assertEquals("basket full", fullException.getMessage());
    }

    @Test
    public void shouldThrowBasketEmptyException() {
        Basket apples = new Basket(0);
        BasketEmptyException emptyException = assertThrows(BasketEmptyException.class, () -> {
            apples.removeFromBasket();
        });
        assertEquals("basket empty", emptyException.getMessage());
    }
}