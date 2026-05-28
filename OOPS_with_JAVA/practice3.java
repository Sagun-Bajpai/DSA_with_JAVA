//Topic 2 — Passing Class to Function (31:30)
//Object pass karte ho → Reference jaata hai
//Matlab andar change = bahar bhi change!
package OOPS_with_JAVA;

class Student {
    String name;
    double percent;
}

public class practice3 {

    static void UpdatePercent(Student s, double newPercent) {// class pass kari gai function me
        s.percent = newPercent;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Mohan";
        s1.percent = 75.2;
        System.out.println("Before " + s1.percent);
        UpdatePercent(s1, 85.2);
        System.out.println("after " + s1.percent);

    }

}
