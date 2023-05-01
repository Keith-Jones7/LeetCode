package Exercises.Third_Hard;
//335 路径交叉

public class self_crossing {
    public boolean isSelfCrossing(int [] distance) {
        int n = distance.length;
        if(n < 4){
            return false;
        }
        for(int i = 3; i < n; i++) {
            if(distance[i] >= distance[i - 2] && distance[i - 1] <= distance[i - 3])
                return true;
            if(i>=4 && (distance[i - 1] == distance [i - 3]) && (distance[i - 2] == (distance[i] + distance[i - 4])))
                return true;
            if(i>=5 && (distance[i] + distance[i - 4] >= distance[i - 2]) && (distance[i - 1] <= distance[i - 3]) && (distance[i - 1] >= distance[i - 3] - distance[i - 5]) && distance[i - 2] > distance[i - 4])
                return true;
        }
        return false;
    }

}
