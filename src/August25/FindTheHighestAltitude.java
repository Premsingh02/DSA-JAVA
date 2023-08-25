package August25;

import java.util.*;
public class FindTheHighestAltitude {
    public static int maxAltitude(int[] gain) {
        int maxAlt = 0;
        int currentAlt = 0;

        for (int g : gain) {
            currentAlt += g;
            maxAlt = Math.max(maxAlt, currentAlt);
        }

        return maxAlt;
    }

    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int highestAltitude = maxAltitude(gain);

        System.out.println("Highest Altitude: " + highestAltitude);
    }
}
