package PracticeBasic.BasicJavaUnderstanding;

import java.util.ArrayList;
import java.util.List;

class Employee {

    int id;
    String name;
    String salary;

    Employee(int id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}'+'\n';
    }
}


public class EmployeeClassCreation {
    public static void main(String[] args) {

        List<Employee> ep1 = new ArrayList<>();
        ep1.add(new Employee(1,"Prashan", "1000"));
        ep1.add(new Employee(1,"Ace", "100"));
        ep1.add(new Employee(1,"Luffy", "2000"));
        ep1.add(new Employee(1,"Zoro", "3000"));
        ep1.add(new Employee(1,"Ussop", "4000"));

        System.out.println(ep1);
    }
}
