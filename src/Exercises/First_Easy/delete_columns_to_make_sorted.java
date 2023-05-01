package Exercises.First_Easy;
//944 删列造序
public class delete_columns_to_make_sorted {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int k = strs[0].length();
        int count = 0;
        for(int i = 0; i < k; i++) {
            for(int j = 1; j < n; j++) {
                if(strs[j].charAt(i) - strs[j - 1].charAt(i) >= 0) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
