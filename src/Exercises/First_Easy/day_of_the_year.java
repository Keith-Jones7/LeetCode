package Exercises.First_Easy;
//1154 一年中的第几天
public class day_of_the_year {
    public int dayOfYear(String date) {
        String[] s = date.split("-");
        int year = atoi(s[0]);
        int month = atoi(s[1]);
        int day = atoi(s[2]);
        boolean Feb = isLeapYear(year);
        int sumday = 0;
        for(int i = 1; i < month; i++) {
            sumday += countDayOfMonth(i, Feb);
        }
        return day + sumday;
    }
    public int atoi(String s) {
        int num = 0;
        for(int i = 0; i < s.length(); i++) {
            int pow = s.length() - i - 1;
            num += (s.charAt(i) - '0') * (int)Math.pow(10, pow);
        }
        return num;
    }
    public boolean isLeapYear(int year) {
        if(year % 4 != 0) {
            return false;
        }
        return year % 100 != 0 || year / 100 % 4 == 0;
    }
    public int countDayOfMonth(int month, boolean Feb) {
        if(month == 2) {
            return Feb ? 29 : 28;
        }
        if(month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        return 31;
    }
}
