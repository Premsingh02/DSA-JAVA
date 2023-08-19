package August19;

public class SimpleNumbers1 {
    public static String isAwesome(int n) {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2)) {
                return "Awesome";
            }
        }
        return "Good";
    }

    public static void main(String[] args) {
        String n = "12333";
        String result = isAwesome(Integer.parseInt(n));
        System.out.println(result);
    }
}
