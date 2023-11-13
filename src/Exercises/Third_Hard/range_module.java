package Exercises.Third_Hard;
import java.util.*;
//715 Range模块
public class range_module {
}
class RangeModule {

    private TreeMap<Integer, Integer> intervals;

    public RangeModule() {
        intervals = new TreeMap<>();
    }

    public void addRange(int left, int right) {
        Integer start = intervals.floorKey(left);
        if (start == null) start = intervals.ceilingKey(left);
        while (start != null && start <= right) {
            int end = intervals.get(start);
            if (end >= left) {
                intervals.remove(start);
                if (start < left) left = start;
                if (end > right) right = end;
            }
            start = intervals.ceilingKey(end);
        }
        intervals.put(left, right);
    }

    public boolean queryRange(int left, int right) {
        Integer start = intervals.floorKey(left);
        if (start == null) return false;
        return intervals.get(start) >= right;
    }

    public void removeRange(int left, int right) {
        Integer start = intervals.floorKey(left);
        if (start == null) start = intervals.ceilingKey(left);
        while (start != null && start < right) {
            int end = intervals.get(start);
            if (end >= left) {
                intervals.remove(start);
                if (start < left) intervals.put(start, left);
                if (end > right) intervals.put(right, end);
            }
            start = intervals.ceilingKey(end);
        }
    }
}
