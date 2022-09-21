package io.codelex.classesandobjects.practice.Product;

public class Product {
    String name;
    double price;
    int amount;

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

