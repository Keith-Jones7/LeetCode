package Exercises.Second_Medium;
//833 字符串中的查找与替换

import java.util.Arrays;

public class find_and_replace_in_string {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int index = 0;
        char[] chars = s.toCharArray();
        int len = indices.length;
        Replace[] replaces = new Replace[len];
        for (int i = 0; i < len; i++) {
            replaces[i] = new Replace(indices[i], sources[i], targets[i]);
        }
        Arrays.sort(replaces);
        StringBuilder stringBuilder = new StringBuilder();
        for (Replace replace : replaces) {
            int idx = replace.index;
            System.out.println(idx);
            char[] source = replace.source.toCharArray();
            String target = replace.target;
            while (index < idx) {
                stringBuilder.append(chars[index++]);
            }
            boolean flag = true;
            for (int i = 0; i < source.length; i++) {
                if (idx + i >= chars.length || chars[idx + i] != source[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                stringBuilder.append(target);
                index += source.length;
            }
        }
        while (index < chars.length) {
            stringBuilder.append(chars[index++]);
        }
        return stringBuilder.toString();
    }

}
class Replace implements Comparable<Replace>{
    int index;
    String source;
    String target;
    public Replace(int index, String source, String target) {
        this.index = index;
        this.source = source;
        this.target = target;
    }

    @Override
    public int compareTo(Replace replace) {
        return this.index - replace.index;
    }
}
