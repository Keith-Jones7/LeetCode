package Exercises.First_Easy;

//824 山羊拉丁文
public class goat_latin {
    public String toGoatLatin(String sentence) {
        char[] chars = (sentence + " ").toCharArray();
        boolean isStart = true;
        StringBuilder stringBuilder = new StringBuilder();
        int index = 1;
        char consonant = '0';
        for (char ch : chars) {
            if (ch == ' ') {
                isStart = true;
                if (consonant != '0') {
                    stringBuilder.append(consonant);
                }
                stringBuilder.append("ma");
                stringBuilder.append("a".repeat(index));
                stringBuilder.append(' ');
                index++;
                continue;
            }
            if (isStart) {
                if (isVowel(Character.toLowerCase(ch))) {
                    consonant = '0';
                    stringBuilder.append(ch);
                } else {
                    consonant = ch;
                }
                isStart = false;
            } else {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
    }
    public boolean isVowel(Character character) {
        if(character == 'a') {
            return true;
        }
        if(character == 'e') {
            return true;
        }
        if(character == 'o') {
            return true;
        }
        if(character == 'i') {
            return true;
        }
        return character == 'u';
    }
}
