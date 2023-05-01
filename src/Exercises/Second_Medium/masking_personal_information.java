package Exercises.Second_Medium;
//831 隐藏个人信息
public class masking_personal_information {
    public String maskPII(String s) {
        int index = s.indexOf("@");
        if (index == -1) {
            return maskPhone(s);
        }else {
            return maskEmail(s);
        }
    }

    public String maskEmail(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] strs = s.split("@");
        stringBuilder.append(Character.toLowerCase(strs[0].charAt(0)));
        stringBuilder.append("*".repeat(5));
        stringBuilder.append(Character.toLowerCase(strs[0].charAt(strs[0].length() - 1)));
        stringBuilder.append("@");
        for (char ch : strs[1].toCharArray()) {
            if (Character.isLetter(ch)) {
                stringBuilder.append(Character.toLowerCase(ch));
            }else {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }

    public String maskPhone(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                stringBuilder.append(ch);
            }
        }
        int count = stringBuilder.length() - 10;
        StringBuilder stringBuilder1 = new StringBuilder();
        if (count > 0) {
            stringBuilder1.append( "+");
            stringBuilder1.append("*".repeat(count));
            stringBuilder1.append("-");
        }
        stringBuilder1.append("*".repeat(3));
        stringBuilder1.append("-");
        stringBuilder1.append("*".repeat(3));
        stringBuilder1.append("-");
        return stringBuilder1.append(stringBuilder.substring(stringBuilder.length() - 4, stringBuilder.length()
        )).toString();
    }
}
