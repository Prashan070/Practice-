package PracticeBasic.StreamDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamExample13 {



    public static void main(String[] args) {






        List<String> name = Arrays.asList("A","AAAAAA","BBB","AA","C");
        Collections.sort(name); ///ALBETICAL ORDER
        System.out.println(name);
        List<String> sortedName = name.stream().sorted((a,b)->b.length() -a.length()).toList();
        System.out.println(sortedName);
    }
}
