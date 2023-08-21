package August21;

public class CircularRiver {
    public static int minimumDistance(int[] cities, int K) {
        int N = cities.length;
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int clockwise = 0, antiClockwise = 0;
            for (int j = 0; j < N; j++) {
                int clock = (cities[(i + j) % N] - cities[i] + K) % K;
                int anti = (cities[i] - cities[(i + j) % N] + K) % K;
                clockwise += Math.min(clock, K - clock);
                antiClockwise += Math.min(anti, K - anti);
            }
            distance = Math.min(distance, Math.min(clockwise, antiClockwise));
        }
        return distance;
    }

    public static void main(String[] args) {
        int[] cities = {0,5,15};
        int K = 20;
        int result = minimumDistance(cities,K);
        System.out.println(result);
    }
}
