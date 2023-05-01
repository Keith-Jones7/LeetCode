package Exercises.First_Easy;
//1217 玩筹码
public class minimum_cost_to_move_chips_to_the_same_position {
    public int minCostToMoveChips(int[] position) {
        int count_even = 0, len = position.length;
        for (int num : position) {
            count_even += (num & 1);
        }
        return Math.min(count_even, len - count_even);
    }
}
