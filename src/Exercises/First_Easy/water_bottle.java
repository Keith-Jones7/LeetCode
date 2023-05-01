package Exercises.First_Easy;
//1518 换酒问题
public class water_bottle {
    public int numWaterBottles(int numBottles, int numExchange){
        return numWater(numBottles, 0, numExchange);
    }
    public int numWater(int numBottles, int emptyBottles, int numExchange){
        if(numBottles + emptyBottles < numExchange){
            return numBottles;
        }
        return numBottles + numWater((numBottles + emptyBottles)/numExchange, (numBottles + emptyBottles) % numExchange, numExchange);
    }
}
