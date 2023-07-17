package JULY17;

import java.util.ArrayList;

public class FindMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i<list.size(); i++){
            if (list.get(i) > maxNum){
                maxNum = list.get(i);
            }
        }
        System.out.println("Max element = " + maxNum);
    }
}
