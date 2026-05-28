package OOPS_with_JAVA;

// topic 1  Classes & Objects (8:06)
class Student {// create new datatype it is a blueprit.
    String name;
    int RollNo;
    double percent;
}

public class StudentClass {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "sagun";
        s1.RollNo = 45;
        s1.percent = 95.6;
        System.out.println(s1.name);

        Student s2 = new Student();// create new object
        s2.name = "mohan";
        s2.RollNo = 45;
        s2.percent = 95.6;
        System.out.println(s2.name);

    }

}