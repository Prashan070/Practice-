package PracticeBasic.CollectionDemo.ListDemo;

import java.util.*;

public class ArrayListPractice1 {

    public static void ArrayListMethod1() {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(22);
        arr.add(5);
        arr.add(33);
        arr.add(71);
        arr.add(10);

        System.out.println(arr);

        Collections.sort(arr);
        System.out.println("collleactions: "+arr);

//sort
        arr.sort(Comparator.reverseOrder());
        System.out.println(arr);
//sort
        arr.sort(Comparator.naturalOrder());
        System.out.println(arr);

        //ierator
        Iterator<Integer> finalarr = arr.iterator();
        while (finalarr.hasNext()) {
            System.out.println(finalarr.next());
        }

        List<Integer> ar = Arrays.asList(1,2,4,6,8,9);
        System.out.println(ar);

        //ar.add(1); //not modifiaction
        ar.set(1,22);
        System.out.println(ar);

        //ar.remove(2);// no modifiaction




    }



    public static void main(String[] args) {

        ArrayListMethod1();


    }
}
