package August31;

import java.util.*;

public class GrayCode {
    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        int totalNumbers = 1 << n; // Calculate the total number of integers (2^n)

        for (int i = 0; i < totalNumbers; i++) {
            result.add(i ^ (i >> 1)); // Convert binary to Gray code
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 3; // Change this to the desired number of bits

        GrayCode grayCodeGenerator = new GrayCode();
        List<Integer> grayCodeSequence = grayCodeGenerator.grayCode(n);

        System.out.println("Gray Code Sequence:");
        for (int num : grayCodeSequence) {
            System.out.print(num + " ");
        }
    }
}
