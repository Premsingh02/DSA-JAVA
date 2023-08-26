package August26;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            // Calculate the sum of elements to the left of index i
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            // Calculate the sum of elements to the right of index i
            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }

            // Check if the sums are equal
            if (leftSum == rightSum) {
                return i; // Pivot index found
            }
        }

        return -1; // No pivot index found
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int result = pivotIndex(nums);
        System.out.println(result);
    }
}
