package Exercises.First_Easy;
//1700 无法吃午餐的的学生数量
public class number_of_students_unable_to_eat_lunch {
    public int countStudents(int[] students, int[] sandwiches) {
        int count0 = 0, count1 = 0;
        for (int student : students) {
            if (student == 0) {
                count0++;
            } else {
                count1++;
            }
        }
        int count = sandwiches.length;
        for (int i = 0; i < sandwiches.length; i++) {
            if (sandwiches[i] == 1) {
                if (count1 > 0) {
                    count1--;
                }else {
                    count = i;
                    break;
                }
            }else {
                if (count0 > 0) {
                    count0--;
                }else {
                    count = i;
                    break;
                }
            }
        }
        return sandwiches.length - count;
    }
}
