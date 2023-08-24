package August24;

public class LongestKuniquecharacterssubstring {
    public static int longestKSubstr(String s, int k) {
        int[] m = new int[128];
        int uniq = 0, i = 0, j = 0, res = 0, n = s.length();

        while (j < n) {
            // sliding the j-pointer till we have a valid substring
            while (j < n) {
                if (m[s.charAt(j)] == 0) uniq++;
                m[s.charAt(j)]++;
                // if the number of uniq characters increases k, we stop.
                if (uniq > k) break;
                j++;
            }

            // checking if the unique characters are equal to k or k + 1
            if (uniq >= k) res = Math.max(res, j - i);

            if (j == n) break;

            // sliding the i-pointer till we again get k unique characters in
            // the substring
            while (i < n) {
                if (m[s.charAt(i)] == 1) uniq--;
                m[s.charAt(i)]--;

                if (uniq == k) break;
                i++;
            }
            i++;
            j++;
        }
        if (res == 0) return -1;
        return res;
    }

    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(longestKSubstr(s,k));
    }
}
