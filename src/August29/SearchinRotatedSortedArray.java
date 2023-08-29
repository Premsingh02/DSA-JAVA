package August29;

public class SearchinRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int s = 0, e = nums.length-1;

        while(s <= e){
            int mid = s + (e - s) / 2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>nums[s]){
                //subarray in the left is sorted
                if(target >= nums[s] && target < nums[mid]){
                    //go left
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else {
                //subarray on the right is sorted
                if(target > nums[mid] && target <= nums[e]){
                    //go right
                    s = mid+1;
                } else {
                    e = mid -1;
                }
            }
        }
        return -1;
    }
}
