package VehicleCatalogue_06_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Car> listOfCars = new ArrayList<>();
        List<Truck> listOfTrucks = new ArrayList<>();
        String input = scan.nextLine();
        int carsHorsePower = 0;
        int truckHorsePower = 0;
        while (!input.equals("End")) {
            String[] commandDatabase = input.split("\\s+");
            String tyPeOfVehicle = commandDatabase[0];
            String modelOfVehicle = commandDatabase[1];
            String colorOfVehicle = commandDatabase[2];
            int horsepowerOfVehicle = Integer.parseInt(commandDatabase[3]);
            if (tyPeOfVehicle.equals("truck")) {
                Truck truck = new Truck(tyPeOfVehicle, modelOfVehicle, colorOfVehicle, horsepowerOfVehicle);
                truckHorsePower += truck.getHorsePowerOfTruck();
                listOfTrucks.add(truck);
            } else if (tyPeOfVehicle.equals("car")) {
                Car car = new Car(tyPeOfVehicle, modelOfVehicle, colorOfVehicle, horsepowerOfVehicle);
                carsHorsePower += car.getHorsePower();
                listOfCars.add(car);
            }
            input = scan.nextLine();
        }
        input = scan.nextLine();
        while (!input.equals("Close the Catalogue")) {
            for (Car listOfCar : listOfCars) {
                if (input.equals(listOfCar.getModel())) {
                    System.out.println(listOfCar.toString());
                }
            }
            for (Truck listOfTruck : listOfTrucks) {
                if (input.equals(listOfTruck.getModelOfTruck())) {
                    System.out.println(listOfTruck.toString());
                }
            }
            input = scan.nextLine();
        }
        double avgCarHorsePower = 0;
        if (listOfCars.size() != 0) {
            avgCarHorsePower = carsHorsePower * 1.0 / listOfCars.size();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", avgCarHorsePower);
        double avgTruckHorsePower = 0;
        if(listOfTrucks.size() != 0){
            avgTruckHorsePower = truckHorsePower *1.0 / listOfTrucks.size();
        }
        System.out.printf("Trucks have average horsepower of: %.2f.%n", avgTruckHorsePower);
    }
}
