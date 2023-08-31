package August31;

public class CountingBits {
    private static int popCount(int x) {
        int count;
        for (count = 0; x != 0; ++count) {
            x &= x - 1; // zeroing out the least significant nonzero bit
        }
        return count;
    }

    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int x = 0; x <= n; ++x) {
            ans[x] = popCount(x);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 2;
        int[] result = countBits(n);
        System.out.println(result);
    }
}
