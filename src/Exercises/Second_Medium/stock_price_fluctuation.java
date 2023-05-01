package Exercises.Second_Medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//2034 股票价格波动
public class stock_price_fluctuation {
    int current_time;
    Map<Integer, Integer> stock_price;
    PriorityQueue<int[]> in_sorted_price;
    PriorityQueue<int[]> de_sorted_price;
    public stock_price_fluctuation(){
        stock_price = new HashMap<>();
        in_sorted_price = new PriorityQueue<>(Comparator.comparingInt(x -> x[1]));
        de_sorted_price = new PriorityQueue<>((x, y) -> y[1] - x[1]);
    }
    public void update(int timestamp, int price){
        current_time = Math.max(current_time, timestamp);
        stock_price.put(timestamp, price);
        in_sorted_price.offer(new int[]{timestamp, price});
        de_sorted_price.offer(new int[]{timestamp, price});
    }

    public int current(){
        return stock_price.get(current_time);
    }

    public int maximum(){
        return extremum(de_sorted_price);
    }

    public int minimum(){
        return extremum(in_sorted_price);
    }
    public int extremum(PriorityQueue<int[]> pq){
        while (true){
            int[] max = pq.peek();
            assert max != null;
            int time = max[0], price = max[1];
            if(stock_price.get(time) == price){
                return price;
            }
            pq.poll();
        }
    }
}
