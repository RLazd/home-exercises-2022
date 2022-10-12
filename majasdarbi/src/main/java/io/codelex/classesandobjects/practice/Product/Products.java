package io.codelex.classesandobjects.practice.Product;

public class Products {
    public static void main(String[] args) {
        Product mouse = new Product("Logitech mouse", 70.00, 14);
        Product iPhone = new Product("iPhone 5s", 999.99, 3);
        Product epson = new Product("Epson EB-U05", 440.46, 1);

        mouse.printProduct();
        iPhone.printProduct();
        epson.printProduct();

        mouse.setAmount(4);
        System.out.println(mouse.amount);

        epson.setPrice(410.09);
        System.out.println(epson.price);
    }
}
