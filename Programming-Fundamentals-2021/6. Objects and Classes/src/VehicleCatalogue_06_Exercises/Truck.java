package VehicleCatalogue_06_Exercises;

public class Truck {
    private String typeOfVehicle;
    private String modelOfTruck;
    private String colorOfTruck;
    private int horsePowerOfTruck;

    public Truck(String typeOfVehicle, String modelOfTruck, String colorOfTruck, int horsePowerOfTruck) {
        this.typeOfVehicle = "Truck";
        this.modelOfTruck = modelOfTruck;
        this.colorOfTruck = colorOfTruck;
        this.horsePowerOfTruck = horsePowerOfTruck;
    }

    public String getTruck() {
        return typeOfVehicle;
    }

    public String getModelOfTruck() {
        return modelOfTruck;
    }

    public String getColorOfTruck() {
        return colorOfTruck;
    }

    public int getHorsePowerOfTruck() {
        return horsePowerOfTruck;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%n"+
                "Model: %s%n"+
                "Color: %s%n"+
                "Horsepower: %d", this.typeOfVehicle, this.modelOfTruck, this.colorOfTruck, this.horsePowerOfTruck);

    }
}
