package Exercises.Second_Medium;
import java.util.*;
//341 扁平化嵌套列表迭代器
public class flatten_nested_list_iterator {

}
class NestedIterator implements Iterator<Integer> {
    private final Iterator<Integer> iterator;
    public NestedIterator(List<NestedInteger> nestedList) {
        List<Integer> list = new ArrayList<>();
        init(list, nestedList);
        iterator = list.iterator();
    }
    private void init(List<Integer> list, List<NestedInteger> nestedList) {
        for (NestedInteger nestInteger : nestedList) {
            if(nestInteger.isInteger()) {
                list.add(nestInteger.getInteger());
            }else {
                init(list, nestInteger.getList());
            }
        }
    }
    public Integer next() {
        return iterator.next();
    }
    public boolean hasNext() {
        return iterator.hasNext();
    }
}
interface NestedInteger {
    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();

    public Integer getInteger();

    public List<NestedInteger> getList();

}