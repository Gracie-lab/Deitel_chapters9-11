public class Bicycle implements CarbonFootPrint {
    private String color;
    private String model;
    private double mileage;
    private double emissionFactor;

    public Bicycle(String color, String model, double mileage, double emissionFactor) {
        this.color = color;
        this.model = model;
        this.mileage = mileage;
        this.emissionFactor = emissionFactor;
    }

    @Override
    public double getCarbonFootPrint() {
            return mileage / emissionFactor;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
