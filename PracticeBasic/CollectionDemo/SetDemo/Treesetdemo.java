package PracticeBasic.CollectionDemo.SetDemo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Treesetdemo {


    public static void main(String[] args) {

        Comparator<Integer> comparator = (i,j)-> {
            return j.compareTo(i);
        };


        SortedSet<Integer> hjaja = new TreeSet<>(comparator);

        hjaja.add(12);
        hjaja.add(162);
        hjaja.add(122);
        hjaja.add(172);
        hjaja.add(12);

        System.out.println(hjaja);

        System.out.println(hjaja.comparator());
        System.out.println(hjaja);



    }
}
