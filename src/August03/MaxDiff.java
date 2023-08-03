package August03;
//Given a binary string s of 0's and 1's. The task is to find the maximum difference between the number of 0s
//and the number of 1s (number of 0s — number of 1s) for a substring . In case of all 1s print -1.

public class MaxDiff {
    public static int maxDifference(String s){
        int maxDiff = -1;
        int countZeros = 0;
        int countOnes = 0;

        for(char c : s.toCharArray()){
            if(c == '0'){
                countZeros++;
            } else {
                countOnes++;
            }

            int currentDiff = countZeros - countOnes;
            maxDiff = Math.max(maxDiff,currentDiff);
            countOnes = Math.min(countOnes, countZeros);
        }

        return maxDiff;
    }
    public static void main(String[] args) {
        String binaryString = "11000010001";
        int result = maxDifference(binaryString);
        System.out.println("Maximum difference: " + result);
    }
}
