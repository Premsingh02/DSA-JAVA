package August24;

import java.util.*;

public class Findthemaximumofeverysubarrayofsizek {
    public static List<Integer> maxOfSubArray(int[] arr, int k) {
        int j, maxi;
        List<Integer> ans = new ArrayList<Integer>();
        int N = arr.length;

        for (int i = 0; i <= N - k; i++) {
            maxi = arr[i];

            for (j = 1; j < k; j++) {
                if (arr[i + j] > maxi)
                    maxi = arr[i + j];
            }
            ans.add(maxi);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,4,5,2,3,6};
        int k = 3;
        System.out.println(maxOfSubArray(nums,k));

    }
}
