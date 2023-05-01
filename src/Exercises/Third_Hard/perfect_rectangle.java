package Exercises.Third_Hard;

//391 重构矩形
public class perfect_rectangle {
    public static boolean isRectangleCover(int[][] rectangles){
        if(rectangles.length == 1){
            return true;
        }
        int left = rectangles[0][0];
        int down = rectangles[0][1];
        int right = rectangles[0][2];
        int up = rectangles[0][3];
        int area_sum = 0;
        for(int i = 0; i < rectangles.length; i++){
            for(int j = i + 1; j < rectangles.length; j++){
                boolean nonIntersect = (rectangles[j][2] <= rectangles[i][0])||(rectangles[j][0] >= rectangles[i][2])||(rectangles[j][1] >= rectangles[i][3])||(rectangles[j][3] <= rectangles[i][1]);
                if(!nonIntersect){
                    return false;
                }
            }
            area_sum += (rectangles[i][2] - rectangles[i][0]) * (rectangles[i][3] - rectangles[i][1]);
            left = Math.min(rectangles[i][0], left);
            down = Math.min(rectangles[i][1], down);
            right = Math.max(rectangles[i][2], right);
            up = Math.max(rectangles[i][3], up);
        }
        int edge_area = (right - left) * (up - down);
        return edge_area == area_sum;
    }

    public static void main(String[] args) {
        int[][] rectangles = {{0,0,1,1}, {0,1,3,2}, {1,0,2,2}};
        isRectangleCover(rectangles);
    }

}
