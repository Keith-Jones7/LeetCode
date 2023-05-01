package Exercises.Second_Medium;
//394 字符串解码
public class decode_string {
    public String decodeString(String s) {
        // 不包含嵌套括号，直接返回
        if(!s.contains("[")) {
            return s;
        }

        char[] arr = s.toCharArray();
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < arr.length; ++i){
            // 碰到 字母直接 添加
            if(Character.isLetter(arr[i])){
                ans.append(arr[i]);
            }else{
                //  碰到 数字， 截取重复的数量
                int numRight = i + 1;
                while (numRight < arr.length && Character.isDigit(arr[numRight])) {
                    numRight++;
                }

                int n = Integer.parseInt(s.substring(i, numRight)), count = 1;
                // 对括号的内的字符串进行统计
                int left = numRight, right = numRight + 1;
                while (right < arr.length && count > 0){
                    right++;
                    if(arr[right] == '[') {
                        count++;
                    }
                    if(arr[right] == ']') {
                        count--;
                    }
                }
                //  递归方式 得到重复的结果
                String tempAns = decodeString(s.substring(left + 1, right));

                while ((n--) > 0)  {
                    ans.append(tempAns);
                }
                i = right;
            }
        }
        return ans.toString();
    }
}
