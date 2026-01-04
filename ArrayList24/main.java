package ArrayList24;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        //wraper class 
       Integer A=Integer.valueOf(5);
        System.out.println(A);
        //float vlaue
        Float f=Float.valueOf(4.5f);
        System.out.println(f);

        ArrayList<Integer>l1=new ArrayList<>();
        //add new element
         l1.add(4);
         l1.add(5);
         l1.add(2);
         l1.add(7);
        // get an element et index i
        System.out.println(l1.get(1));
        //print with for loop
        for(int i=0;i<l1.size();i++){
            System.out.print(" "+l1.get(i));//4,5,2,7
        }
        System.out.println();// for using next line
        // printing the array list directly  without using loop
        System.out.println(l1);//[4,5,2,7]

        // adding element at some index i
        l1.add(1, 100);
        System.out.println(l1);//[4,100,5,2,7]

        // modifying element at index i
        l1.set(1, 15);
        System.out.println(l1);//[4, 15, 5, 2, 7]

        // rempve elemen in tis list
        l1.remove(2);
        System.out.println(l1);//[4, 15, 2, 7]

        // removing an element e
        System.out.println(l1.remove(Integer.valueOf(2)));// age esko print krenge toh boolean return krke dega
        System.out.println(l1);//[4, 15, 7]
        

        // checking if an element exists
        boolean ans=l1.contains(Integer.valueOf(15));
        System.out.println(ans);

        // if you don't specify class, you can put anything inside l
        ArrayList l=new ArrayList<>();
        l.add("sagun");
        l.add(5.6);
        l.add(5);
        l.add(true);
        l.add(-8.9);
        System.out.println(l);

    }
}
