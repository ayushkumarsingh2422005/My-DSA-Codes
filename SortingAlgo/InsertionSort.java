package SortingAlgo;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = i;
            while (temp>0 && arr[temp] < arr[temp-1]){
                int swap=arr[temp];
                arr[temp]=arr[temp-1];
                arr[temp-1]=swap;
                temp--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,8,3,9,0,5,7,7};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

/*
time complexity O(n^2)
 */