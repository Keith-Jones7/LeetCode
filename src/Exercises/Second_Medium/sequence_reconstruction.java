package Exercises.Second_Medium;
import java.util.*;
//444 重建序列
public class sequence_reconstruction {
    public boolean sequenceReconstruction(int[] nums, int[][] sequences) {
        int len = nums.length;
        int count = 0;
        int[] map = new int[len + 1];
        for(int i = 0; i < len - 1; i++) {
            map[nums[i]] = nums[i + 1];
            count++;
        }
        for(int[] sequence : sequences) {
            for(int i = 0; i < sequence.length - 1; i++) {
                if(map[sequence[i]] == sequence[i + 1]) {
                    count--;
                    map[sequence[i]] = -1;
                }
            }
        }
        return count == 0;
    }
}
