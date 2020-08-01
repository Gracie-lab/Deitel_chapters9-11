public class Employee2 implements CompensationModel, Payable{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private CompensationModel compensationModel;

//    public Employee2(String firstName, String lastName, String ssn, CompensationModel compensation){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.socialSecurityNumber = ssn;
//        this.compensationModel = compensation;
//    }

    public void setCompensationModel(CompensationModel compensationModel) {
        this.compensationModel = compensationModel;
    }

    public CompensationModel getCompensationModel() {
        return compensationModel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public double earnings() {
        return 0;
    }

    public double getEarnings(){
        compensationModel.earnings();
        return 0;

    }
}
