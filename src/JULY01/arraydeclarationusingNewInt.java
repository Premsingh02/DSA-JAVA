package JULY01;

import java.util.Scanner;

public class arraydeclarationusingNewInt {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 integers");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Printing the array elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
