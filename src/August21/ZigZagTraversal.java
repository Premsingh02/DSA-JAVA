package August21;

public class ZigZagTraversal {
    public static void zigzagLevelOrder(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[j][i] + " ");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(arr[j][i] + " ");
                }
            }
        }
        System.out.println();
    }
}
