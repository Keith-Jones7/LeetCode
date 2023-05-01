package Exercises.Second_Medium;
//1706 球会落何处
public class where_will_the_ball_fall {
    int[] answer;
    int[] tempFall;
    public int[] findBall2(int[][] grid) {
        if(grid[0].length == 1){
            return new int[] {-1};
        }
        initialBall(grid[0].length);
        for(int[] baffle : grid) {
            fallBall(baffle);
        }
        transform();
        return answer;
    }
    public void fallBall(int[] baffle) {
        for(int i = 0; i < baffle.length; i++) {
            if(i == 0) {
                if(baffle[i] == -1 && baffle[i + 1] == -1 && answer[i + 1] != -1){
                    tempFall[i] = answer[i + 1];
                }
                else {
                    tempFall[i] = -1;
                }
            }
            else if(i == baffle.length - 1) {
                if(baffle[i] == 1 && baffle[i - 1] == 1 && answer[i - 1] != -1) {
                    tempFall[i] = answer[i - 1];
                }
                else {
                    tempFall[i] = -1;
                }
            }
            else {
                if(baffle[i] == 1 && baffle[i - 1] == 1 && answer[i - 1] != -1){
                    tempFall[i] = answer[i - 1];
                }
                else if(baffle[i] == -1 && baffle[i + 1] == -1 && answer[i + 1] != -1){
                    tempFall[i] = answer[i + 1];
                }
                else {
                    tempFall[i] = -1;
                }
            }
        }
        int[] temp = answer;
        answer = tempFall;
        tempFall = temp;
    }
    public void initialBall(int col){
        answer = new int[col];
        for(int i = 0; i < col; i++) {
            answer[i] = i;
        }
        tempFall = new int[col];
    }
    public void transform(){
        for(int i = 0; i < answer.length; i++) {
            tempFall[i] = -1;
        }
        for(int i = 0; i < answer.length; i++) {
            if(answer[i] != -1){
                tempFall[answer[i]] = i;
            }
        }
        answer = tempFall;
    }
}
