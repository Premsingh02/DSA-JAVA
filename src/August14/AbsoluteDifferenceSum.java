package August14;

public class AbsoluteDifferenceSum {
    public int maxValue(int n, int k, int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int[] temp = new int[n];
                for (int m = 0; m < n; m++) {
                    for (int l = i; l <= j; l++) {
                        temp[m] += matrix[l][m];
                    }
                }
                for (int m = 0; m < n; m++) {
                    int s = 0;
                    for (int l = m; l < n; l++) {
                        s += temp[l];
                        if (s == k) {
                            sum++;
                        }
                    }
                }
            }
        }
        return sum;
    }
}
