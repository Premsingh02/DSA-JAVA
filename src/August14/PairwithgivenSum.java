package August14;

public class PairwithgivenSum {
    public int[] findPairWithGivenSum(int[] arr, int targetSum) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }

        return new int[0];
    }
}
