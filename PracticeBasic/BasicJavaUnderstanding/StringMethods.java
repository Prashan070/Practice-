package PracticeBasic.BasicJavaUnderstanding;

import java.util.Arrays;

public class StringMethods {

    public static void display(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }


    public static void dipslaySunstring(String name2) {
        System.out.println(name2.substring(1, 3));
        System.out.println(name2);
    }


    public static void displaySplit(String name3) {
        String[] arr = name3.split(" ");
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {

        String name = "Prashan";
        StringMethods.display(name);


        String name2 = "Bananan";
        char[] ch = name2.toCharArray();
        System.out.println(ch.length);

        System.out.println("************");
        StringMethods.dipslaySunstring(name2);

        String name3 = "Prashan is my name";
        StringMethods.displaySplit(name3);


        String name4 = " ";
        System.out.println(name4.isBlank()); //TRUE
        System.out.println(name4.isEmpty()); //FALSE


        int num = 10;
        Integer n = Integer.valueOf(num);
        System.out.println(n);

        //it convert string and primitive into object

        Integer obj = Integer.valueOf("123"); // returns Integer object
        int val = Integer.parseInt("123");    // returns int primitive


    }
}
