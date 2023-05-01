package Exercises.Second_Medium;

//2055 蜡烛之间的盘子
public class plates_between_candles {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        char[] chars = s.toCharArray();
        //求前缀和
        int[] preSum = new int[chars.length];
        int preIndex = 0;
        while (preIndex < chars.length && chars[preIndex] == '*') {
            preIndex++;
        }
        int index = preIndex + 1;
        while (index < chars.length) {
            if(chars[index] == '|') {
                preSum[index] = preSum[preIndex] + (index - preIndex - 1);
                preIndex = index;
            }
            else {
                preSum[index] = preSum[index - 1];
            }
            index++;
        }
        //求最右边的蜡烛位置
        int[] right = new int[chars.length];
        right[chars.length - 1] = chars.length - 1;
        for(int i = chars.length - 2; i >= 0; i--) {
            if(chars[i] == '|') {
                right[i] = i;
            }
            else {
                right[i] = right[i + 1];
            }
        }

        int[] answer = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            if(right[queries[i][0]] > queries[i][1]) {
                answer[i] = 0;
            }
            else {
                answer[i] = preSum[queries[i][1]] - preSum[right[queries[i][0]]];
            }
        }
        return answer;
    }
}
