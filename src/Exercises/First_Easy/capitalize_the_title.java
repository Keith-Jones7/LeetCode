package Exercises.First_Easy;
//2129 将标题首字母大写
public class capitalize_the_title {
    public String capitalizeTitle(String title) {
        String[] strings = title.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strings) {
            if (str.length() < 3) {
                for (char ch : str.toCharArray()) {
                    stringBuilder.append(Character.toLowerCase(ch));
                }
            }else {
                char[] chars = str.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    chars[i] = Character.toLowerCase(chars[i]);
                }
                chars[0] = Character.toUpperCase(chars[0]);
                for (char ch : chars) {
                    stringBuilder.append(ch);
                }
            }
            stringBuilder.append(" ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}
