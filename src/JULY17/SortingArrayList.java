package JULY17;

//import java.util.Collections;
//import java.util.ArrayList;
import java.util.*;

public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);
        Collections.sort(list); // ascending order
        System.out.println(list);

//      descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
