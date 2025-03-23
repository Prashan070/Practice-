package PracticeBasic.StreamDemo;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {


    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};

        IntStream lst = Arrays.stream(arr1);
        lst.forEach(System.out::println);


        System.out.println("********************");


        Integer[] arr2 = {1, 2, 3, 4, 5, 6, 7};

        Stream<Integer> lst2 = Stream.of(arr2);
        lst2.forEach(System.out::println);


        System.out.println("***********************");

        List<Integer> arr3 = List.of(1, 2, 3, 4, 5, 6, 7);
        arr3.stream().forEach(System.out::println);


    }
}
