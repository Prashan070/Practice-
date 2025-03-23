package PracticeBasic.StreamDemo;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample5 {


    public static void main(String[] args) {
        //: Convert a stream back to a list

        List<String> names = List.of("Alice", "Bob", "Alex", "Charlie");


       List<String> modified = names.stream().filter(name->name.startsWith("A")).toList();


      List<String> newName =   names.stream().filter(name->name.startsWith("A")).collect(Collectors.toList());

        System.out.println(newName);


    }
}
