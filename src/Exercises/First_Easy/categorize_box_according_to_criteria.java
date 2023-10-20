package Exercises.First_Easy;
//2525 根据规则将箱子分类
public class categorize_box_according_to_criteria {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean flag1 = false;
        boolean flag2 = false;
        if (length >= 10000 || width >= 10000 || height >= 10000) {
            flag1 = true;
        }
        if (length * width * height >= 10000) {
            flag1 = true;
        }
        if (mass >= 100) {
            flag2 = true;
        }
        if (flag1 && flag2) {
            return "Both";
        }else if (flag1) {
            return "Bulky";
        }else if (flag2) {
            return "Heavy";
        }else {
            return "Neither";
        }
    }
}
