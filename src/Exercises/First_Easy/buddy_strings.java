package Exercises.First_Easy;

//859 亲密字符串
public class buddy_strings {
    public static boolean buddyString(String s, String goal){
        if(s.length() != goal.length()){
            return false;
        }
        int count = 0, k = 0;
        int[] swap = {0, 0};
        char[] s_char = s.toCharArray();
        char[] goal_char = goal.toCharArray();
        boolean same = false;
        for(int i = 0; i < s_char.length; i++){
            if(s_char[i] != goal_char[i]){
                if(k > 1){
                    return false;
                }
                swap[k++] = i;
            }
            else {
                int pow = (int)Math.pow(2, s_char[i] - 'a');
                if((count & pow) != 0){
                    same = true;
                }
                else {
                    count = count + pow;
                }
            }
        }
        boolean swap_ = (swap[0] == 0 && swap[1] == 0);
        if(swap[0] == 0 && swap[1] == 0 && same){
            return true;
        }
        return !swap_ && s_char[swap[0]] == goal_char[swap[1]] && s_char[swap[1]] == goal_char[swap[0]];
    }

    public static void main(String[] args) {
        String s = "abcd";
        String goal = "badc";
        buddyString(s, goal);
    }
}
