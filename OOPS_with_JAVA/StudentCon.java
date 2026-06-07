package OOPS_with_JAVA;

//class variable properties
public class StudentCon {
    String name;
    int rollNo;
    double percent;
    static int totalStudentCons = 0;

    // Constructor - Initialize the object
    public StudentCon(String name, int rollNo, double Percent) {
        this.name = name;
        this.rollNo = rollNo;
        this.percent = Percent;
        totalStudentCons++; // counter बढ़ जाता है
    }

    // display function
    public void display() {
        System.out.println("name is: " + name);
        System.out.println("roll number is: " + rollNo);
        System.out.println("percentage is: " + percent);
    }
}
