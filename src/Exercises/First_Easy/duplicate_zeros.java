package Exercises.First_Easy;
//1089 复写0
public class duplicate_zeros {
    public void duplicateZeros(int[] arr) {
        int count = 0, right = arr.length;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                count += 2;
            }else {
                count += 1;
            }
            if(count >= arr.length) {
                right = i;
                break;
            }
        }
        int index = arr.length - 1;
        if(count > arr.length) {
            right--;
            arr[index--] = 0;
        }
        while (index >= 1) {
            if(arr[right] == 0) {
                if(index >= right) {
                    arr[index--] = 0;
                }
                if(index >= right) {
                    arr[index--] = 0;
                }
            }else {
                arr[index--] = arr[right];
            }
            right--;
        }
    }
}
