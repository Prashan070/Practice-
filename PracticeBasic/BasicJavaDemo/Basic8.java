package PracticeBasic.BasicJavaDemo;

import java.util.Arrays;

public class Basic8 {

    public <T> void print(T arr){
        System.out.println(arr);
    }


    public <T> void printarr(T[] ARR){
        System.out.println(Arrays.toString(ARR));
    }

    public static void main(String[] args) {
        Basic8 basic8 = new Basic8();
        basic8.print(6);
        basic8.print("Prashan");


        Integer[] arrr = {1,2,3,4,5,6,7};
        String[] t = {"Prashan", "Is", "Myname"};
        basic8.printarr(arrr);
        basic8.printarr(t);
    }

}

