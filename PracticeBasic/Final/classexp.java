package PracticeBasic.Final;

import java.util.Objects;


public class classexp {


    public static void displaysecondMax(int[] arr) {

        int maxNum = Integer.MIN_VALUE;
        int secondMaxNum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxNum) {
                secondMaxNum = maxNum;
                maxNum = arr[i];

            } else if (arr[i] > secondMaxNum && arr[i] != maxNum) {
                secondMaxNum = arr[i];
            }

        }

        System.out.println(secondMaxNum);
    }

    public static void main(String[] args) {

        int arr[] = {1, 22, 11, 5, 33, 7, 4, 99, 50};

        displaysecondMax(arr);
    }


}
