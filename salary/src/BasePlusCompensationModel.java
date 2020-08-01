public class BasePlusCompensationModel extends Employee2{
    private double grossSales;
    private double commissionRate;
    private double baseSalary;

    public BasePlusCompensationModel(double grossSales, double commissionRate, double baseSalary){
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + grossSales * baseSalary;
    }
}
