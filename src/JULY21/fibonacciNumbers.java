package JULY21;

public class fibonacciNumbers {
    public static int printFib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fibnm1 = printFib(n-1);
        int fibnm2 = printFib(n-2);
        int fibofn = fibnm1 + fibnm2;
        return fibofn;
    };
    public static void main(String[] args) {
        int n = 26;
        System.out.println(printFib(n));
    }
}
