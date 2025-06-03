package PracticeBasic.DSA;

import java.util.*;

public class Arrayyy {


    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 7, 8, 11, 2, 4, 6, 8, 9, 8};

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        //  System.out.println(freq);


        //no of occurance number and string
        String s = "abababbbab";

        Map<Character, Integer> freq2 = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq2.put(c, freq2.getOrDefault(c, 0) + 1);
        }

        // System.out.println(freq2);


        //first occurance
        //        int[] arr = {1, 2, 4, 5, 7, 8, 11, 2, 4, 6, 8, 9, 8};

        int dev = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                dev = i;
                break;
            }
        }
        //System.out.println(dev);


        //Last occurance

        int lastDev = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                lastDev = i;
            }
        }
      //  System.out.println(lastDev);


        //if given array is sorted or not
        int[] arrt = {1, 5, 6, 7};

        int counter = 0;
        for(int i =0 ; i< arrt.length-1 ; i++){
            if(arrt[i+1] - arrt[i] >-1){
                counter++;
            }
        }
        System.out.println(counter);

        List<Integer> ls = Arrays.asList(5,2,1,3);

        Collections.sort(ls,Collections.reverseOrder());

        System.out.println(ls);

        //given an array consisting of integer return the first value that is reparting in the array
        // 287. Find the Duplicate Number


        //hash map and hash set

        //reverse an array and string and with space //

        //binar to decimal and vice versa

        //two pointer

        //sum of n natural number

        //calculate tc of given prograp

        //serching and sorting

        //move zero


        //bit manupulation
        //basic maths and array
        //josephs problem
        //LL

        HashMap<Integer, Integer> noOfCccurance = new HashMap<>();


    }
}