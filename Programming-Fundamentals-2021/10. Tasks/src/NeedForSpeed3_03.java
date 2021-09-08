import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NeedForSpeed3_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfCars = Integer.parseInt(scan.nextLine());
        List<Cars> allCars = new ArrayList<>();
        for (int i = 0; i < numberOfCars ; i++) {
            String currentCAR = scan.nextLine();
            String [] databaseOfCar = currentCAR.split("\\|");
            String car = databaseOfCar[0];
            int mileage = Integer.parseInt(databaseOfCar[1]);
            int fuel = Integer.parseInt(databaseOfCar[2]);
            Cars newCar = new Cars (car, mileage, fuel);
           allCars.add(newCar);
        }
        String input = scan.nextLine();
        while (!input.equals("Stop")) {
            //•	Drive : {car} : {distance} : {fuel}
            //•	Refuel : {car} : {fuel}
            //•	Revert : {car} : {kilometers}
            String [] tokens = input.split("\\s+:\\s+");
            String command = tokens[0];
            String car = tokens[1];
            switch(command) {
                case "Drive":
                    int distance = Integer.parseInt(tokens[2]);
                    int tank = Integer.parseInt(tokens[3]);
                    for (int i = 0; i <= allCars.size() - 1 ; i++) {
                      if (allCars.get(i).getCar().equals(car)) {
                        int currentMileage = allCars.get(i).getMileage();
                        int currentFuel = allCars.get(i).getFuel();
                        if(currentFuel >= tank) {
                            int fuelLeft = currentFuel - tank;
                            int newMileage = currentMileage + distance;
                            if (newMileage <= 100000) {
                                allCars.get(i).setMileage(newMileage);
                                allCars.get(i).setFuel(fuelLeft);
                                System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n"
                                ,car,distance,tank);
                            } else {
                               allCars.remove(allCars.get(i));
                                System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n"
                                        ,car,distance,tank);
                               System.out.printf("Time to sell the %s!%n", car);
                            }
                        } else {
                           System.out.println("Not enough fuel to make that ride");
                        }
                      }
                    }
                    break;
                case "Refuel":
                    int refuel = Integer.parseInt(tokens[2]);
                    for (int i = 0; i <= allCars.size() - 1 ; i++) {
                        if (allCars.get(i).getCar().equals(car)) {
                            int fuel = allCars.get(i).getFuel();
                            int fuelling = fuel + refuel;
                            if ( fuelling >= 75) {
                                fuelling = 75;
                                System.out.printf("%s refueled with %d liters%n",car, 75  -  fuel);
                                allCars.get(i).setFuel(fuelling);
                            } else {
                                allCars.get(i).setFuel(fuelling);
                                System.out.printf("%s refueled with %d liters%n",car, refuel);
                            }
                        }

                    }
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(tokens[2]);
                    for (int i = 0; i <= allCars.size() - 1 ; i++) {
                      if (allCars.get(i).getCar().equals(car)) {
                        int currentMileage = allCars.get(i).getMileage();
                        int decreaseMileage = currentMileage - kilometers;
                        if(decreaseMileage <= 10000) {
                            decreaseMileage = 10000;
                            allCars.get(i).setMileage(decreaseMileage);
                        } else {
                           allCars.get(i).setMileage(decreaseMileage);
                           System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);
                        }
                      }
                    }
                    break;
            }
            input = scan.nextLine();
        }
        allCars.stream().sorted((a,b) -> {
            int result = Integer.compare(b.getMileage(),a.getMileage());
            if (result == 0) {
                result = a.getCar().compareTo(b.getCar());
            }
            return result;
        }).forEach(entry -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                entry.getCar(),entry.getMileage(),entry.getFuel()));

    }
}
class Cars {
    private String car;
    private int mileage;
    private int fuel;

    public String getCar() {
        return car;
    }

    public int getMileage() {
        return mileage;
    }

    public int getFuel() {
        return fuel;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public Cars (String car, int mileage, int fuel) {
        this.car = car;
        this.mileage = mileage;
        this.fuel = fuel;
    }
}
