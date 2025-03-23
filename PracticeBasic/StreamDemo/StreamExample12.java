package PracticeBasic.StreamDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamExample12 {



    public static void main(String[] args) {

        List<Integer> arlist = new ArrayList<>(List.of(11, 22, 1, 3, 66, 4, 87, 34));
       List<Integer> sortedlist =  arlist.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedlist);

    }
}
