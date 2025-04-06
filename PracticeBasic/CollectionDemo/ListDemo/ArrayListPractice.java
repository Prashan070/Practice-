package PracticeBasic.CollectionDemo.ListDemo;

import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {


        //Add element
        //Set element
        //get element by Index
        // contain or not
        //actual Size
        //Is Empty
        //Remove by id, by obj    //return deleted value //return boolean.
        //Sort //collections//Asc //Comparator//asc,desc
        //iterate //normal //ierator


        List<Integer> ls = new ArrayList<>();

        ls.add(12);
        ls.add(2);
        ls.add(123);
        ls.add(112);
        ls.add(142);

        ls.set(1,24);

        System.out.println(ls.get(1));

        System.out.println(ls.contains(24));

        System.out.println(ls.size());

        System.out.println(ls.remove(2));
        System.out.println(ls);

        System.out.println(ls.remove(Integer.valueOf(112)));
        System.out.println(ls);

        ls.add(100);

        Collections.sort(ls);
        System.out.println(ls);

        List<Integer> arrList2 = new ArrayList<>(Arrays.asList(12, 3, 1, 44, 231, 4));
        System.out.println(arrList2);
        arrList2.sort(Comparator.reverseOrder());
        System.out.println(arrList2);
        arrList2.sort(Comparator.naturalOrder());
        System.out.println(arrList2);


        for(Integer f : arrList2){
            System.out.println(f);
        }

        System.out.println("***********");

        Iterator<Integer> it = arrList2.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}
