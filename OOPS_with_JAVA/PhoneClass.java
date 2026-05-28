package OOPS_with_JAVA;

//Topic 1  Classes & Objects (8:06)
class Phone {// Class alag banai
    String brand;// Attributes sahi
    String storage;
    int price;
}

public class PhoneClass {
    public static void main(String[] args) {
        Phone p1 = new Phone();// Object banaya
        p1.brand = "Motorola";// Values di
        p1.storage = "256GB";
        p1.price = 18000;
        Phone p2 = new Phone();// Object banaya
        p2.brand = "Apple";// Values di
        p2.storage = "132GB";
        p2.price = 180000;

        System.out.println(p1.brand + " " + p1.storage + " " + p1.price);// print karaya
        System.out.println(p2.brand + " " + p2.storage + " " + p2.price);// print karaya

    }

}
