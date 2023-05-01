package Exercises.Third_Hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//786 第k个最小素数
public class k_th_smallest_prime_fraction {
    public int[] kthSmallestPrimeFraction_1(int[] arr, int k){
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                int[] arr1 = {arr[i], arr[j]};
                list.add(arr1);
            }
        }
        Collections.sort(list, (x, y) -> x[0] * y[1] - y[0] - x[1]);
        return list.get(k - 1);
    }
    public int[] kthSmallestPrimeFraction(int[] arr, int k){
        List<List<int[]>> kList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            List<int[]> subKList = new ArrayList<>();
            for(int j = arr.length - 1; j > i; j--){
                int[] arr1 = {arr[i], arr[j]};
                subKList.add(arr1);
            }
            kList.add(subKList);
        }
        List<int[]> list = mergeKList(kList);
        return list.get(k - 1);
    }
    public List<int[]> mergeTwoList(List<int[]> list1, List<int[]> list2){
        if(list1.isEmpty()){
            return list2;
        }
        if(list2.isEmpty()){
            return list1;
        }
        List<int[]> list = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;
        while(index1 < list1.size() || index2 < list2.size()){
            if(index1 == list1.size()){
                list.add(list2.get(index2++));
                continue;
            }
            if(index2 == list2.size()){
                list.add(list1.get(index1++));
                continue;
            }
            int[] arr1 = list1.get(index1);
            int[] arr2 = list2.get(index2);
            int num1 = arr1[0] * arr2[1];
            int num2 = arr1[1] * arr2[0];
            if(num1 < num2){
                list.add(arr1);
                index1++;
            }
            else {
                list.add(arr2);
                index2++;
            }
        }
        return list;
    }
    public List<int[]> mergeKList(List<List<int[]>> kList){
        List<int[]> list = new ArrayList<>();
        if(kList.size() == 0){
            return list;
        }
        if(kList.size() == 1){
            return kList.get(0);
        }
        if(kList.size() == 2){
            return mergeTwoList(kList.get(0), kList.get(1));
        }
        int k = kList.size();
        int mid = k/2;
        List<List<int[]>> kList1 = new ArrayList<>();
        for(int i = 0; i < mid; i++){
            kList1.add(kList.get(i));
        }
        List<List<int[]>> kList2 = new ArrayList<>();
        for(int i = mid; i < k; i++){
            kList2.add(kList.get(i));
        }
        return mergeTwoList(mergeKList(kList1), mergeKList(kList2));
    }

    public static void main(String[] args) {
        k_th_smallest_prime_fraction test = new k_th_smallest_prime_fraction();
        int[] arr = {1,2,3,5};
        int k = 3;
        test.kthSmallestPrimeFraction(arr, k);
    }

}
