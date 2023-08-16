package August16;

public class PrintSumOfN {
    public static int printSum(int n){
        if(n==1) return n;
        int snm1 = printSum(n-1);
        int sn = n + snm1;
        return sn;

    }
    public static void main(String[] args) {
        int n = 5;
        int result = printSum(n);
        System.out.println(result);
    }
}
