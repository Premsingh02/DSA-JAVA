package September01;
import java.util.*;
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash_table = new HashMap<>();

        for (int i : nums) {
            hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
        }
        for (int i : nums) {
            if (hash_table.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int result = singleNumber(nums);
        System.out.println(result);
    }
}
