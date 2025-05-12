package PracticeBasic.DSA.SimpleMaths;


import java.util.Arrays;

public class RotateArray {

    public static void rotateArrayByLeft(int[] arr) {

        int n= arr.length;
        int temp = arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n-1]=temp;

        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        rotateArrayByLeft(arr);
    }

}
