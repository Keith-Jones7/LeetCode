package Exercises.Second_Medium;
//275 H指数2
public class h_index_2 {
    public int hIndex(int[] citations) {
        int left = 0, right = citations.length - 1, len = citations.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int cite = citations[mid];
            int cnt = len - mid;
            if (cite >= cnt) {
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return Math.min(citations[left], len - left);
    }
}
