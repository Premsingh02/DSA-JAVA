package August22;

public class SumOfNumbersInRange {
    public static int sum_of_numbers_in_range(int[] interval) {
        int sum = 0;
        for (int i = interval[0]; i <= interval[1]; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] interval = {1,5};
        int result = sum_of_numbers_in_range(interval);
        System.out.println(result);
    }
}
