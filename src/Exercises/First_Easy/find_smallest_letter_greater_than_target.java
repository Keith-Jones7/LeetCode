package Exercises.First_Easy;
//744 寻找比目标字母大的最小字母
public class find_smallest_letter_greater_than_target {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;
        if(target - letters[right] >= 0) {
            return letters[left];
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if(target < letters[mid]) {
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return letters[left];
    }
}
