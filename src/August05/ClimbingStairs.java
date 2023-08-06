package August05;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return climbStairs(n - 1) + climbStairs(n - 2);

        }
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Number of distinct ways: " + climbStairs(n));
    }
}
