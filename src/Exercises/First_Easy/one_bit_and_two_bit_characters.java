package Exercises.First_Easy;
//717 1比特与2比特字符
public class one_bit_and_two_bit_characters {
    public boolean isOneBitCharacter(int[] bits){
        int index = 0;
        while (index < bits.length){
            if(index == bits.length - 1 && bits[index] == 0){
                return true;
            }
            if(bits[index] == 1){
                index = index + 2;
            }
            else {
                index++;
            }
        }
        return false;
    }
}
