package August05;
//The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
// such that each number is the sum of the two preceding ones, starting from 0 and 1.
//Given n, calculate F(n).

public class FibonacciNumber {
    public static int fib(int n){
        if(n == 0 || n == 1) return n;
        int a = fib(n-1);
        int b = fib(n-2);
        return a + b;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }
}
