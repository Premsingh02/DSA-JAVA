package August22;

public class Factorial {
    public static long factorial(int fact) {
        if (fact <= 1) {
            return 1;
        }
        return fact * factorial(fact - 1);
    }

    public static void main(String[] args) {
        int fact = 7;
        int result = (int) factorial(fact);
        System.out.println(result);
    }
}
