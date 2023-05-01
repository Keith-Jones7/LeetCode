package Exercises.Second_Medium;
//991 坏了的计算器
public class broken_calculator {
    public int brokenCalc(int startValue, int target) {
        if(startValue >= target) {
            return startValue - target;
        }
        if(target % 2 == 0) {
            return 1 + brokenCalc(startValue, target / 2);
        }
        return 1 + brokenCalc(startValue, target + 1);
    }

    public static void main(String[] args) {
        int startValue = 3;
        int target = 10;
        broken_calculator broke = new broken_calculator();
        System.out.println(broke.brokenCalc(3, 10));
    }
}
