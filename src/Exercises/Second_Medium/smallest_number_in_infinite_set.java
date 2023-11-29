package Exercises.Second_Medium;
import java.util.*;
//2336 无限集中的最小数字
public class smallest_number_in_infinite_set {

}
class SmallestInfiniteSet {
    TreeSet<Integer> treeSet;
    int index = 1;
    public SmallestInfiniteSet () {
        treeSet = new TreeSet<>();
    }

    public int popSmallest() {
        if (!treeSet.isEmpty()) {
            return treeSet.pollFirst();
        }else {
            return index++;
        }
    }
    public void addBack(int num) {
        if (num < index) {
            treeSet.add(num);
        }
    }
}
