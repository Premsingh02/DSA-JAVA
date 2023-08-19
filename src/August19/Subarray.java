package August19;

public class Subarray {
    public static int minimumModifications(int[] arr) {
        int n = arr.length;
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        for (int i = 0; i < n; i++) {
            dp1[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp1[i] = Math.max(dp1[i], dp1[j] + 1);
                }
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            dp2[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + 1);
                }
            }
        }

        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            maxLength = Math.max(maxLength, dp1[i] + dp2[i] - 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 3};
        int result = minimumModifications(arr);
        System.out.println(result);
    }
}
