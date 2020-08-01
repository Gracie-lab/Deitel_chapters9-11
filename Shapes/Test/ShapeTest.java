import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testShapes(){
        Shape circle = new Circle(24);
        Shape triangle = new Triangle(4, 5);
        Shape square = new Square(8);
        Shape sphere = new Sphere(20);
        Shape cube = new Cube(5);
        Shape tetra = new Tetrahedron(7);
        Shape[] shapes = {circle, triangle, square, sphere, cube, tetra};

        for(Shape shape : shapes){
            //print description of shape
            if(shape instanceof ThreeDimension){
                System.out.println(shape.toString());
                System.out.println("Area: "+shape.getArea());
                System.out.println("Volume: "+shape.getVolume());
                System.out.println();
            }
            else{
                System.out.println(shape.toString());
                System.out.println("Area: "+shape.getArea());
                System.out.println();
            }
        }
    }
}