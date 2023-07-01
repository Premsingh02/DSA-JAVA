package JULY01;

public class checkPalindrom {
    public static void main(String[] args) {
        int n = 1215;
        int temp = n;
        int rev = 0;

        // reversing n
        while(n>0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        // checking the number is palindrome or not
        if(temp == rev){
            System.out.println("Yes, it is a Palindrome");
        } else {
            System.out.println("No, it is not a Palindrome");
        }
    }
}
