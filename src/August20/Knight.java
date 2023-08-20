package August20;

public class Knight {
    static int[] row = {2, 2, -2, -2, 1, 1, -1, -1};
    static int[] col = {1, -1, 1, -1, 2, -2, 2, -2};
    public static int countReachable(int x, int y) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int x1 = x + row[i];
            int y1 = y + col[i];
            if (x1 >= 1 && x1 <= 8 && y1 >= 1 && y1 <= 8) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int x = 4, y = 5;
        int result = countReachable(x,y);
        System.out.println(result);
    }

}
