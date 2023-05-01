package Exercises.Second_Medium;

import java.util.Arrays;

//475 供暖器
public class heaters {
    public int findRadius(int[] houses, int[] heaters){
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int radius = 0;
        int n = heaters.length;
        int i = 0;
        for (int house : houses) {
            while (i < n && heaters[i] < house) {
                i++;
            }
            if (i == 0) {
                radius = Math.max(radius, heaters[i] - house);
            } else if (i == n) {
                radius = Math.max(radius, houses[houses.length - 1] - heaters[n - 1]);
            } else {
                radius = Math.max(radius, Math.min(heaters[i] - house, house - heaters[i - 1]));
            }
        }
        return radius;
    }
}
