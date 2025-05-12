package PracticeBasic.CollectionDemo;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Listd {

    public static void main(String[] args) {


        List<Integer> ls = new ArrayList<>();
        ls.add(122);
        ls.add(205);
        ls.add(88);
        ls.add(123);
        ls.add(1299);
        ls.add(88);

        Collections.sort(ls);
        System.out.println(ls);
        Collections.sort(ls,Collections.reverseOrder());
        System.out.println(ls);



        List<String> la = new ArrayList<>();
        la.add("z");
        la.add("q");
        la.add("s");
        la.add("a");
        la.add("r");
        Collections.sort(la);
        System.out.println(la);

        Collections.sort(la,Collections.reverseOrder());
        System.out.println(la);



      /*  System.out.println(ls);
        System.out.println(ls.pollFirst());
        System.out.println(ls);
*/
       // System.out.println(ls.floor(25));


    }
}
