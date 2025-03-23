package PracticeBasic.BasicJavaDemo;

public class Employee {

//public class Employee implements  Comparable<Employee> {

    int empId;
    String empName;
    String empPhoneNo;

    public Employee(int empId, String empName, String empPhoneNo) {
        this.empId = empId;
        this.empName = empName;
        this.empPhoneNo = empPhoneNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empPhoneNo='" + empPhoneNo + '\'' +
                '}'+'\n';
    }


    /*@Override
    public int compareTo(Employee o) {
       // return this.empId - o.empId;
        return this.empName.length() - o.empName.length();
    }*/


}
