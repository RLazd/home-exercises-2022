package io.codelex.secondTest.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private List<T> basket = new ArrayList<>();
    final int MAX_SIZE = 10;
    final int MIN_SIZE = 0;

    public void addToBasket(T thingToAdd) {
        if (basket.size() == MAX_SIZE) {
            throw new BasketFullException("basket full");
        }
        basket.add(thingToAdd);
    }

    public void removeFromBasket() {
        if (basket.size() == MIN_SIZE) {
            throw new BasketEmptyException("basket empty");
        }
        basket.remove(basket.size() - 1);
    }


}
