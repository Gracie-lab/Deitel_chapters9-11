import java.io.IOException;

public  class SomeClass {
    private String name;
    private static int num;
    private static int denominator;
    private static int numerator;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

//    public SomeClass(String name, int num) throws Exception{
//        this.name = name;
//        try{
//            throw ExceptionA;
//            if(num > 40){
//                this.num = num;
//            }
//        }catch(ExceptionA e){
//            System.out.println("Number should be greater than 40");
//        }
//    }

    public SomeClass(String name, int num) throws Exception{
        if (num < 40) {
            throw new IllegalArgumentException("Number must be >= 40");
         }
        this.num = num;
        this.name = name;
    }

    public SomeClass(int denominator, int numerator){
        this.denominator = denominator;
        this.numerator = numerator;
    }

//Exercise 11.20
    public static void someMethod()throws Exception{
        try{
            someMethod2();
        }catch(Exception exception){
            throw new Exception("Exception thrown in method1", exception);
        }
    }

    public static void someMethod2() throws Exception{

        if (num > 20){
            throw new IllegalArgumentException("Number must be > 20");
        }
    }

    //11.20
    public static void main(String... args){
        num = 45;
        try{
            someMethod();
        }catch(Exception exception){
            exception.printStackTrace();
        }

    }

    public void classException() throws Exception{
        double division = numerator / denominator;
        if(numerator < 1){
            throw new ExceptionA("ExceptionA caught.    Numerator should be greater than or equal to 1");
        }
        if(denominator < numerator){
            throw new ExceptionB("ExceptionB caught.    Denominator cannot be less than numerator");
        }
        if (numerator > 20){
            throw new NullPointerException("NullPointerException caught.  Number must be > 20");
        }
        if(numerator > 100){
            throw new IOException("IO exception caught");
        }
    }


}
