package PracticeBasic.StreamDemo;

import java.util.List;

public class StreamExample2 {


    public static void main(String[] args) {


        //Convert names to uppercase

        List<String> names = List.of("Alice", "Bob", "Alex", "Charlie");


        List<String> modifiedList = names.stream().map(name -> name.toUpperCase()).toList();
        names.stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
