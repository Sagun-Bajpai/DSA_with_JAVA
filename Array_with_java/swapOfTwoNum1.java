// given 2 integer a and b . swap the given values using temporary variable
package Array_with_java;
public class swapOfTwoNum1 {
    static void swap(int a,int b){
        System.out.println("original value of before swaping");
        System.out.println("a="+a);
        System.out.println("b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("value of after swaping");
        System.out.println("a="+a);
        System.out.println("b="+b);
      


    }
    public static void main(String[] args) {
        int a=9;
        int b=6;
        int [] arr={1,3,4,5,7,6,8};
        swap(a,b);
    }
    
}
