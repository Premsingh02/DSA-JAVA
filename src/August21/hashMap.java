package August21;

import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        //Creating hashMap
        HashMap<String,Integer> hm = new HashMap<>();

        //Insert - O(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);

        //Printing
        System.out.println(hm);

        //Get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia")); // Key not present to it will return null
    }
}
