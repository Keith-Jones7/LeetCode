package Exercises.Second_Medium;
//686 重复叠加的字符串匹配
public class repeated_string_match {
    public int repeatStringMatch(String a, String b){
        if(b == null) return 0;
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();
        //先查看a中包含哪些字符
        boolean[] alpha = new boolean[26];
        for(char c : A) {
            alpha[c - 'a'] = true;
        }
        //遍历b中的字符，如果a中不包含，直接返回-1，就是这一步从367ms降到了1ms
        for(char c : B) {
            if(!alpha[c - 'a']) return -1;
        }
        int length_a = a.length();
        int length_b = b.length();
        if(length_b <= length_a){
            if(!a.contains(b)){
                String aa = a + a;
                if(!aa.contains(b)){
                    return -1;
                }
                return 2;
            }
            else {
                return 1;
            }
        }
        int index1 = b.indexOf(a);
        if(length_b % length_a == 0){
            int count = length_b/length_a;
            if(index1 != 0){
                count++;
            }
            StringBuilder str = new StringBuilder(a);
            str.append(a.repeat(Math.max(0, count)));
            if(str.toString().contains(b)){
                return count;
            }
            else {
                return -1;
            }
        }
        else {
            int count = (length_b - index1)/length_a;
            int index2 = index1 + length_a * count;
            int start = 0, end = 0;
            if(index1 > 0){
                start = 1;
            }
            if(index2 < length_b){
                end = 1;
            }
            StringBuilder str = new StringBuilder(a);
            count = count + start + end;
            str.append(a.repeat(Math.max(0, count)));
            if(str.toString().contains(b)){
                return count;
            }
            else {
                return -1;
            }
        }
    }
}
