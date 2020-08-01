public class HourlyCompensationModel extends Employee2 {
    private double wages;
    private double hoursWorked;

    public HourlyCompensationModel(double wages){
        this.wages = wages;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double earnings() {
        return wages * hoursWorked;
    }
}
