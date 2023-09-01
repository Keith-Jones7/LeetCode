package Exercises.Second_Medium;
//2240 买钢笔和铅笔的方案数
public class number_of_way_to_buy_pens_and_pencils {
    public long wayToBuyPensPencils(int total, int cost1, int cost2) {
        int max = Math.max(cost1, cost2);
        int min = Math.min(cost1, cost2);
        long ans = 0;
        for (int i = 0; i * max <= total; i++) {
            int surPlus = total - i * max;
            ans += (surPlus / min);
        }
        return ans;
    }
}
