package August10;

public class SecondLargestElement {
    public static int findSecondLargest(int[] nums){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>largest){
                secondLargest = largest;
                largest = nums[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] nums = {5,1,4,6,6,7};
        int result = findSecondLargest(nums);
        System.out.println("The second largest element is: " + result);
    }
}
