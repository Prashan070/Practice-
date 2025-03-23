package PracticeBasic.StreamDemo;

import java.util.List;
import java.util.Optional;

public class StreamExample7 {


    public static void main(String[] args) {


       // Find the first name starting with 'A'
        // findFirst() & findAny()


        List<String> names = List.of("Charlie", "Bob", "Alice", "Alex");

       Optional<String> first =  names.stream().filter(name->name.startsWith("A")).findFirst();

        first.ifPresent(System.out::println);




    }
}
