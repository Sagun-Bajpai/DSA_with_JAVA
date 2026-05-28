//Topic 3 — Default Values (46:28)
package OOPS_with_JAVA;

class Employee {
    String name;
    int salery;
    double rating;
    boolean isActive;
}

public class Topic3 {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        System.out.println("Emp name : " + E1.name);
        System.out.println("Emp name : " + E1.salery);
        System.out.println("Emp name : " + E1.rating);
        System.out.println("Emp name : " + E1.isActive);
    }

}
