//Time Complexity: O(N2) - Unstable

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 3, 5, 1, 0 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] selection(int[] arr){
        for (int row = 0; row < arr.length; row++) {
            int first = 0;
            int last = arr.length - 1 - row;
            int maxIndex = getMaxIndex(arr, first, last);
            swap(arr, maxIndex, last);
        }
        return arr;
    }
    static  int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int row = 0; row <= end; row++) {
            if(arr[row] > arr[max]){
                max = row;
            }
        }
        return max;
    }
    static void swap(int[] arr, int max, int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
}
