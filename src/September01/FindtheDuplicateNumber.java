package September01;

public class FindtheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        // 'low' and 'high' represent the range of values of the target
        int low = 1, high = nums.length - 1;
        int duplicate = -1;

        while (low <= high) {
            int cur = (low + high) / 2;

            // Count how many numbers in 'nums' are less than or equal to 'cur'
            int count = 0;
            for (int num : nums) {
                if (num <= cur)
                    count++;
            }
            if (count > cur) {
                duplicate = cur;
                high = cur - 1;
            } else {
                low = cur + 1;
            }
        }
        return duplicate;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int result = findDuplicate(nums);
        System.out.println(result);
    }
}
