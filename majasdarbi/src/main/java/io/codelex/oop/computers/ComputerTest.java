package io.codelex.oop.computers;

public class ComputerTest {

    public static void main(String[] args) {

        Computer intop = new Computer("Intel core i5", 32, "Nvidia GeForce RTX3060", "Intop", "i5-11600K");
        Computer dell = new Computer("Intel Core i7-6700 ", 16, "Intel HD Graphics 530", "Dell", "5040 SFF");

        System.out.println(intop.toString());
        intop.setGraphicsCard("RTX3060");
        System.out.println(intop.getGraphicsCard());

        System.out.println(intop.equals(dell));


        Laptop apple = new Laptop("M2", 8, "Apple M2", "Apple", "MLY33RU/A", 20);
        Laptop apple2 = new Laptop("M2", 8, "Apple M2", "Apple", "MLY33RU/A", 20);
        Laptop hp = new Laptop("N4500", 4, "Intel UHD Graphics", "HP", "15s-fq", 10);

        System.out.println(apple);
        System.out.println(apple2);
        System.out.println(apple.equals(apple2));

        apple2.setBattery(10);
        System.out.println(apple2.equals(apple));

        System.out.println(apple2.getBattery() == hp.getBattery());


    }
}
