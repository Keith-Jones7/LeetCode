package Exercises.Second_Medium;

import java.util.Arrays;

//937 重新排列日志文件
public class reorder_data_in_log_files {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (log1, log2) -> {
            String[] split1 = log1.split(" ", 2);
            String[] split2 = log2.split(" ", 2);
            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
            if(!isDigit1 && !isDigit2) {
                int compare = split1[1].compareTo(split2[1]);
                if(compare == 0) {
                    compare = split1[0].compareTo(split2[0]);
                }
                return compare;
            }else if(isDigit2 && !isDigit1){
                return -1;
            }else if(!isDigit2) {
                return 1;
            }
            return 0;
        });
        return logs;
    }
}
