public class Car implements CarbonFootPrint{
    private String color;
    private String model;
    private String year;
    private double mileage;
    private double emissionsFactor;

    public Car(String color, String model, String year, double milleage, double emmissionsFactor) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.mileage = milleage;
        this.emissionsFactor = emmissionsFactor;
    }

    @Override
    public double getCarbonFootPrint() {
            return mileage / emissionsFactor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
