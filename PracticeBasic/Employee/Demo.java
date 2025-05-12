package PracticeBasic.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {



        List<EmpClass> ls = new ArrayList<>();
        ls.add(new EmpClass(11,"joj"));
        ls.add(new EmpClass(122,"Prashan"));
        ls.add(new EmpClass(101,"Horse"));
        ls.add(new EmpClass(1,"monk"));
        ls.add(new EmpClass(7,"ki"));

        System.out.println(ls);

        System.out.println(ls);
    }
}
