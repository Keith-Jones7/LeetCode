package Exercises.Second_Medium;

import java.util.*;

//735 行星碰撞
public class asteroid_collision {
    public int[] asteroidCollision(int[] asteroids) {
        int[] stack = new int[asteroids.length];
        int index = 0;
        int cur = 0;
        for(int asteroid : asteroids) {
            if(cur == 0) {
                stack[index++] = asteroid;
                if(asteroid > 0) {
                    cur = asteroid;
                }
            }else {
                if(asteroid < 0) {
                    if(cur == (- asteroid)) {
                        index--;
                        cur = Math.max(0, (index > 0) ? stack[index - 1] : 0);
                    }else if(cur < (- asteroid)) {
                        while (index > 0 && (stack[index - 1] > 0 && stack[index - 1] < (- asteroid))) {
                            index--;
                        }
                        if(index == 0) {
                            stack[index++] = asteroid;
                            cur = 0;
                        }else {
                            if(stack[index - 1] < 0) {
                                stack[index++] = asteroid;
                                cur = 0;
                            }else if(stack[index - 1] == (- asteroid)){
                                index--;
                                cur = Math.max(0, (index > 0) ? stack[index - 1] : 0);
                            }else {
                                cur = stack[index - 1];
                            }
                        }
                    }
                }else {
                    stack[index++] = asteroid;
                    cur = asteroid;
                }
            }
        }
        int[] ans = new int[index];
        System.arraycopy(stack, 0, ans, 0, index);
        return ans;
    }
}
