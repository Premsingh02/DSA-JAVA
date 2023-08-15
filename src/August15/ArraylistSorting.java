package August15;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSorting {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(44);
        list1.add(3);
        list1.add(89);

        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);

        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);
    }
}
