package Exercises.First_Easy;
//1185 一周中的第几天
public class day_of_the_week {
    public String dayOfTheWeek(int day, int month, int year){
        if(month == 1 || month == 2){
            year--;
            month += 12;
        }
        int century = year/100;
        int y = year % 100;
        String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int week = (century / 4) - 2 * century + y + (y / 4) + (13 * (month + 1) / 5) + day - 1;
        return weeks[week % 7 - 1];
    }
}
