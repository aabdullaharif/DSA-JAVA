package Searching;
// Time Complexity: O(N)

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {10, 8, 6, 4, 2, 0, -3, -10};
        int target = 8;
        int ans = linear(arr, target);
        System.out.println(ans);
    }

    static int linear(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
