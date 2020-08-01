public class Bird extends Animal {

    public Bird(){
        //super(4);
        //call constructor of class Bird
        this("Black");
    }

    public Bird(String color){
        //call constructor of superclass Animal
        super(4, color);
    }
    @Override
    public void move(){
        System.out.println("I'm flying ....");
    }
}
