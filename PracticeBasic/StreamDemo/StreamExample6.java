package PracticeBasic.StreamDemo;

import java.util.List;


public class StreamExample6 {

    public static void main(String[] args) {
        // Count names starting with 'B'


        List<String> names = List.of("Alice", "Bob", "Alex", "Bill");

       Long countB =  names.stream().filter(name->name.startsWith("B")).count();

        System.out.println(countB);


    }
}
