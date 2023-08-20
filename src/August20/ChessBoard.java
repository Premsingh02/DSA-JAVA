package August20;

public class ChessBoard {
    public static char[][] minSteps(int n, int m) {
        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = 'W';
                } else {
                    board[i][j] = 'B';
                }
            }
        }
        return board;
    }

    public static void main(String[] args) {
        int n = 4, m = 4;
        System.out.println(minSteps(n,m));
    }
}
