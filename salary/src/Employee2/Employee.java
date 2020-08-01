package Employee2;

public class Employee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = ssn;
    }

    @Override
    public String toString() {
        return null;
    }
}
