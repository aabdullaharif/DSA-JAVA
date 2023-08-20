//Time Complexity: O(N2)

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = { 4, 2, 3, 5, 1, 0 };
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] insertion(int[] arr){
        for (int i =0 ; i < arr.length; i++){
            for (int j = 0; j< arr.length - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
