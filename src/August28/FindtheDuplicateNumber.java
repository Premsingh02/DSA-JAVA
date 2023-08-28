package August28;

import java.util.*;

public class FindtheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int n = nums.length - 1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }

        return -1; // In case no duplicate is found (shouldn't happen according to the problem statement)
    }
}
