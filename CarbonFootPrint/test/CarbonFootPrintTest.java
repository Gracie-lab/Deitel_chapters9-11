import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CarbonFootPrintTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testInterface(){
        CarbonFootPrint building = new Building("white", "bungalow", "Yaba", 12.5, 5.5);
        CarbonFootPrint car = new Car("Black", "Toyota", "1999" , 25, 2.33);
        CarbonFootPrint bicycle = new Bicycle("black", "Mikraine", 12, 1.5);
        ArrayList<CarbonFootPrint> items = new ArrayList<>();
        items.add(building);
        items.add(car);
        items.add(bicycle);

        for(CarbonFootPrint footprint : items){
            System.out.println(footprint.toString());
            System.out.println("Carbon foot print:  " +footprint.getCarbonFootPrint());
        }

    }
}