package PracticeBasic.CollectionDemo;

import java.util.*;

public class CollleactionHashset {

    public static void main(String[] args) {


        Comparator<Integer> comparator = (i, j) -> {

            return j.compareTo(i);
        };


        SortedSet<Integer> ls = new TreeSet<>(comparator);


        ls.add(12);
        ls.add(12);
        ls.add(24);
        ls.add(32);
        ls.add(100);
        ls.add(70);

        System.out.println(ls.comparator());

        System.out.println(ls);

        SortedSet<Integer> su = ls.subSet(12, 32);


        System.out.println(su);


    }
}
