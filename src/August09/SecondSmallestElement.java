package August09;

public class SecondSmallestElement {
    public static int findSecondSmallest(int[] nums){
        int largest = nums[0];
        int secondLargest = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(largest<nums[i]){
                secondLargest = largest;
                largest = nums[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,4,6};
        int result = findSecondSmallest(nums);
        System.out.println("The second smallest element is: " + result);
    }
}
