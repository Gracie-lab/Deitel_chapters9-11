public class Cube extends ThreeDimension {
    private double edge;

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public Cube(double edge){
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return 6 * (edge * edge);
    }

    @Override
    public double getVolume() {
        return edge * edge;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "edge=" + edge +
                '}';
    }
}
