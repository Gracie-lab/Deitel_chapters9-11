public class Building implements CarbonFootPrint {
    private String color;
    private String type;
    private String location;
    private double fossilFuelUse;
    private double emissionsFactor;

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public double getFossilFuelUse() {
        return fossilFuelUse;
    }

    public double getEmissionsFactor() {
        return emissionsFactor;
    }

    public Building(String color, String type, String location, double fossilFuelUse, double emissionsFactor) {
        this.color = color;
        this.type = type;
        this.location = location;
        this.fossilFuelUse = fossilFuelUse;
        this.emissionsFactor = emissionsFactor;
    }

    @Override
    public double getCarbonFootPrint() {
        return fossilFuelUse * emissionsFactor;

    }

    @Override
    public String toString() {
        return "Building{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
