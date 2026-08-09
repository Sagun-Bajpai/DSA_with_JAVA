package OOPS_with_JAVA;

public class Demo2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("krisa", 22, 102, "Ambalika");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);
        System.out.println(s1.collage);
    }
}

class Student2 {
    String name;
    int age;
    int rollNo;
    String collage;

    // default constructer
    Student2() {

    }

    // parametrerized constructer
    Student2(String n, int a, int rn, String c) {
        name = n;
        age = a;
        rollNo = rn;
        collage = c;
    }

    void markAttendance() {
        System.out.println("Attendance marked for student " + name);
    }
}
