import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//import payable.Invoice;
//import payable.Payable;

class PayableTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
//
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
}