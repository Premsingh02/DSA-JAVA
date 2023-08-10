package August10;

import java.util.ArrayList;

public class RemoveDuplicatesfromSortedArray {
    public ArrayList<Integer> removeDuplicates(ArrayList<Integer> nums) {
        int n = nums.size();
        int i = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i < n) {
            int x = nums.get(i);
            while (i < n && x == nums.get(i)) {
                i++;
            }
            ans.add(x);
        }
        return ans;
    }

}
