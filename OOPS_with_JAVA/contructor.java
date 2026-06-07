package OOPS_with_JAVA;

public class contructor {
    public static void main(String[] args) {
        // Creating an object using the constructo

        // Object creation यहाँ होती है ✅
        StudentCon s1 = new StudentCon("Sagun", 101, 8.4);
        System.out.println(StudentCon.totalStudentCons); // 1

        StudentCon s2 = new StudentCon("Priya", 102, 8.8);
        System.out.println(StudentCon.totalStudentCons); // 2 ✅

        StudentCon s3 = new StudentCon("Raj", 103, 8.2);
        System.out.println(StudentCon.totalStudentCons); // 3 ✅

        // Display करना
        s1.display();
        s2.display();
        s3.display();

    }

}
