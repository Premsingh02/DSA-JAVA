//package August04;
////Given an array nums of n integers, return an array of all the unique quadruplets
//// [nums[a], nums[b], nums[c], nums[d]]
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class fourSum {
//    public List<List<Integer>> fourSum(int[] nums, int target){
//        List<List<Integer>> result = new ArrayList<>();
//        Arrays.sort(nums);
//
//        int n = nums.length;
//        for(int a =0; a < n - 3; a++){
//            if(a > 0 && nums[a] == nums[a-1]) continue;
//
//            for(int b = a + 1; b < n - 2; b++){
//                if(b > a + 1 && nums[b] == nums[b-1]) continue;
//
//                int left = b + 1;
//                int right = n - 1;
//
//                while(left < right){
//                    int sum = nums[a] + nums[b] + nums[left] + nums[right];
//
//                    if(sum == target){
//                        result.add(Arrays.asList(nums[a], nums[b], nums[left], nums[right]));
//
//                        while(left < right && nums[left] ==  nums[left + 1]) left++;
//                        while(left < right && nums[right] == nums[right + 1]) right--;
//
//                        left++;
//                        right--;
//                    } else if(sum < target) {
//                        left++;
//                    } else {
//                        right--;
//                    }
//                }
//            }
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {1,0,-1,0,-2,2};
//        int target = 0;
//
//        fourSum fourSum = new fourSum();
//        List<List<Integer>> quadruplets = fourSum.fourSum(nums, target);
//
//        //Output
//        for(List<Integer> quad : quadruplets){
//            System.out.println(quad);
//        }
//
//
//    }
//}
