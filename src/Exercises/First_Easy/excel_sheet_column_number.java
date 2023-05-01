package Exercises.First_Easy;
//171 Excel表列序号
public class excel_sheet_column_number {
    public int titleToNumber(String columnTitle) {
        char[] chars = columnTitle.toCharArray();
        int num = 0;
        int POW = 1;
        for(int i = 0; i < chars.length; i++) {
            num += ((chars[chars.length - 1 - i] - 'A' + 1) * POW);
            POW *= 26;
        }
        return num;
    }
}
