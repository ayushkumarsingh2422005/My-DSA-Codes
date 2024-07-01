package SortingAlgo;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main() {
        int[] arr = {6,8,3,9,0,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

/*
Similar to Selection sort
lekin yaha bigger element ko akhiri wale se swap karte h
2 element lo dekho kaun bada bade wale ko piche karo aur chote ko aage kkarte jao, phir repeet karo har baar usko

time complexity O(n^2)
*/