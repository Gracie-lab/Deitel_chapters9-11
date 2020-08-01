import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionPractiseTest {


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testCatch(){
//        9.16;
        //superclass exceptions objects catches objects of its subclasses implicitly
        ExceptionPractise practice = new ExceptionPractise();
        try{
            practice.testException();
        }catch(ExceptionA e){
        }
    }

    @Test
    void defineExceptions(){
        ExceptionPractise practice = new ExceptionPractise();
        Exception ex1 = new ExceptionA("i");
        Exception ex2 = new ExceptionB("i");
        try{
            practice.testException();
        }
        catch(ExceptionC e){

        }catch(ExceptionB e){

        }catch(ExceptionA e){
        }
        //to individually catch exceptions of the same heirarchy, catch the subclasses before the superclass
    }

    @Test
    void constructorException() {
        try {
            SomeClass someClass = new SomeClass("Joy", 4);
        } catch (Exception exception) {
            System.out.println("Oops");
        }
    }

    @Test
    //class Exception used to catch 4 different different exceptions
    void catchDifferentExceptionsFromClassExceptionTest(){
        SomeClass someClass = new SomeClass(100,120);
        try{
            someClass.classException();
        }catch(Exception exception){
            System.err.println(exception);
        }
    }

    @Test
    void outOfScopeTest(){

            try{
                SomeClass someClass = new SomeClass("Jane", 2);
                SomeClass someClass1 = new SomeClass(120,100);
                someClass.someMethod();
                 } // end try block
             catch ( ExceptionB exception )
            {
                System.err.printf( "Handled in main: %s", exception );
                 } // end catch block
            catch ( Exception exception )
            {
                System.out.println(exception);
//                exception.printStackTrace();
                } // end catch block
             }
    }

