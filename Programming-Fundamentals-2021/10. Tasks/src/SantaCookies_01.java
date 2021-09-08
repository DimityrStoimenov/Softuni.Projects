import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SantaCookies_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amountOfBatches = Integer.parseInt(scan.nextLine());
        List<Integer> boxes = new ArrayList<>();
        int totalCookiesPerBake;
        int boxesPerBatch;
        for (int i = 0; i < amountOfBatches; i++) {
            int amountOfFlourInGrams = Integer.parseInt(scan.nextLine());
            int amountOfSugarIngGrams = Integer.parseInt(scan.nextLine());
            int amountOfCocoaInGrams = Integer.parseInt(scan.nextLine());
            int flourCups = amountOfFlourInGrams / 140;
            int sugarSpoons = amountOfSugarIngGrams / 20;
            int cocoaSpoons = amountOfCocoaInGrams / 10;
            int min = Math.min(flourCups, sugarSpoons);
             if (flourCups == 0 || sugarSpoons == 0 || cocoaSpoons == 0) {
                System.out.println("Ingredients are not enough for a box of cookies.");
            } else {
                 totalCookiesPerBake = ((140 + 20 + 10) * Math.min(min, cocoaSpoons)) / 25;
                 boxesPerBatch = totalCookiesPerBake / 5;
                 boxes.add(boxesPerBatch);
                 System.out.printf("Boxes of cookies: %d%n",boxesPerBatch);
             }
        }
        int sumOfTotalBoxes = 0;
        for (Integer box : boxes) {
            sumOfTotalBoxes += box;
        }
        System.out.printf("Total boxes: %d", sumOfTotalBoxes);
    }
}

