import java.util.Scanner;

public class BlackFlag_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int daysOfThePlunder = Integer.parseInt(scan.nextLine());
        int dailyPlunder = Integer.parseInt(scan.nextLine());
        int expectedPlunder = Integer.parseInt(scan.nextLine());
        double totalPlunder = 0;
        int dayCounter = 0;
        for (int i = 0; i < daysOfThePlunder; i++) {
            totalPlunder += dailyPlunder;
            dayCounter++;
            if (dayCounter % 3 == 0) {
                totalPlunder += dailyPlunder * 0.5;
            }
            if (dayCounter % 5 == 0) {
                totalPlunder = totalPlunder - (totalPlunder * 0.3);
            }
        }
        if ( totalPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
        } else {
            double percentOfTheExpectedPlunder = (totalPlunder / expectedPlunder) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percentOfTheExpectedPlunder);
        }
    }
}
