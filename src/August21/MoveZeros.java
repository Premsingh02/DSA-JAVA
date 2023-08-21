package August21;

public class MoveZeros {
    public static int[] moveZeros(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int[] result = moveZeros(nums);
        System.out.println(result);
    }
}
