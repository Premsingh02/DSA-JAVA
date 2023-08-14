package August14;

//ArrayList<Integer> list = new ArrayList<>();
//ArrayList<String/Boolean> list2 = new ArrayList<>();


import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //How to add an element in ArrayList >> O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //How to directly go to an index and add an element
        list.add(1,9);

        //Print and check the ArrayList
        System.out.println(list);

        //How to get an element in ArrayList
        int element = list.get(2); //index
        System.out.println(element);

        //How to delete and element in ArrayList
        list.remove(2);

        //How to set a new element in place of old element
        list.set(2,15);

        //How to check and element exits in my Arraylist or not
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        //Print and check the ArrayList
        System.out.println(list);
    }
}
