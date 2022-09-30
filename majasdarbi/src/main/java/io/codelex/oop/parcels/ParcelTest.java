package io.codelex.oop.parcels;

public class ParcelTest {

    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(44, 35, 30, 30, false);
        System.out.println(parcel1.validate());

        Parcel parcel2 = new Parcel(44, 20, 30, 30, false);
        System.out.println(parcel2.validate());

        Parcel parcel3 = new Parcel(44, 35, 30, 17, true);
        System.out.println(parcel3.validate());

    }
}
