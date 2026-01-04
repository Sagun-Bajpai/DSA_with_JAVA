package ArrayList24;
import java.util.ArrayList;
import java.util.Collections;/// sort method hi collections ke ander
public class ReverseArrayList {

    public static void main(String[]args){
     ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
         list.add(10);
          list.add(3);
           list.add(5);
            list.add(6);
             list.add(9);
              list.add(1);
              System.out.println("Original list "+ list);
             Collections.reverse(list);
             
              System.out.println("Reversed Array"+list); 
              Collections.sort(list);
              System.out.println("Acending Order"+list);   
              Collections.sort(list,Collections.reverseOrder());  
              System.out.println("Decending Order Sort"+list);


              ArrayList<String> l1=new ArrayList<>();
              l1.add("sagun");
              l1.add("modak");
              l1.add("krisa");
              l1.add("kaddu");
              l1.add("ghanta");
              l1.add("ab");
              l1.add("fir");
              l1.add("kya");

              //lexigraphical se sorting hoti hi
              System.out.println("Original String List"+l1);
              Collections.sort(l1);
              System.out.println("acending order:"+l1);
    }
    
}
