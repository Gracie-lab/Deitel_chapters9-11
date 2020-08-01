package payable;

public abstract class Employee implements Payable {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
//    private Date birthDate;

//    public Employee(String firstName, String lastName, String ssn, Date birthDate){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.socialSecurityNumber = ssn;
//    }

    public Employee(String firstName, String lastName, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = ssn;
    }

    public Employee(){

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

//    public abstract double getEarnings();

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
