package Exercises.Second_Medium;

//825 适龄的朋友
public class friends_of_appropriate_ages {
    public int numFriendRequests(int[] age){
        int count = 0;
        int[] age_count = new int[121];
        for(int person: age){
            age_count[person - 1]++;
        }
        for(int i = 1; i <= age_count.length; i++){
            if(age_count[i - 1] > 1 && i >= 15){
                count += (age_count[i - 1] * (age_count[i - 1] - 1));
            }
            for(int j = i + 1; j <= age_count.length && (i - 7 > j/(double)2); j++){
                count += (age_count[i - 1] * age_count[j - 1]);
            }
        }
        return count;
    }
}
