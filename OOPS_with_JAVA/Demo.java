package OOPS_with_JAVA;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.collage);

        // int x=4;//local variable--> no default values --> local variables stack
        // memory me aate hai
    }

}

/*
 * Integer--> 0
 * floating-->0.0
 * Boolean-->false
 * String-->null(nothing)
 */
class Student {
    String name; // information /data/characteristic/--> instance Variables-->it have default
                 // value--> heaf memory me aate hai
    int age;
    int rollNumber;
    String collage;

    void markAttendence() {
        System.out.println("Attendence marked for student " + name);
    }
}
