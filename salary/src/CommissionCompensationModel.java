public class CommissionCompensationModel extends Employee2 {
    private double grossSales;
    private double commissionRate;

    public CommissionCompensationModel(double grossSales, double commissionRate){
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    @Override
    public double earnings() {
        return  commissionRate * grossSales;
    }
}
