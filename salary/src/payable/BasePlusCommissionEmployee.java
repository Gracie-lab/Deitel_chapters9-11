package payable;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
//    public BasePlusCommissionEmployee(){
//
//    }

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double commissionRate, double grossSales, double baseSalary){
        super(firstName, lastName, ssn, commissionRate, grossSales);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPaymentAmount() {
        return super.getPaymentAmount() + baseSalary;
    }

    @Override
    public String toString() {
        super.toString();
        return "BasePlusCommissionEmployee{" +
                "baseSalary=" + baseSalary +
                '}';
    }


}
