package JULY01;

public class reverseANum {
    public static void main(String[] args) {
        int n = 2324;
        int rev = 0;

        // Loop for reversing the number n
        while(n>0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        System.out.println(rev);
    }
}
