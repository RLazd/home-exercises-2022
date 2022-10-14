package io.codelex.secondTest.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    List<T> basket = new ArrayList<>();
    int basketCurrentSize;
    final int MAX_SIZE = 10;
    final int MIN_SIZE = 0;

    public Basket(int basketCurrentSize) {
        this.basketCurrentSize = basketCurrentSize;
    }

    public void addToBasket(T thingToAdd) {
        if (basketCurrentSize == MAX_SIZE) {
            throw new BasketFullException("basket full");
        }
        basket.add(thingToAdd);
        basketCurrentSize++;
    }

    public void removeFromBasket() {
        if (basketCurrentSize == MIN_SIZE) {
            throw new BasketEmptyException("basket empty");
        }
        basket.remove(basket.size() - 1);
        basketCurrentSize--;
    }


}
