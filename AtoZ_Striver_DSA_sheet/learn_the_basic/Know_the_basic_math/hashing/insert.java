package AtoZ_Striver_DSA_sheet.learn_the_basic.Know_the_basic_math.hashing;

import java.util.HashMap;
import java.util.Set;

public class insert {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        // insert key and value
        hm.put("india", 100);
        hm.put("china", 200);
        hm.put("usa", 300);
        System.out.println(hm);

        // get operation

        int population = hm.get("india");
        System.out.println(population);
        System.out.println(hm.get("pakistan"));

        // containsKey - key is exist or not
        System.out.println(hm.containsKey("india"));// true exist krta
        System.out.println(hm.containsKey("pakistan"));// false no exist

        // remove
        System.out.println(hm.remove("india"));
        System.out.println(hm);

        // iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("keys: " + k + ", value: " + hm.get(k));
        }

    }

}
