package SortingAlgo;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr){
        helper(arr, 0, arr.length-1);
    }

    private static void helper(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;

        helper(arr, low, mid);
        helper(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 3, 9, 0, 5};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}


/*
Time complexity n*log(n)/log(2)
 */