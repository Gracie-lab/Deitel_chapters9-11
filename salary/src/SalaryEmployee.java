public class SalaryEmployee extends Employee {

    private double weeklySalary;

    public SalaryEmployee(String firstName, String lastName, String ssn, double weeklySalary){
        super(firstName, lastName, ssn );
        if(weeklySalary > 0.0){
            this.weeklySalary = weeklySalary;
     }
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getEarnings() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "SalaryEmployee{" +
                "weeklySalary=" + weeklySalary +
                '}';
    }
}
