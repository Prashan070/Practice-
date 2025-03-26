package PracticeBasic.BasicJavaDemo;

import java.time.LocalDate;
import java.util.Date;

public class BasicFive {

    private  int empId;
    private String empName;
    private LocalDate empJoiningDate;

    public BasicFive(int empId, String empName, LocalDate empJoiningDate) {
        this.empId = empId;
        this.empName = empName;
        this.empJoiningDate = empJoiningDate;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public LocalDate getEmpJoiningDate() {
        return empJoiningDate;
    }

    public void setEmpJoiningDate(LocalDate empJoiningDate) {
        this.empJoiningDate = empJoiningDate;
    }

    @Override
    public String toString() {
        return "BasicFive{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empJoiningDate=" + empJoiningDate +
                '}'+'\n';
    }

}
