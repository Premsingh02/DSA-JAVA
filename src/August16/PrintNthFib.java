package August16;

public class PrintNthFib {
    public static int fib(int n){
        if (n == 0 || n ==1) return n;
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-1);
        int fibOfN = fib(n-1) + fib(n-2);
        return fibOfN;
    }
    public static void main(String[] args) {
        int n = 25;
        int result = fib(n);
        System.out.println("fib of n is: " + result);
    }
}
