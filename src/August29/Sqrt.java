package August29;

public class Sqrt {
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        for (int i = 1; i <= x; i++) {
            // Check if i * i is greater than x, then return (i - 1) as the result
            if (i > x / i) {
                return i - 1;
            }
        }

        return x; // x itself is the result if not found earlier
    }
}
