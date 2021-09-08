import java.util.Scanner;

public class RageExpenses_SecondDecision_10_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gameLose = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());
        int countHeadsets = gameLose / 2;
        int countMouses = gameLose/ 3;
        int countKeyboards = gameLose / 6;
        int countDisplays = gameLose / 12;
        double expenses = (countHeadsets *  headsetPrice) +(countMouses* mousePrice) + (countKeyboards * keyboardPrice) +
                (countDisplays * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }

}
