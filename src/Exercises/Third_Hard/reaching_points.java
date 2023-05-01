package Exercises.Third_Hard;
//780 到达终点
public class reaching_points {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        if(tx < sx || ty < sy) {
            return false;
        }
        while (tx > 0 && ty > 0) {
            if(tx == sx && ty == sy) {
                return true;
            }
            if(tx > ty) {
                tx -= Math.max((tx - sx) / ty, 1) * ty;
            }else {
                ty -= Math.max((ty - sy) / tx, 1) * tx;
            }
        }
        return false;
    }
}
