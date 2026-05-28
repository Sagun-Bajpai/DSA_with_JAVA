//Topic 2 — Passing Class to Function (31:30)
//Object pass karte ho → Reference jaata hai
//Matlab andar change = bahar bhi change!
package OOPS_with_JAVA;

class Dog {
    String name;
    String color;
}

public class Practice2 {
    static void changename(Dog d) {
        d.name = "puppy";
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.color = "Brown";

        System.out.println("Before  " + d1.name);
        changename(d1);
        System.out.println("after  " + d1.name);

    }

}
