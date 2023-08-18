package August18;

public class CapacityToShipPackagesWithinDDays {
    // Check whether the packages can be shipped in less than "days" days with
    // "c" capacity.
    static Boolean feasible(int[] weights, int c, int days) {
        int daysNeeded = 1, currentLoad = 0;
        for (int weight : weights) {
            currentLoad += weight;
            if (currentLoad > c) {
                daysNeeded++;
                currentLoad = weight;
            }
        }

        return daysNeeded <= days;
    }

    public static int shipWithinDays(int[] weights, int days) {
        int totalLoad = 0, maxLoad = 0;
        for (int weight : weights) {
            totalLoad += weight;
            maxLoad = Math.max(maxLoad, weight);
        }

        int l = maxLoad, r = totalLoad;

        while (l < r) {
            int mid = (l + r) / 2;
            if (feasible(weights, mid, days)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int result = shipWithinDays(weights,days);
        System.out.println(result);
    }
}
