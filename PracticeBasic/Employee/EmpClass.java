package PracticeBasic.Employee;

public class EmpClass  {
    int empId;
    String empName;

    public EmpClass(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "EmpClass{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}'+'\n';
    }

}
