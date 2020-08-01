public class HourlyEmployee extends Employee {
    private double wage;
    private int hoursWorked;

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage > 0){
            this.wage = wage;
        }

    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        if(hoursWorked > 0 && hoursWorked < 168){
            this.hoursWorked = hoursWorked;
        }
    }

    public HourlyEmployee(String firstName, String lastName, String ssn,  double wage, int hoursWorked){
        super(firstName, lastName, ssn);

        if(wage > 0.0){
            this.wage = wage;
        }
        if(hoursWorked > 0 && hoursWorked < 168){
            this.hoursWorked = hoursWorked;
        }
    }


    public double getEarnings() {
        double salary = 0.0;
        if(hoursWorked <= 40){
            salary = wage * hoursWorked;
        }
        else if (hoursWorked > 40){
           salary = 40 * wage + ( hoursWorked - 40 ) * wage * 1.5;
        }
        return salary;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "wage=" + wage +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
