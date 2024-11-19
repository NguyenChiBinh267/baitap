package chuong3.bai6;

public class Employee extends Person {
    protected String employeeId;
    protected String hiredDate;
    
    public Employee() {
        super();
    }
    public Employee(String name, int age, char gender, String employeeId, String hiredDate) {
        super(name, age, gender);
        this.employeeId = employeeId;
        this.hiredDate = hiredDate;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getHiredDate() {
        return hiredDate;
    }
    public void setHiredDate(String hiredDate) {
        this.hiredDate = hiredDate;
    }
    @Override
    public String toString() {
        return super.toString() + "Employee [employeeId=" + employeeId + ", hiredDate=" + hiredDate + "]";
    }
}
