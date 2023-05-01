package Exercises.Second_Medium;
//306 累加数
public class additive_number {
    public boolean isAdditiveNumber(String num){
        int len = num.length();
        if(len < 3){
            return false;
        }
        for(int i = 1; i <= len/2; i++){
            if(num.charAt(0) == '0' && i > 1){
                return false;
            }
            long first = Long.parseLong(num.substring(0, i));
            for(int j = 1; len - i - j >= Math.max(i, j); j++){
                if(num.charAt(i) == '0' && j > 1){
                    break;
                }
                long second = Long.parseLong(num.substring(i, i + j));
                if(isAdd(first, second, i + j, num)){
                    return true;
                }
            }

        }
        return false;
    }
    public boolean isAdd(long first, long second, int start, String num){
        if(start == num.length()){
            return true;
        }
        second = second + first;
        first = second - first;
        String third = String.valueOf(second);
        return num.startsWith(third, start) && isAdd(first, second, start + third.length(), num);
    }
}
