package PracticeBasic.DSA;

import java.util.*;

class Emp {
    private String name;
    private int age;
    private int salary;

    public Emp() {
    }

    public Emp(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

}


class Main {
    public static void main(String[] args) {


        List<Emp> empList = new ArrayList<>();

        empList.add(new Emp("Alice", 25, 50000));
        empList.add(new Emp("Bob", 30, 60000));
        empList.add(new Emp("Charlie", 28, 55000));
        empList.add(new Emp("Diana", 32, 70000));
        empList.add(new Emp("Athan", 25, 52000));


/*
        empList.sort(new Comparator<Emp>() {
            public int compare(Emp o1, Emp o2){
                return o1.getAge() - o2.getAge();
            }
        });

*/

//        empList.sort( (o1,o2) -> o1.getAge() - o2.getAge());

   /*  empList.sort(Comparator.comparing(Emp::getAge).thenComparing(Emp::getName).thenComparing(Comparator.comparing(Emp::getSalary).reversed()));

        empList.forEach(System.out::println);
*/

        int[] arr = {2, 3, 4, 4, 5, 6, 8};


        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] + arr[j] == 7) {
                System.out.println(i + " " + j);
                break;
            } else if (arr[i] + arr[j] > 7) {
                j--;
            } else {
                i++;
            }
        }

    }
}

