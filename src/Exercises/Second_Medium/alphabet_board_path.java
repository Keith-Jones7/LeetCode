package Exercises.Second_Medium;

import java.util.HashMap;

//1138 字母版上的路径
public class alphabet_board_path {
    public String alphabetBoardPath(String target) {
        int[][] map = new int[27][2];
        int index = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                if (index > 25) {
                    break;
                }
                map[index][0] = i;
                map[index][1] = j;
                System.out.println(index + "  " + i + "  " + j);
                index++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        int cur = 0;
        for (char ch : target.toCharArray()) {
            int num = ch - 'a';
            if (cur == num) {
                stringBuilder.append('!');
            }else {
                stringBuilder.append(path(map[cur][0], map[cur][1], map[num][0], map[num][1]));
                stringBuilder.append('!');
                cur = num;
            }
        }
        return stringBuilder.toString();
    }

    public StringBuilder path(int start_x, int start_y, int end_x, int end_y) {
        StringBuilder stringBuilder = new StringBuilder();
        if (start_x == 5) {
            stringBuilder.append('U');
            start_x--;
        }
        while (start_y > end_y) {
            stringBuilder.append('L');
            start_y--;
        }
        while (start_y < end_y) {
            stringBuilder.append('R');
            start_y++;
        }
        while (start_x > end_x) {
            stringBuilder.append('U');
            start_x--;
        }
        while (start_x < end_x) {
            stringBuilder.append('D');
            start_x++;
;       }
        return stringBuilder;
    }
}
