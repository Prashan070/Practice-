package PracticeBasic.StreamDemo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {


    public static void main(String[] args) {
        //Sort a list of numbers
        List<Integer> numbers = List.of(5, 2, 9, 1, 7);


       List<Integer> mdo =  numbers.stream().sorted().toList();

       numbers.stream().sorted().forEach(System.out::println);
    }
}
