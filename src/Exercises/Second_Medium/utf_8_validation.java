package Exercises.Second_Medium;
//393 UTF-8 编码验证
public class utf_8_validation {
    public boolean validUtf8(int[] data) {
        int index = 0;
        for (int datum : data) {
            if (index > 0) {
                if (datum >> 6 != 2) {
                    return false;
                }
                index--;
            } else if (datum >> 7 == 0) {
                index = 0;
            } else if (datum >> 5 == 6) {
                index = 1;
            } else if (datum >> 4 == 14) {
                index = 2;
            } else if (datum >> 3 == 30) {
                index = 3;
            } else {
                return false;
            }
        }
        return index == 0;
    }
}
