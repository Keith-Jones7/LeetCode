package Exercises.Second_Medium;
//911 在线选举

public class online_election {
    int[] votes;
    int[] time_votes;
    int[] times;
    public online_election(int[] person, int[] times){
        votes = new int[person.length];
        time_votes = new int[times.length];
        this.times = times;
        int temp_max = person[0];
        votes[temp_max]++;
        for(int i = 1; i < person.length; i++){
            int temp_person = person[i];
            votes[temp_person]++;
            if(votes[temp_person] >= votes[temp_max]){
                time_votes[i] = temp_person;
                temp_max = temp_person;
            }
            else {
                time_votes[i] = temp_max;
            }
        }
    }
    public int q(int t){
        return time_votes[search(t)];
    }
    public int search(int t){
        int left = 0;
        int right = times.length - 1;
        while(left <= right){
            int mid = (right + left)/2;
            if(times[left] > t){
                return left - 1;
            }
            if(times[right] < t){
                return right;
            }
            if(times[mid] == t){
                return mid;
            }
            if(times[mid] < t){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return left;
    }
}

