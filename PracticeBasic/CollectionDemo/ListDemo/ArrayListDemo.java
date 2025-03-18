package PracticeBasic.CollectionDemo.ListDemo;

import java.util.*;

public class ArrayListDemo {


    public static void ArrayListExample() {

        List<Integer> arrlist = new ArrayList<>();

        //Add element
        arrlist.add(12);
        arrlist.add(1);
        arrlist.add(33);
        arrlist.add(8);
        arrlist.add(14);
        System.out.println(arrlist);


        //Set element
        arrlist.set(1, 24);
        System.out.println(arrlist);

        //get element by Index
        System.out.println(arrlist.get(2));

        // contain or not
        System.out.println(arrlist.contains(100));

        //actual Size
        System.out.println(arrlist.size());

        //Is Empty
        System.out.println(arrlist.isEmpty());

        //Remove
        System.out.println(arrlist.remove(Integer.valueOf(33))); //return boolean
        System.out.println(arrlist);

        System.out.println("**************");

        System.out.println(arrlist.remove(2)); //return deleted value
        System.out.println(arrlist);


        for (Integer arr : arrlist) {
            System.out.println(arr);
        }

        System.out.println("**************");

        Iterator<Integer> ls = arrlist.iterator();
        while (ls.hasNext()) {
            System.out.println(ls.next());
        }


        //Sort

        Collections.sort(arrlist);
        System.out.println(arrlist);

        System.out.println("**************************");
        ArrayList<Integer> arrList2 = new ArrayList<>(Arrays.asList(12, 3, 1, 44, 231, 4));
        arrList2.sort(Comparator.reverseOrder());
        System.out.println(arrList2);

        arrList2.sort(Comparator.naturalOrder());
        System.out.println(arrList2);

    }


    public static void main(String[] args) {

        ArrayListExample();
    }
}
