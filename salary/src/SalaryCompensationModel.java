public class SalaryCompensationModel extends Employee2 {
    private double weeklySalary;

    public SalaryCompensationModel(double weeklySalary){
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }
}
