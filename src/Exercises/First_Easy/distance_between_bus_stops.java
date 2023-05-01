package Exercises.First_Easy;
import java.util.*;
//1184 公交站间的距离
public class distance_between_bus_stops {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int dist = 0, sum = 0, s = Math.min(start, destination), d = Math.max(start, destination);
        for(int i = 0; i < distance.length; i++) {
            if(i < d && i >= s) {
                dist += distance[i];
            }
            sum += distance[i];
        }
        return Math.min(dist, sum - dist);
    }
}
