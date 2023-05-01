package Exercises.Second_Medium;
import java.util.*;
//1237 找出给定方程的正整数解
public class find_positive_integer_solution_for_a_given_equation {
    public List<List<Integer>> findSolution(CustomFunction customFunction, int z) {
        List<List<Integer>> ans = new ArrayList<>();
        int max_y = 1000;
        for (int x = 1; x < 1001; x++) {
            int y = binarySearch(x, 1, max_y, z, customFunction);
            if (y == 0) {
                return ans;
            }
            if (y != -1) {
                List<Integer> list = new ArrayList<>();
                list.add(x);
                list.add(y);
                ans.add(list);
                max_y = y;
            }
        }
        return ans;
    }

    public int binarySearch(int x, int left, int right, int target, CustomFunction customFunction) {
        while (left < right) {
            int mid = (left + right) / 2;
            int val = customFunction.f(x, mid);
            if (val == target) {
                return mid;
            }else if (val < target) {
                left = mid;
            }else {
                right = mid - 1;
            }
        }
        if (customFunction.f(x, left) == target) {
            return left;
        }else {
            return -1;
        }
    }

}

// This is the custom function interface.
// You should not implement it, or speculate about its implementation
class CustomFunction {
    // Returns f(x, y) for any given positive integers x and y.
    // Note that f(x, y) is increasing with respect to both x and y.
    // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
    public int f(int x, int y) {
        return 0;
    }
};

