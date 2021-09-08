import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeedSecondDecision_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Car> cars = new LinkedHashMap<>();
        int numberOfCars = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < numberOfCars ; i++) {
           String car = scan.nextLine();
           String [] carDatabase = car.split("\\|");
           String carName = carDatabase[0];
           int mileage = Integer.parseInt(carDatabase[1]);
           int fuel = Integer.parseInt(carDatabase[2]);
           Car newCar = new Car (mileage,fuel);
           cars.put(carName,newCar);
        }
        String input = scan.nextLine();
        while (!input.equals("Stop")) {
            // •Drive : {car} : {distance} : {fuel}
            //•	Refuel : {car} : {fuel}
            //•	Revert : {car} : {kilometers}
            String [] tokens = input.split("\\s+:\\s+");
            String command = tokens[0];
            String carName = tokens[1];
            switch(command) {
                case "Drive":
                    int distance = Integer.parseInt(tokens[2]);
                    int fuel = Integer.parseInt(tokens[3]);
                    int currentFuel = cars.get(carName).getFuel();
                    if (currentFuel >= fuel) {
                        int currentDistance = cars.get(carName).getMileage();
                        int increaseDistance = currentDistance + distance;
                        int decreaseFuel = currentFuel - fuel;
                        if (increaseDistance < 100000) {
                            cars.get(carName).setMileage(increaseDistance);
                            cars.get(carName).setFuel(decreaseFuel);
                            System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",
                                    carName,distance,fuel);
                        } else {
                            System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",
                                    carName,distance,fuel);
                            cars.remove(carName);
                            System.out.printf("Time to sell the %s!%n", carName);
                        }
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    break;
                case "Refuel":
                    int refuelFuel = Integer.parseInt(tokens[2]);
                    int current = cars.get(carName).getFuel();
                    int refuel = refuelFuel + current;
                    if (refuel > 75) {
                        refuel = 75;
                        cars.get(carName).setFuel(refuel);
                        System.out.printf("%s refueled with %d liters%n", carName,refuel - current);
                    } else {
                        cars.get(carName).setFuel(refuel);
                        System.out.printf("%s refueled with %d liters%n", carName,refuelFuel);
                    }
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(tokens[2]);
                    int currentMileage = cars.get(carName).getMileage();
                    int decreaseMileage = currentMileage - kilometers;
                    if (decreaseMileage < 10000) {
                        decreaseMileage = 10000;
                        cars.get(carName).setMileage(decreaseMileage);
                    } else {
                        cars.get(carName).setMileage(decreaseMileage);
                        System.out.printf("%s mileage decreased by %d kilometers%n", carName, kilometers);
                    }
                    break;
            }
            input = scan.nextLine();
        }
        cars .entrySet().stream().sorted((a,b) ->{
            int result = Integer.compare(b.getValue().getMileage(), a.getValue().getMileage());
            if (result == 0) {
                result = a.getKey().compareTo(b.getKey());
            }
            return result;
        }).forEach(entry -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                entry.getKey(),entry.getValue().getMileage(),entry.getValue().getFuel()));

    }
}
class Car {
    private int mileage;
    private int fuel;

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public Car (int mileage, int fuel) {
        this.mileage = mileage;
        this.fuel = fuel;
    }
}
