package August14;
//Given a 2D matrix, print the elements of the matrix in a ZigZag pattern. The order of elements in the
//ZigZag pattern should be from top left to bottom right, with alternate elements being printed from
//bottom right to top left.

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
