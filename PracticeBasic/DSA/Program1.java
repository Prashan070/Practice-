package PracticeBasic.DSA;

import java.util.Arrays;

public class Program1 {


    public static class Basic10 {


        public void moveNegtofirst(int[] arr) {

            int i=0;
            int j=0;

            while(j < arr.length){

                if(arr[j] <0){
                    swap(i,j,arr);
                    i++;
                }
                j++;

            }
            System.out.println(Arrays.toString(arr));
        }
    public void swap(int i, int j, int[] arr){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]= temp;

    }

        public static void main(String[] args) {

            int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};


            Basic10 basic10 = new Basic10();
            basic10.moveNegtofirst(arr);
        }


    }
}
