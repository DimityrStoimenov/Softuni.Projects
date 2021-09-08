import java.util.Scanner;

public class EasterBake_05_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfEasters= Integer.parseInt(scan.nextLine());
        int packageOfFlour = 750;
        int packageOfSugar = 950;
        int sugarConsumed=0;
        int flourConsumed=0;
        int maxSugar =Integer.MIN_VALUE;
        int maxFlour =Integer.MIN_VALUE;
        int consumedFlour=0;
        int consumedSugar=0;
        for (int i = 1; i <=numberOfEasters; i++) {
            int consumedSugarInGrams = Integer.parseInt(scan.nextLine());
            int consumedFlourInGrams = Integer.parseInt(scan.nextLine());
            sugarConsumed += consumedSugarInGrams;
            consumedSugar=consumedSugarInGrams;
           flourConsumed += consumedFlourInGrams;
           consumedFlour=consumedFlourInGrams;
           if(consumedSugar > maxSugar) {
              maxSugar = consumedSugar;
           }
           if(consumedFlour > maxFlour) {
               maxFlour = consumedFlour;
           }
        }
        double sugar = Math.ceil(sugarConsumed * 1.0 / packageOfSugar);
        double flour = Math.ceil(flourConsumed * 1.0 / packageOfFlour);
        System.out.printf("Sugar: %.0f%n",sugar);
        System.out.printf("Flour: %.0f%n",flour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.",maxFlour,maxSugar);
    }
}
