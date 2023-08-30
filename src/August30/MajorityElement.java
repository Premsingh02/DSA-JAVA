package August30;
import java.util.*;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int a = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }
        for (int i = 0; i <= nums.length - 1; i++) {
            if (hm.get(nums[i]) > nums.length / 2) {
                a = nums[i];
            }
        }
        return a;
    }
}
