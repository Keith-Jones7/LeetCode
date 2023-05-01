package Exercises.First_Easy;

import java.util.*;

//2299 强密码检验器2
public class strong_password_checker_2 {
    public boolean strongPasswordChecker2(String password) {
        password += " ";
        Set<Character> sp = new HashSet<>();
        String str = "!@#$%^&*()-+";
        for (char ch : str.toCharArray()) {
            sp.add(ch);
        }
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;
        for (int i = 0; i < password.length() - 1; i++) {
            char ch = password.charAt(i);
            if (ch == password.charAt(i + 1)) {
                return false;
            }
            if (((ch - 'a') >= 0) && ((ch - 'a') <= 25)) {
                b1 = true;
            }else if (((ch - 'A') >= 0) && ((ch - 'A') <= 25)) {
                b2 = true;
            }else if (((ch - '0') >= 0) && ((ch - '0') <= 9)) {
                b3 = true;
            }else if (sp.contains(ch)) {
                b4 = true;
            }
        }
        return (password.length() > 8) && b1 && b2 && b3 && b4;
    }
}
