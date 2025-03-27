package PracticeBasic.CollectionDemo.ListDemo;

import java.util.*;

public class ArrayListD {

    public static void main(String[] args) {

//add --0(1)--resizing then O(n)
//add--at middle o(n) --resizing
//set--o(1)
//get--

        List<Integer> ls = new ArrayList<>();
        ls.add(11);
        ls.add(22);
        ls.add(33);
        ls.add(44);
        ls.add(55);

        System.out.println(ls);

        System.out.println(ls.get(2));
        System.out.println(Integer.valueOf(2));

        ls.set(1,2);
        System.out.println(ls);








    }
}
