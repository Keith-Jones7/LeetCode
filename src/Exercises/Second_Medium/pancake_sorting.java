package Exercises.Second_Medium;
import java.util.*;

//969 煎饼排序
public class pancake_sorting {
    List<Integer> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<Integer> pancakeSort(int[] arr){
        for(int i : arr){
            list.add(i);
        }
        sort();
        return ans;
    }
    public void sort(){
        int size = list.size();
        if(size == 0){
            return;
        }
        int maxIndex = getMaxIndex(size);
        reverse(maxIndex, size);
        list.remove(size - 1);
        ans.add(maxIndex + 1);
        ans.add(size);
        sort();
    }
    public int getMaxIndex(int size){
        int index = 0;
        int max = list.get(0);
        for(int i = 1; i < size; i++){
            int num = list.get(i);
            if(num > max){
                index = i;
                max = num;
            }
        }
        return index;
    }
    public void reverse(int index, int size){
        for(int right = size - 1, left = 0; left < size - 1 - index;left++){
            list.add(left, list.remove(right));
        }
    }
}
