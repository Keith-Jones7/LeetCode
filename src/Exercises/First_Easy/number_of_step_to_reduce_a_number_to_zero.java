package Exercises.First_Easy;
//1342 将数字变成0的操作次数
public class number_of_step_to_reduce_a_number_to_zero {
    public int numberOfSteps(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        if(num % 2 == 0){
            return numberOfSteps(num/2) + 1;
        }
        return numberOfSteps(num - 1) + 1;
    }
}
