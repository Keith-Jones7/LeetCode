package Exercises.First_Easy;
//860 柠檬水找零
public class lemonade_change {
    public boolean lemonadeChange(int[] bills) {
        int count1 = 0, count2 = 0;
        for(int bill : bills) {
            if(bill == 5) {
                count1++;
            }else if(bill == 10) {
                if(count1 == 0) {
                    return false;
                }else {
                    count1--;
                    count2++;
                }
            }else {
                if(count1 == 0) {
                    return false;
                }
                if(count2 == 0 && count1 < 3) {
                    return false;
                }
                if(count2 > 0) {
                    count2--;
                    count1--;
                }else {
                    count1 -= 3;
                }
            }
        }
        return true;
    }
}
