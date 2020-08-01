public class Circle extends TwoDimension {
    private double pi = 3.142;
    private double radius;

    public Circle( double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = pi * (radius * radius);
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "pi=" + pi +
                ", radius=" + radius +
                '}';
    }
}
