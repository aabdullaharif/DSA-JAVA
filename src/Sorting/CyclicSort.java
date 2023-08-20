package Sorting;//Time Complexity: O(N)

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args){
        int[] arr = { 4, 5, 3, 1, 2 };  // N to i
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] cyclic(int[] arr) {
        int i = 0;

        while( i < arr.length ){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                // swap
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;

            }else{
                i++;
            }
        }
        return arr;
    }
}
