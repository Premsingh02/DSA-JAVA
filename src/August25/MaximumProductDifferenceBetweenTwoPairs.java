package August25;

import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs {
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxProductDiff = (nums[n - 1] * nums[n - 2]) - (nums[0] * nums[1]);
        return maxProductDiff;
    }

    public static void main(String[] args) {
        int[] nums = {5,6,2,7,4};
        int result = maxProductDifference(nums);
        System.out.println(result);
    }
}
