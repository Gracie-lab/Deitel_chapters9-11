public class Sphere extends ThreeDimension {
    private double pi = 3.142;
    private double radius;

    public Sphere( double radius) {
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
        double area = (4 * pi) * (radius * radius);
        return area;
    }

    @Override
    public double getVolume() {
        double volume = (4/3) * pi * (radius * radius * radius);
        return volume;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "pi=" + pi +
                ", radius=" + radius +
                '}';
    }
}
