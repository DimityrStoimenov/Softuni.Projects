package VehicleCatalogue_06_Exercises;

public class Car {
    private String typeOfVehicle;
    private String model;
    private String colorOfCar;
    private int horsePower;

    public Car(String typeOfVehicle, String model, String colorOfCar, int horsePower) {
       this.typeOfVehicle = "Car";
        this.model = model;
        this.colorOfCar = colorOfCar;
        this.horsePower = horsePower;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public String getModel() {
        return model;
    }

    public String getColorOfCar() {
        return colorOfCar;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%n"+
                "Model: %s%n"+
                "Color: %s%n"+
                "Horsepower: %d", this.typeOfVehicle, this.model, this.colorOfCar, this.horsePower);

    }
}

