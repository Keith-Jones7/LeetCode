package Exercises.First_Easy;

import java.util.Arrays;

//1710 卡车上的最大单元数
public class maximum_units_on_a_truck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (int[] x1, int[] x2) -> (x2[1] - x1[1]));
        int sum = 0, units = 0;
        for (int[] boxType : boxTypes) {
            if (sum == truckSize) {
                break;
            }
            int num1 = boxType[0], num2 = boxType[1];
            int plus = Math.min(num1, truckSize - sum);
            sum += plus;
            units += plus * num2;
        }
        return units;
    }
}
