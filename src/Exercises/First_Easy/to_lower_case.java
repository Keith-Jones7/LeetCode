package Exercises.First_Easy;
//转换成小写字母
public class to_lower_case {
    public String toLowerCase(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 65 && ch <=90){
                ch = (char) (ch + 32);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
