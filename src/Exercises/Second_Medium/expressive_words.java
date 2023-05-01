package Exercises.Second_Medium;
//809 情感丰富的文字
public class expressive_words {
    public int expressiveWords(String s, String[] words) {
        int ans = 0;
        int[][] map = transfer((s + "A").toCharArray());
        for (String word: words) {
            int index1 = 0, index2 = 0, count = 0;
            char[] chars = (word + "A").toCharArray();
            char cur = chars[0];
            boolean flag = true;
            while (index1 < chars.length) {
                if (chars[index1] != cur) {
                    if ((cur - 'a' + 100) != map[index2][0]) {
                        flag = false;
                        break;
                    }else {
                        if (count > map[index2][1] || (count < map[index2][1] && map[index2][1] < 3)) {
                            flag = false;
                            break;
                        }else {
                            cur = chars[index1];
                            count = 1;
                            index2++;
                        }
                    }
                }else {
                    count++;
                }
                index1++;
            }
            if (flag && map[index2][0] == 0) {
                ans++;
            }
        }
        return ans;
    }
    public int[][] transfer(char[] target) {
        int[][] map = new int[100][2];
        int index1 = 0, index2 = 0, count = 0;
        char cur = target[0];
        while (index1 < target.length) {
            if (target[index1] != cur) {
                map[index2][0] = (cur - 'a' + 100);
                map[index2][1] = count;
                index2++;
                cur = target[index1];
                count = 1;
            }else {
                count++;
            }
            index1++;
        }
        return map;
    }
}
