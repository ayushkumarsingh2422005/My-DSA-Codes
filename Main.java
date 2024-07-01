import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();  // Number of test cases
        for (int test = 0; test < t; test++) {
            int n = scanner.nextInt();  // Length of the array a
            int[] a = new int[n];

            // Read array elements
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int totalCoins = 0;

            while (!isSorted(a)){
                int min = a[0];
                int index = 0;
                for (int i = 0; i < n; i++) {
                    int ele = a[i];
                    if (ele > min){
                        min = ele;
                    }
                    if (ele < min){
                        a[i]++;
                        index++;
                    }
                }
//                System.out.println(Arrays.toString(a));
                totalCoins+=index+1;
            }

            // Print total coins needed for this test case
            System.out.println(totalCoins);
        }

        scanner.close();
    }
}
