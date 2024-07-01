package SortingAlgo;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr) {
        helper(arr, 0, arr.length - 1);
    }

    private static void helper(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            helper(arr, low, pi - 1);
            helper(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; // Start with low as the pivot
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            while (j >= low && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j); // Swap pivot element with element at j

        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 3, 9, 0, 5};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}


/*
time complexity merge short ke jitney h but space complexity 1 h, no extra array is formed
 */