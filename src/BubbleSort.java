import java.util.Arrays;

// Time Complexity: O(N2)
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { -1, 2, -20, 88, 32, 0, -22, 22 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int[] arr){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 1; col < arr.length - row; col++) {
                if(arr[col] < arr[col-1]){
                    int temp = arr[col];
                    arr[col] = arr[col-1];
                    arr[col-1] = temp;
                }
            }
        }
        return arr;
    }
}
