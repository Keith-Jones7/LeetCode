package Exercises.Second_Medium;

import java.util.TreeSet;

//729 我的日程安排表1
public class my_calendar_1 {
}
class MyCalendar {
    TreeSet<int[]> treeSet;
    public MyCalendar() {
        treeSet = new TreeSet<>((a, b) -> {
            if(a[1] <= b[0]) {
                return -1;
            }else if(a[0] >= b[1]) {
                return 1;
            }else {
                return 0;
            }
        });
    }

    public boolean book(int start, int end) {
        int[] add = new int[]{start, end};
        return treeSet.add(add);
    }
}

