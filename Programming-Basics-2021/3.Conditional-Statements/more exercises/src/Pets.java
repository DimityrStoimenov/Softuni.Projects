import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfDays = Integer.parseInt(scan.nextLine()); // брой дни в които отсъства
        int leftFoodPerKg = Integer.parseInt(scan.nextLine()); // оставена храна в килограми
        double dogFoodOfKgPerDay = Double.parseDouble(scan.nextLine()); // храна за кучето в кг на ден
        double catFoodOfKgPerDay = Double.parseDouble(scan.nextLine()); // храна за котката в кг на ден
        double turtleFoodOfGramsPerDay = Double.parseDouble(scan.nextLine()); // храна за костенурката на ден в гр

        double dogFoodforAllDays = numberOfDays * dogFoodOfKgPerDay;
        double catFoodForAllDays = numberOfDays * catFoodOfKgPerDay;
        double turtleFoodForAllDays = numberOfDays * (turtleFoodOfGramsPerDay /1000);
        double totalFoodForAllAnimals = dogFoodforAllDays + catFoodForAllDays + turtleFoodForAllDays;

        if(totalFoodForAllAnimals <= leftFoodPerKg) {
            double leftFood = Math.floor(leftFoodPerKg - totalFoodForAllAnimals);
            System.out.printf("%.0f kilos of food left.",leftFood);
        } else if (totalFoodForAllAnimals >= leftFoodPerKg) {
            double neededFood = Math.ceil(totalFoodForAllAnimals - leftFoodPerKg);
            System.out.printf("%.0f more kilos of food are needed.", neededFood);
        }
    }
}
