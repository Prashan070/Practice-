package PracticeBasic.DSA;

import java.util.HashMap;
import java.util.Map;

public class Arrayyy {


    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 7, 8, 11, 2, 4, 6, 8, 9, 8};

        Map<Integer, Integer> freq = new HashMap<>();

        for( int num :  arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        System.out.println(freq);




        //no of occurance number and string
        String s = "abababbbab";

        Map<Character, Integer> freq2 =  new HashMap<>();
        for(char c : s.toCharArray()){
            freq2.put(c, freq2.getOrDefault(c,0)+1 );
        }

        System.out.println(freq2);



        //first occurance
        //Last occurance
        //if given array is sorted or not
        //inbuild sort method
        //target sum proble
        //triplet whose sum is equal to given value
        //swape interge using temp and without using temp
        //hash map and hash set
        //2sum
        //binar to decimal and vice versa
        //two pointer
        //sum of n natural number
        //calculate tc of given prograp
        //serching and sorting
        //binary search
        //bit manupulation
        //basic maths and array
        //josephs problem
        //LL

        HashMap<Integer, Integer> noOfCccurance = new HashMap<>();



    }
}