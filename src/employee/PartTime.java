package employee;

public class PartTime {
    int noHoursWorked;
    int payPerHours;

    public PartTime(int noHoursWorked, int payPerHours) {
        this.noHoursWorked = noHoursWorked;
        this.payPerHours = payPerHours;
    }

    public int getNoHoursWorked() {
        return noHoursWorked;
    }

    public void setNoHoursWorked(int noHoursWorked) {
        this.noHoursWorked = noHoursWorked;
    }

    public int getPayPerHours() {
        return payPerHours;
    }

    public void setPayPerHours(int payPerHours) {
        this.payPerHours = payPerHours;
    }
}
