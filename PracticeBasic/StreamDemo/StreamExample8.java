package PracticeBasic.StreamDemo;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample8 {


    public static void main(String[] args) {


        //Sum of numbers

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

      List<Integer> mul =  numbers.stream().map(num->num*2).collect(Collectors.toList());
        System.out.println(mul);

     int sum = numbers.stream().reduce(0,Integer::sum);
        System.out.println(sum);

    }
}
