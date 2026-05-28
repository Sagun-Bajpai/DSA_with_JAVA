package OOPS_with_JAVA;

//Topic 1 Classes & Objects (8:06)
class Car {
    String brand;
    String color;
    int speed;
}

public class CarClass {
    public static void main(String[] args) {
        // first object
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.color = "Red";
        c1.speed = 120;

        // second object
        Car c2 = new Car();
        c2.brand = "BMW";
        c2.color = "Black";
        c2.speed = 140;

        System.out.println(c1.brand + ", " + c1.color);
        System.out.println(c2.brand + ", " + c2.color);

    }

}
