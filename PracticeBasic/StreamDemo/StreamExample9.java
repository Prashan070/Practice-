package PracticeBasic.StreamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample9 {


    public static void main(String[] args) {


        //even number from the arraylist
        // List<Integer> even = List.of(1,2,11,3,66,4,87,34);

        List<Integer> arlist = new ArrayList<>(List.of(1, 2, 11, 3, 66, 4, 87, 34));
        arlist.stream().filter(num -> num % 2 == 0).forEach(System.out::println);

        List<Integer> finalList = arlist.stream().filter(nums -> nums % 2 == 0).collect(Collectors.toList());
        System.out.println(finalList);


        List<Integer> finalListk = arlist.stream().filter(nums -> nums % 2 == 0).toList();
        System.out.println(finalListk);


    }
}
