import com.shapes.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createHierarchy(){
//        Animal anAnimal = new Animal(1);
//        anAnimal.move();

        Eagle superEagle = new Eagle();
        superEagle.move();

        Python python = new Python();
        Nose imu = new Nose();
        python.setImu(imu);
        Eye leftEye = new Eye();
        Eye rightEye = new Eye();
        python.getEyes().add(rightEye);
        python.getEyes().add(leftEye);
        python.move();
        python.eat();
    }

    @Test
    void specific(){

        Eagle asa = new Eagle(); //code in specific. Asa is an eagle.
        Animal ugo = new Eagle(); //coding in general. Ugo is an eagle and an animal

        Fish eja = new Fish();
        Frog opolo = new Frog();
        Animal[] animals = {asa, ugo, eja, opolo};

        for(Animal animal : animals){
            animal.move();
        }
    }

    @Test
    void testInterface(){
        Quadilateral aRectangle = new Rectangle(3.0, 3.0);
        Quadilateral aSquare = new Square(4);
        Quadilateral aTrapezium = new Trapezium(3,7,9);
        Quadilateral aParallelogram = new Parallelogram(12, 10);
        List<Quadilateral> quads = new ArrayList<>();
        quads.add(aRectangle);
        quads.add(aSquare);
        quads.add(aTrapezium);
        quads.add(aParallelogram);
        Square trySquare;

        for(Quadilateral quad : quads){
            System.out.println(quad.calculateArea());
            if(quad instanceof Square){
                System.out.println("Hooray! I found a square");
                trySquare = (Square) quad;
            }
        }
        //assertEquals(9.0, aRectangle.calculateArea());
    }
}