package PracticeBasic.BasicJavaDemo;

import java.util.Comparator;

public class NameCompartor implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {

       // return o1.empName.length() - o2.empName.length();
        return o1.empName.compareTo(o2.empName);

    }
}
