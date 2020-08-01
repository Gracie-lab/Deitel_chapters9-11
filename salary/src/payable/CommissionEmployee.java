package payable;

public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

//    //9.3
//    Date date = new Date();
//    BasePlusCommissionEmployee base = new BasePlusCommissionEmployee("Mary", "Jane", "000000", date,0.05, 150, 500);
////9.3
//    public CommissionEmployee(){
//
//    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public CommissionEmployee(String firstName, String lastName, String ssn, double commissionRate, double grossSales){
        super(firstName, lastName, ssn);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    @Override
    public double getPaymentAmount() {
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        super.toString();
        return "CommissionEmployee{" +
                "commissionRate=" + commissionRate +
                ", grossSales=" + grossSales +
                '}';
    }
}
