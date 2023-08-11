package August11;

public class CountOfMathchesInTournament {
    public int numberOfMatches(int n) {
        if (n == 1) {
            return 0;
        } else if (n % 2 == 0) {
            int pairs = n / 2;
            return pairs + numberOfMatches(pairs);
        } else {
            int pairs = (n - 1) / 2;
            return pairs + numberOfMatches(pairs + 1);
        }
    }
}
