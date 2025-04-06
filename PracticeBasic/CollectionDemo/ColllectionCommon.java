package PracticeBasic.CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ColllectionCommon {


    public static void main(String[] args) {

        List<Integer> commmon = new ArrayList<>();
        commmon.add(1);
        commmon.add(1);
        commmon.add(1);
        commmon.add(1);
        commmon.add(2);

        List<Integer> common2 = List.of(1, 2, 4, 5, 6, 7);

        commmon.addAll(common2);
        Boolean isEmp = commmon.isEmpty();

        System.out.println(commmon);
        System.out.println(isEmp);


    }


}