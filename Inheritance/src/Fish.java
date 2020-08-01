public class Fish extends Animal {
    public Fish(){
        super(0);
    }

    @Override
    public void move() {
        System.out.println("I'm swimming");
    }
}
