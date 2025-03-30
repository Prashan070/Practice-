package PracticeBasic.BasicJavaDemo;

import java.util.Arrays;

public class Basic12 {

    public static void stringMethod(int[] arr, String num, int numt){

       // System.out.println(Arrays.toString(arr));
        // System.out.println(num.length());
       // System.out.println(Integer.parseInt(num));
        //System.out.println(Integer.valueOf(numt));

/*
        String name1 = "Prashan";
        String name2  = new String("Prashan");
        String name3 ="Prashan";
        String name4 = new String("Prashan");

        System.out.println(name1 == name2); // false
        System.out.println(name1.equals(name2)); //true
        System.out.println(name1.equals(name3)); //true
        System.out.println(name2 == name4); //false
        System.out.println(name2.equals(name4)); //true
*/


    /*    StringBuffer sb1 = new StringBuffer("Prashan");
        sb1.append(" hi");

        System.out.println(sb1);
        StringBuilder sb2 = new StringBuilder("Prashan");
        String sb3 = new String("Prashan");
*/


/*        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.equals(sb3));*/
       //System.out.println(sb1==sb3); //not possible





    }

    public static void main(String[] args) {

        int[] arr ={12,4,5,6,7};

        stringMethod(arr, "100", 123);




    }
}





