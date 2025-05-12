package PracticeBasic.DSA.SimpleMaths;

import java.util.Arrays;

public class Removeduplicates {


    public static void remove(int[] arr) {

        int l = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[l] != arr[i]) {
                arr[l + 1] = arr[i];
                l++;
            }

        }
        System.out.println(l+1);
    }


    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 2, 2, 3, 3,4};
        remove(arr);

    }
}
