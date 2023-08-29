package August29;

public class MinimumNumberofDaystoMakemBouquets {
    public boolean isPossible(int mid, int[] bloomDay, int m, int k) {

        int n = bloomDay.length;
        int ans = 0;
        int i = 0;
        while (i < n) {
            int ct = 0;
            while (i < n && bloomDay[i] <= mid) {
                ct++;
                i++;
            }
            ans += ct / k;
            i++;
        }

        return ans >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int low = 1;
        int high = 1000000000;

        int n = bloomDay.length;

        if (n / k < m) {
            return -1;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(mid, bloomDay, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
