package SortingAlgo;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main() {
        int[] arr = {6,8,3,9,0,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}



/*
This algo is about select the min and swap from its actual pos
matalab ki ham isme the smallest number ka index lenge usko swap kar denge uske asali position se
-> [ 6,8,3,9,0,5]
-> [0, 8,3,9,6,5]
-> [0,3, 8,9,6,5]
-> [0,3,5, 9,6,8]
-> [0,3,5,6, 9,8]
-> [0,3,5,6,8, 9]

time complexity O(n^2)
*/