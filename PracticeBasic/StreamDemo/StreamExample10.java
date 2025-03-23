package PracticeBasic.StreamDemo;

import java.util.ArrayList;
import java.util.List;

public class StreamExample10 {

    public static void main(String[] args) {

        List<Integer> arlist = new ArrayList<>(List.of(1, 2, 11, 3, 66, 4, 87, 34));

        //Multiple by two each elemet from the list

       List<Integer> newAR =  arlist.stream().map(num->num*2).toList();
        System.out.println(newAR);


    }
}
