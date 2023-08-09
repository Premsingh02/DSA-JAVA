package August09;

public class SmallestElementInArray {
    public static int findLargest(int[] nums){
        int maximum = nums[0];
        for(int i =0; i<nums.length; i++){
            if (nums[i] < maximum) {
                maximum = nums[i];
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        int[] nums = {-10,1,5,6,-11};
        int result = findLargest(nums);
        System.out.println("The smallest element is: " + result);
    }
}
