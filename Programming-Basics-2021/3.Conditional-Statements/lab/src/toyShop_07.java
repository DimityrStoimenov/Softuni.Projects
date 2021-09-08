import java.util.Scanner;

public class toyShop_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scan.nextLine()); // цена на екскурзията
        int numberOfPuzzles = Integer.parseInt(scan.nextLine()); // брой пъзели
        int numberOfDolls = Integer.parseInt(scan.nextLine()); // брой говорещи кукли
        int numberOfBears = Integer.parseInt(scan.nextLine()); // брой плюшени мечета
        int numberOfMinions = Integer.parseInt(scan.nextLine()); // брой миньони
        int numberOfTrucks = Integer.parseInt(scan.nextLine()); // брой камиончета

        double totalCostOfToys = (numberOfPuzzles * 2.60) + (numberOfDolls * 3.0) + (numberOfBears * 4.10) + (numberOfMinions * 8.20) + (numberOfTrucks * 2.0);
        int numberOfToys = numberOfPuzzles + numberOfDolls + numberOfBears + numberOfMinions + numberOfTrucks;
        if (numberOfToys < 50) {
            double rentTax = (0.1 * totalCostOfToys);
            double netIncomeAfterRent = totalCostOfToys - rentTax;
            if (netIncomeAfterRent >= tripPrice) {
                double leftMoneyAsADifference = netIncomeAfterRent - tripPrice;
                System.out.printf("Yes! %.2f lv left.", leftMoneyAsADifference);
            } else if (netIncomeAfterRent < tripPrice) {
                double missingMoneyAsADifference = tripPrice - netIncomeAfterRent;
                System.out.printf("Not enough money! %.2f lv needed.", missingMoneyAsADifference);
            }
        }if (numberOfToys >= 50) {
            double discount = (0.25 * totalCostOfToys);
            double profitAfterDiscount = totalCostOfToys - discount;
            double rent =  (0.1 * profitAfterDiscount);
            double netIncome = profitAfterDiscount - rent;
            if (netIncome >= tripPrice) {
                double leftMoney = netIncome - tripPrice;
                System.out.printf("Yes! %.2f lv left.", leftMoney);
            } else if (netIncome < tripPrice) {
                double missingMoney = tripPrice - netIncome;
                System.out.printf("Not enough money! %.2f lv needed.", missingMoney);
            }
        }
    }
}
