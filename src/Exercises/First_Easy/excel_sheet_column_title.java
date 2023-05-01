package Exercises.First_Easy;
//168 Excel表列名称
public class excel_sheet_column_title {
    public String convertToTitle(int columnNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            stringBuilder.append((char) ('A' + columnNumber % 26));
            columnNumber = columnNumber / 26;
        }
        return stringBuilder.reverse().toString();
    }
}
