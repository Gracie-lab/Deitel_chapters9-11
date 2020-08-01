public class Tetrahedron extends ThreeDimension {
    private double edge;
    public Tetrahedron(double edge){
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return 1.73 * (edge * edge);
    }

    @Override
    public double getVolume() {
        return (edge * edge * edge)/8.49;
    }

    @Override
    public String toString() {
        return "Tetrahedron{" +
                "edge=" + edge +
                '}';
    }
}
