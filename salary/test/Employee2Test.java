import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import payable.BasePlusCommissionEmployee;
//import payable.CommissionEmployee;
//import payable.HourlyEmployee;
import payable.Invoice;
import payable.Payable;
//import payable.SalaryEmployee;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Random;

class Employee2Test {
    Random random = new Random();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testEmployee() {
        Employee2 employee = new Employee2();
        employee.setFirstName("Sola");
        employee.setLastName("Soya");
        employee.setSocialSecurityNumber("234567856");
        CompensationModel solaComp = new SalaryCompensationModel(30000);
        employee.setCompensationModel(solaComp);
        assertEquals(30000, employee.getCompensationModel().earnings());
    }

    @Test
    void bonusTest() {

        Employee salary = new SalaryEmployee("John", "Doe", "1234567", 50);
        Employee hourly = new HourlyEmployee("Jane", "Doe", "234512367", 45, 30);
        Employee commission = new CommissionEmployee("Joe", "Sandy", "456789", 0.05, 5000);
        Employee base = new BasePlusCommissionEmployee("Mary", "Jane", "67543244", 0.05, 700, 500);
        Employee pieceWorker = new PieceWorker(500, 10);
        Employee[] employ = {salary, hourly, commission, base, pieceWorker};
        for (Employee people : employ) {
            int month = 1 + random.nextInt(12);
            int day = 1 + random.nextInt(28);
            int year = 2000 + random.nextInt(2007);
            Date birthDate = new Date(month, day, year);
            if (birthDate.getCurrentMonth() == birthDate.getMonth()) {
                double bonusEarning = people.getPaymentAmount() + 100;
                System.out.println(people.toString());
                System.out.println(bonusEarning + " plus bonus");
                System.out.println();
            } else {
                System.out.println(people.toString());
                System.out.println(people.getPaymentAmount());
                System.out.println();
            }

        }
    }


//    @Test
//    void payableTest(){
//        Payable invoice1 = new Invoice("01", "Shoe", 2, 50);
//        Payable invoice2 = new Invoice("02", "Bags", 5, 100);
//        Payable hourly = new HourlyEmployee("John", "Smith", "8796452", 300, 50);
//        Payable salary = new SalaryEmployee("John", "Doe", "1234567", 50);
//        Payable commission = new CommissionEmployee("Joe", "Sandy", "456789", 0.05, 5000);
//        Payable base = new BasePlusCommissionEmployee("Mary", "Jane", "67543244",  0.05, 7, 100);
//        Payable[] payable = {invoice1, invoice2, hourly, salary, commission, base};
//
//        for(Payable payee : payable){
//
//            if(payee == base){
//                System.out.println(payee.toString());
//                double newSalary = payee.getPaymentAmount() + ((payee.getPaymentAmount()/100)*10);
//                System.out.println("Salary: "+newSalary);
//                System.out.println();
//            }
//            else{
//                System.out.println(payee.toString());
//                System.out.println("Salary: "+payee.getPaymentAmount());
//                System.out.println();
//            }
//        }
//    }



    @Test
    void compensationModification() {
        CompensationModel salary = new SalaryCompensationModel(100);
        CompensationModel hour = new HourlyCompensationModel(50.0);
        CompensationModel commission = new CommissionCompensationModel(25, 40);
        CompensationModel base = new BasePlusCompensationModel(30, 40, 50);
        Payable invoice = new Invoice("007", "seat", 7, 55);
        CompensationModel[] compensate = {salary, hour, commission, base};

        System.out.println("Invoice: "+invoice.getPaymentAmount());
        System.out.println();

        for(CompensationModel comp : compensate){
            System.out.println(comp.earnings());
        }

        System.out.println();
        //after change
        for(CompensationModel comp : compensate){
            double newEarning = comp.earnings() + 100;
            System.out.println(newEarning);
        }
    }
}