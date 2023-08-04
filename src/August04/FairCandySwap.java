package August04;
import java.util.HashMap;
import java.util.Map;

public class FairCandySwap {
    public int[] findCandyExchange(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0, bobTotal = 0;
        for (int size : aliceSizes) {
            aliceTotal += size;
        }
        for (int size : bobSizes) {
            bobTotal += size;
        }

        int diff = aliceTotal - bobTotal;
        Map<Integer, Integer> bobCandyMap = new HashMap<>();
        for (int size : bobSizes) {
            bobCandyMap.put(size, bobCandyMap.getOrDefault(size, 0) + 1);
        }

        for (int aliceSize : aliceSizes) {
            int targetBobSize = aliceSize - diff / 2;
            if (bobCandyMap.containsKey(targetBobSize)) {
                return new int[]{aliceSize, targetBobSize};
            }
        }

        // We should never reach this point because it is guaranteed that there is at least one valid pair.
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] aliceSizes = {1,1};
        int[] bobSizes = {2,2};
        FairCandySwap candyExchange = new FairCandySwap();
        int[] result = candyExchange.findCandyExchange(aliceSizes, bobSizes);
        System.out.println("Alice's candy count to exchange: " + result[0]);
        System.out.println("Bob's candy count to exchange: " + result[1]);
    }
}
