package PracticeBasic.StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem3 {



  public static void  sumOfAllNumber(){

      //sum of all number
/*      List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
      int result = nums.stream().mapToInt(Integer::intValue).sum();
      System.out.println(result);
      */

      //Max of all number
/*
      List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,22,5,6));

      int maxNumber = arr.stream().max(Comparator.naturalOrder()).get();
      System.out.println(maxNumber);
*/

     //String write a program to count the number of string that start with a specific
      //character like "C"
      List<String> ls = Arrays.asList("Cherry","Banana","Coconut","Berry","Cantaloupe");

    /* int Count =(int) ls.stream().filter(fruite -> fruite.startsWith("C")).count();
      int Count = (int) ls.stream().filter(fruit->fruit.startsWith("C")).count();

      System.out.println(Count);
      */

      //all UPERCASE
/*
    ls.stream().map(String::toUpperCase).forEach(System.out::println);
*/


    /*filer out the even number and and count number of element also*/

      List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,22,5,6));

      int count = (int) arr.stream().filter(num->num%2==0).count();
      System.out.println(count);







  }






    public static void main(String[] args) {
        sumOfAllNumber();
    }
}
