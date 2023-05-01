package Exercises.First_Easy;

import java.util.*;

//929 独特的电子邮件地址
public class unique_email_addresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email : emails) {
            set.add(filter(email));
        }
        return set.size();
    }
    public String filter(String email) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = email.toCharArray();
        int index = 0;
        while (index < chars.length) {
            if(chars[index] == '+') {
                break;
            }
            if(chars[index] == '@') {
                break;
            }
            if(chars[index] == '.') {
                index++;
                continue;
            }
            stringBuilder.append(chars[index++]);
        }
        while (index < chars.length && chars[index] != '@') {
            index++;
        }
        while (index < chars.length) {
            stringBuilder.append(chars[index++]);
        }
        return stringBuilder.toString();
    }
}
