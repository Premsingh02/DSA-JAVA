package August17;

public class FindPeakElements {
    public static int findPeak(int[] nums){
        int n = nums.length;
        int peak = 0;
        if(nums[0] > nums[1]){
            peak = 0;
        }
        if(nums[n-1] > nums[n-2]){
            peak = n-1;
        }

        //search in the remaining array
        int start = 1;
        int end = n-1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            else if (nums[mid] < nums[mid-1]) {
                end = mid -1;
            } else if (nums[mid]<nums[mid+1]) {
                start = mid + 1;
            }
        }

        return -1; // dummy return statement
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int result = findPeak(nums);
        System.out.println("The peak element index is:" + result);

    }
}
