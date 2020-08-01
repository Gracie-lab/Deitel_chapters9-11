public class Square extends TwoDimension {
    private double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
