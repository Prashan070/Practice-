package PracticeBasic.StreamDemo;

import java.util.List;

public class StreamExample1 {


    public static void main(String[] args) {

        // Example: Get names that start with 'A'

        List<String> names = List.of("Alice", "Bob", "Alex", "Charlie");

        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);


    }
}
