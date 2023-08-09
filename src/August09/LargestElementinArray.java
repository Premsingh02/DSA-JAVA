package August09;

public class LargestElementinArray {
    public static int findLargest(int[] nums){
        int maximum = nums[0];
        for(int i =0; i<nums.length; i++){
            if (nums[i] > maximum) {
                maximum = nums[i];
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        int[] nums = {1,20,-10,30};
        int result = findLargest(nums);
        System.out.println(result);
    }
}
