package PracticeBasic.BasicJavaDemo;


import java.util.ArrayList;
import java.util.List;

public class Basic7 {

    int empId;
    String empName;
    int empSalary;

    private Basic7(int empId, String empName, int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Basic7{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }

    public static void main(String[] args) {

        List<Basic7> ls = new ArrayList<>();
        ls.add(new Basic7(1, "prashan", 100));
        ls.add(new Basic7(2, "Rohit", 1000));
        ls.add(new Basic7(3, "Pradip", 1234));
        ls.add(new Basic7(4, "Harish", 283));
        ls.add(new Basic7(5, "Harsh", 839));

        List<Basic7> result = ls.stream().filter(a -> a.empSalary % 2 == 0).toList();
        System.out.println(result);


    }
}


/*
    int num;
    Long rollnumber;
    String name;
    Boolean isAvaiable;

   private  Basic7(int num, Long rollnumber, String name, Boolean isAvaiable) {
        this.num = num;
        this.rollnumber = rollnumber;
        this.name = name;
        this.isAvaiable = isAvaiable;
    }

    @Override
    public String toString() {
        return "Basic7{" +
                "num=" + num +
                ", rollnumber=" + rollnumber +
                ", name='" + name + '\'' +
                ", isAvaiable=" + isAvaiable +
                '}';
    }

}
*/

//Cannot create a class out of that class
//cannot extended that class which contain private constructor

/*class Basic7demo{
    public static void main(String[] args) {
        Basic7 basic7 = new Basic7();


    }*/

/*class Basic7demoA extends Basic7{

    int roll;

*//*
  Basic7demoA(int roll){
      this.roll=roll;
  }
*//*

    public static void main(String[] args) {

    }
    }*/

