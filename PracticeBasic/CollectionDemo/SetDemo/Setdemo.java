package PracticeBasic.CollectionDemo.SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setdemo {


   /* HashSet is built using HashMap.
    When you call set.add(1), internally it does map.put(1, PRESENT) where PRESENT is a dummy value.
    HashMap uses the hashCode of 1 to find the right bucket.
    If that bucket is empty, it stores it.
            If 1 already exists (based on .equals()), it skips adding.*/

    public static void main(String[] args) {

        Set<Integer> hp = new HashSet<>();

        hp.add(1);
        hp.add(2);
        hp.add(1);
        hp.add(2);
        hp.add(1);
        hp.add(2);

        System.out.println(hp);

        Iterator<Integer>  dd = hp.iterator();

        while(dd.hasNext()){
            System.out.println(dd.next());
        }


    }


}
