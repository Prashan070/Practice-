package PracticeBasic.Final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Colleactiondemo {

    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();
     List<Integer> ls2 = Collections.synchronizedList(ls);




        ls2.add(12);
        ls2.add(1);
        ls2.add(123);
        ls2.add(100);
        ls2.add(188);

        for(Integer k : ls2){
            System.out.println(k);
        }

     /*   System.out.println(ls.isEmpty());

        System.out.println(ls);
*/
        /*Iterator<Integer> gh = ls.iterator();
        while (gh.hasNext()){
            System.out.println(gh.next());
        }*//*
*/
    }

}
