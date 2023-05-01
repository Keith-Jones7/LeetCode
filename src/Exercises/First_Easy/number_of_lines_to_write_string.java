package Exercises.First_Easy;
//806 写字符串需要的行数

public class number_of_lines_to_write_string {
    public int[] numberOfLines(int[] widths, String s) {
        char[] chars = s.toCharArray();
        int count_col = 0;
        int count_row = 0;
        for(char ch : chars) {
            int count = widths[ch - 'a'];
            if(count_row + count > 100) {
                count_col++;
                count_row = count;
            }else {
                count_row += count;
            }
        }
        if(count_row > 0) {
            count_col++;
        }
        return new int[]{count_col, count_row};
    }
}
