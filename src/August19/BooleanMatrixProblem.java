package August19;

public class BooleanMatrixProblem {
    public static int[][] fillMatrixRows(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    for (int k = 0; k < n; k++) {
                        mat[i][k] = 1;
                    }
                    break;
                }
            }
        }
        return mat;
    }

}
