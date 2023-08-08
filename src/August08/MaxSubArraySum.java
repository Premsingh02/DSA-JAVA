package August08;

public class MaxSubArraySum {
    public static int maxSubarraySum(int[] nums){
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j = i; j<nums.length; j++){
                currSum = 0;
                for(int k=i; k<=j; k++){
                    currSum += nums[k];
                }
                if(MaxSum < currSum){
                    MaxSum = currSum;
                }
            }
        }
        return MaxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubarraySum(arr);
        System.out.println(result);
    }
}
