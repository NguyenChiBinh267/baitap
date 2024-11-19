package chuong3.bai6;

public class PartTimeEmployee extends Employee {
    protected int hourPerWeek;

    
    public PartTimeEmployee() {
        super();
    }
    public PartTimeEmployee(String name, int age, char gender, String employeeId, String hiredDate, int hourPerWeek) {
        super(name, age, gender, employeeId, hiredDate);
        this.hourPerWeek = hourPerWeek;
    }

    public int getHourPerWeek() {
        return hourPerWeek;
    }

    public void setHourPerWeek(int hourPerWeek) {
        this.hourPerWeek = hourPerWeek;
    }

    @Override
    public String toString() {
        return super.toString() + "PartTimeEmployee [hourPerWeek=" + hourPerWeek + "]";
    }
}
