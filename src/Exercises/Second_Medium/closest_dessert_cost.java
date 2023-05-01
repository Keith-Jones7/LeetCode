package Exercises.Second_Medium;
//1774 最接近目标价格的甜点成本
public class closest_dessert_cost {
    int best = Integer.MAX_VALUE;
    int target;
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        this.target = target;
        for (int baseCost : baseCosts) {
            dfs(toppingCosts, 0, baseCost);
        }
        return best;
    }
    public void dfs(int[] costs, int index, int sum) {
        int sign = Math.abs(best - target) - Math.abs(sum - target);
        if (sign > 0 || (sign == 0 && sum < best)) {
            best = sum;
        }

        if (sum >= target || index == costs.length) {
            return;
        }
        for (int k = 0; k < 3; k++) {
            dfs(costs, index + 1, sum + costs[index] * k);
        }
    }
}




