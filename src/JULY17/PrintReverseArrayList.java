package JULY17;

import java.util.*;
public class PrintReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

//      Reversing an ArrayList
        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
