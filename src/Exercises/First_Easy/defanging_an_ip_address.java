package Exercises.First_Easy;
//1108 IP地址无效化
public class defanging_an_ip_address {
    public String defangIPaddr(String address) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = address.toCharArray();
        for(char ch : chars) {
            if(ch == '.') {
                stringBuilder.append('[');
                stringBuilder.append('.');
                stringBuilder.append(']');
            }else {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }
}
