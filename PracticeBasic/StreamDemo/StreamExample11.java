package PracticeBasic.StreamDemo;

import java.util.ArrayList;
import java.util.List;

public class StreamExample11 {

    public static void main(String[] args) {
        //select only pass student
        //add the 5 grace mask to all the faild studend
        //count the number of fail student


        List<Integer> arlist = new ArrayList<>(List.of(11, 22, 1, 3, 66, 4, 87, 34));
        List<Integer> passStudent = arlist.stream().filter(num->num>20).toList();
        System.out.println(passStudent);

        List<Integer> failStudent = arlist.stream().filter(nums->nums<20).map(i->i+5).toList();
        System.out.println(failStudent);

      long count =   arlist.stream().filter(mark->mark<20).count();
        System.out.println(count);





    }
}
