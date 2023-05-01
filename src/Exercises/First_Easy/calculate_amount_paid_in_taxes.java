package Exercises.First_Easy;
//2303 计算应缴税款总额
public class calculate_amount_paid_in_taxes {
    public double calculateTax(int[][] brackets, int income) {
        double tax = 0;
        int pre = 0;
        for (int[] bracket : brackets) {
            int upper = bracket[0];
            int percent = bracket[1];
            if (income < upper) {
                tax += ((income - pre) * (percent / 100.0));
                break;
            } else {
                tax += ((upper - pre) * (percent / 100.0));
                pre = upper;
            }
        }
        return tax;
    }
}
