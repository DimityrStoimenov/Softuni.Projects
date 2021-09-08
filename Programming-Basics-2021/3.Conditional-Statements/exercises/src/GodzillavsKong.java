import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int countStatists = Integer.parseInt(scan.nextLine());
        double pricePerStatist = Double.parseDouble(scan.nextLine());
        // разходи = цена декор + цена за облекло
        // декор = 0.1 * бюджет
        //проверка на статистите >150 -> -10%
        // раходи = декор + облекло
        // ? бюджет
        double decorPrice = 0.1 * budget;
        double clothesPrice = countStatists * pricePerStatist;
        if( countStatists > 150) {
            clothesPrice = clothesPrice -0.1 * clothesPrice; // 0.9 * clothesPrice (1 - 0.1) * clothesPrice
        }
        double total = decorPrice + clothesPrice;
        if (total>budget) {
            System.out.println("Not enough money!");
            double needMoney = total - budget;
            System.out.printf("Wingard needs %.2f leva more.", needMoney);
        }
        else {
            System.out.println("Action!");
            double leftMoney = budget - total;
            System.out.printf("Wingard starts filming with %.2f leva left.", leftMoney);
        }
    }
}
