package September01;

public class SingleNumberTwo {
    public static int singleNumber(int[] nums) {
        int seenOnce = 0, seenTwice = 0;

        for (int num : nums) {
            seenOnce = ~seenTwice & (seenOnce ^ num);
            seenTwice = ~seenOnce & (seenTwice ^ num);
        }

        return seenOnce;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,3,2};
        int result = singleNumber(nums);
        System.out.println(result);
    }
}
