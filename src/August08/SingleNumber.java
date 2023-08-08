//package August08;
//
//public class SingleNumber {
//    public static int singleNumber(int[] nums){
//        int result;
//        for(int i = 0; i<nums.length; i++){
//            int count = 0;
//            for(int j=0; j<nums.length; j++){
//                if(i==j) continue;
//                if(nums[j]==nums[i]){
//                    result =  nums[i];
//                }
//            }
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//        int[] nums = {4,1,2,1,2};
//        int result = singleNumber(nums);
//        System.out.println(result);
//    }
//}
