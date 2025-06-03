package PracticeBasic.Basic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class g_DemoEmpEx {

    public static void main(String[] args) {

        List<f_DemoEmpClass> listEmp = new ArrayList<>();
        listEmp.add(new f_DemoEmpClass("Alice", 3, 75000));
        listEmp.add(new f_DemoEmpClass("Bob", 1, 55000));
        listEmp.add(new f_DemoEmpClass("Charlie", 5, 80000));
        listEmp.add(new f_DemoEmpClass("David", 2, 60000));
        listEmp.add(new f_DemoEmpClass("Eve", 4, 70000));

        // System.out.println(listEmp);

        listEmp.sort(Comparator.comparing(f_DemoEmpClass::getSalary).reversed().thenComparing(f_DemoEmpClass::getName));
        listEmp.sort(Comparator.comparing(fDemoEmpClass -> fDemoEmpClass.getName().length()));
        listEmp.forEach(System.out::println);
        listEmp.sort((e1, e2) -> e1.getId() - e2.getId());

    }


}
