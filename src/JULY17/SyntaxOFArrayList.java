package JULY17;

import java.util.*;
public class SyntaxOFArrayList {
    public static void main(String[] args) {
//        String | Boolean | Float
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,9);

        System.out.println(list);

//      Get Operation
        int element = list.get(2);
        System.out.println(element);

//      Delete
        list.remove(2);
        System.out.println(list);

//      Set Element at Index
        list.set(2,10);  // 2 is index and 10 is the value
        System.out.println(list);

//      Contains Element
        System.out.println(list.contains(5));
        System.out.println(list.contains(13));

        System.out.println(list.size());
    }
}
