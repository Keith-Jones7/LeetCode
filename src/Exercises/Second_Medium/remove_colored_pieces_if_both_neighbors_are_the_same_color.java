package Exercises.Second_Medium;
//2038 如果相邻两个颜色均相同则删除当前颜色
public class remove_colored_pieces_if_both_neighbors_are_the_same_color {
    public boolean winnerOfGame(String colors) {
        if(colors.length() < 3) {
            return false;
        }
        colors = colors + "C";
        char[] chars = colors.toCharArray();
        char pre_color = 'C';
        int[] count = new int[3];
        int count_continue = 0;
        for (char ch : chars) {
            if (ch != pre_color) {
                count[pre_color - 'A'] += Math.max(0, count_continue - 1);
                count_continue = 0;
            } else {
                count_continue++;
            }
            pre_color = ch;
        }
        return count[0] > count[1];
    }
}
