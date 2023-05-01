package Exercises.First_Easy;
//278 第一个错误的版本
public class first_bad_version extends VersionControl {
    public int firstBadVersion(int n){
        int left = 1, right = n;
        while (left < right){
            int mid = left + (right - left)/2;
            if(isBadVersion(mid)){
                right = mid - 1;
            }
            else {
                left = mid;
            }
        }
        return left;
    }
}
class VersionControl{
    boolean isBadVersion(int version){
        return false;
    }
}
