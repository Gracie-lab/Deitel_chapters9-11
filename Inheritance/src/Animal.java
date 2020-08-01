import java.util.List;
//an abstract class cannot be instantiated
public abstract class Animal{
    private String color;
    private int numberOfLimbs;
    private String eyeColor;
    private List<Eye> eyes;
    private Breather imu;

    //public Animal(){

    //}

    public Animal(int limbsCount){
        numberOfLimbs = limbsCount;
    }

    public Animal(int numberOfLimbs, String color){
        this.numberOfLimbs = numberOfLimbs;
        this.color = color;
    }

    //abstract methods should not have a body
    public abstract void move();


    //public void move(){
    //    System.out.println("I'm not moving...");
   // }

    public void eat(){
        System.out.println("I'm eating...");
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfLimbs() {
        return numberOfLimbs;
    }

    public void setNumberOfLimbs(int numberOfLimbs) {
        this.numberOfLimbs = numberOfLimbs;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Breather getImu() {
        return imu;
    }

    public void setImu(Breather imu) {
        this.imu = imu;
    }

    public List<Eye> getEyes() {
        return eyes;
    }

    public void setEyes(List<Eye> eyes) {
        this.eyes = eyes;
    }
}
