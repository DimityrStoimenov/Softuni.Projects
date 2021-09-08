import java.util.Scanner;

public class RageExpenses_10_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());
        double costHeadset = 0;
        double costMouse = 0;
        double costKeyboard = 0;
        double costDisplay = 0;
        while (lostGamesCount > 0) {
            if (lostGamesCount % 2 == 0) {
                costHeadset += headsetPrice;
            }
            if (lostGamesCount % 3 == 0) {
                costMouse += mousePrice;
            }
            if (lostGamesCount % 6 == 0) {
                costKeyboard += keyboardPrice;
            }
            if (lostGamesCount % 12 == 0) {
                costDisplay += displayPrice;
            }
            lostGamesCount--;
        }
        double totalCost = costHeadset + costDisplay + costMouse + costKeyboard;
        System.out.printf("Rage expenses: %.2f lv.", totalCost);

    }
}

