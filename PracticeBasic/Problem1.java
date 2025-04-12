package PracticeBasic;

import java.util.Arrays;

public class Problem1 {


    public static void reverse(String[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {

        String[] arr = {"abc", "def", "ghi"};

        Problem1.reverse(arr);


    }


}
