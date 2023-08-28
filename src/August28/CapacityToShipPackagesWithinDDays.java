package August28;

public class CapacityToShipPackagesWithinDDays {
    public static int shipWithinDays(int[] weights, int days) {
        int maxWeight = 0;
        int totalWeight = 0;

        for (int weight : weights) {
            maxWeight = Math.max(maxWeight, weight);
            totalWeight += weight;
        }

        int minCapacity = maxWeight;
        while (true) {
            int currentDays = 1;
            int currentCapacity = minCapacity;
            for (int weight : weights) {
                if (currentCapacity - weight < 0) {
                    currentDays++;
                    currentCapacity = minCapacity;
                }
                currentCapacity -= weight;
            }

            if (currentDays <= days) {
                return minCapacity;
            }

            minCapacity++;
        }
    }
}
