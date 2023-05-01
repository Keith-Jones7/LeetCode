package Exercises.Second_Medium;
import java.util.*;
//1233 删除子文件夹
public class remove_sub_folders_from_the_filesystem {
    public List<String> removeSubFolders(String[] folder) {
        Arrays.sort(folder);
        Set<String> set = new HashSet<>();
        for (String str : folder) {
            boolean flag = false;
            StringBuilder stringBuilder = new StringBuilder();
            char[] chars = str.toCharArray();
            for (char ch : chars) {
                if (ch == '/' && set.contains(stringBuilder.toString())) {
                    flag = true;
                    break;
                }else {
                    stringBuilder.append(ch);
                }
            }
            if (!flag) {
                set.add(str);
            }
        }
        return new ArrayList<>(set);
    }
}

