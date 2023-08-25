package August25;

import java.util.*;
public class FindAllAnagramsInAString {
    public static List<Integer> findAnagrams(String s, String p){
        List<Integer> result = new ArrayList<>();

        int slen = s.length();
        int plen = p.length();

        for(int i = 0; i <= slen - plen; i++){
            if(isAnagram(s.substring(i,i + plen), p)){
                result.add(i);
            }
        }
        return result;
    }

    public static boolean isAnagram(String s1, String s2){
        int[] count = new int[26]; // Assuming lowercase English Letters

        for(char c : s1.toCharArray()){
            count[c-'a']++;
        }

        for(char c : s2.toCharArray()){
            count[c-'a']--;
        }

        for(int c : count){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> indices = findAnagrams(s,p);

        System.out.println("Anagram Start Indices:" + indices);
    }

}
