package PracticeBasic.BasicJavaDemo;

import java.util.ArrayList;
import java.util.Collections;

public class EmpDemo {

    public static void main(String[] args) {
        Employee e1 = new Employee(11,"Prashan","123456789");
        Employee e2= new Employee(2,"Rajaaaaaaa","12345678");
        Employee e3 = new Employee(10,"Bheem","12345789");


        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        System.out.println(empList);

//        Collections.sort(empList, new IdComparator());
         Collections.sort(empList, new NameCompartor());

        System.out.println(empList);

    }


}
