package August17;

public class SearchinRotatedSortedArray {
    public static int searchSorted(int[] nums, int target){
        int n = nums.length;
        int start = 0;
        int end = n-1;

        while(start <= end ){
            int mid = (start+end)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>nums[start]){
                //subarray on the left is sorted
                if(target>= nums[start] && target < nums[mid]){
                    //go left
                    end = mid -1;
                }
                else {
                    start = mid+1;
                }
            } else {
                //subarray on the right side is sorted
                if(target > nums[mid] && target <= nums[end]){
                    //go right
                    start = mid + 1;
                } else {
                    end = mid -1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
        int result = searchSorted(nums, target);
        System.out.println("The target is on index: " + result);
    }
}
