package August05;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        // Step 1: Convert to lowercase
        s = s.toLowerCase();

        // Step 2: Remove non-alphanumeric characters using regex
        s = s.replaceAll("[^a-z0-9]", "");

        // Step 3: Check if the string is a palindrome using recursion
        return isPalindromeHelper(s, 0, s.length() - 1);
    }

    private static boolean isPalindromeHelper(String s, int left, int right) {
        // Base case: If the left pointer crosses the right pointer, the string is a palindrome.
        if (left >= right) {
            return true;
        }

        // Recursive case: Check if the characters at the left and right pointers are the same.
        // If they are, move the pointers towards each other and continue checking.
        if (s.charAt(left) == s.charAt(right)) {
            return isPalindromeHelper(s, left + 1, right - 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));  // Output: true
        System.out.println(isPalindrome("race a car"));  // Output: false
    }
}
