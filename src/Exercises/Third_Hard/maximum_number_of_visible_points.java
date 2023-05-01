package Exercises.Third_Hard;
import java.util.*;
//1610 可见点的最大数目
public class maximum_number_of_visible_points {
    public int visiblePoints(List<List<Integer>> points, int angle, List<Integer> location){
        int count = points.size();
        List<Double> point_angle = new ArrayList<>();
        int location_x = location.get(0);
        int location_y = location.get(1);
        int max = 0;
        int count_location = 0;
        for(int i = 0; i < count; i++){
            int x = points.get(i).get(0);
            int y = points.get(i).get(1);
            if(y == location_y && x == location_x){
                count_location++;
            }
            else {
                point_angle.add(Math.atan2(y - location_y, x - location_x));
            }
        }
        Collections.sort(point_angle);
        int size = point_angle.size();
        double theta = Math.toRadians(angle);
        for(int i = 0; i < size; i++){
            point_angle.add(point_angle.get(i) + Math.PI * 2);
        }
        int index = 0;
        for(int i = 0; i < size; i++){
            while (point_angle.get(index) - point_angle.get(i) <= theta && index < size * 2){
                index++;
            }
            max = Math.max(max, index - i);
        }
        return max + count_location;
    }
}
