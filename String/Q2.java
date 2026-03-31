package String;

public class Q2 {
    public static void main(String[] args) {
        // String str = "hello";
        // when using stringbuilder then we will use append(), method
        StringBuilder str = new StringBuilder("hello");
        str.append(" " + "world");
        System.out.println(str);
        StringBuilder str1 = new StringBuilder("sagun");
        str1.setCharAt(3, 'B');// add character using index
        System.out.println(str1);

        str1.append(15);// add in last
        System.out.println(str1);
        str1.insert(4, 100);// add using index
        System.out.println(str1);
        str1.deleteCharAt(7);// n removed
        System.out.println(str1);

    }

}
