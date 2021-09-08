import java.util.Scanner;

public class FuelTank09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fuel = scan.nextLine(); // вид гориво, измежду: "Gas", "Gasoline" или "Diesel"
        double liters = Double.parseDouble(scan.nextLine());// количество гориво
        String clubCard = scan.nextLine(); // възможности "Yes" или "No"

        double costGasoline = liters * 2.22;
        double costDiesel = liters * 2.33;
        double costGas = liters * 0.93;
        double reduction = 0;
        double discount = 0;

        if (fuel.equals("Gasoline") && clubCard.equals("Yes")) {
            reduction = costGasoline - (liters * 0.18);
            if(liters<20) {
                System.out.printf("%.2f lv.", reduction);
            }
            if (liters >= 20 && liters <= 25) {
                discount = reduction - (reduction * 0.08);
                System.out.printf("%.2f lv.", discount);
            } else if (liters > 25) {
                discount = reduction - (reduction * 0.1);
                System.out.printf("%.2f lv.", discount);
            }
        }
        if (fuel.equals("Gasoline") && clubCard.equals("No")) {
            if (liters >= 20 && liters <= 25) {
                discount = costGasoline - (costGasoline * 0.08);
                System.out.printf("%.2f lv.", discount);
            } else if (liters > 25) {
                discount = costGasoline - (costGasoline * 0.1);
                System.out.printf("%.2f lv.", discount);
            } else {
                System.out.printf("%.2f lv.", costGasoline);
            }
        }

        if (fuel.equals("Diesel") && clubCard.equals("Yes")) {
            reduction = costDiesel - (liters * 0.12);
            if (liters<20) {
                System.out.printf("%.2f lv.", reduction);
            }
            if (liters >= 20 && liters <= 25) {
                discount = reduction - (reduction * 0.08);
                System.out.printf("%.2f lv.", discount);
            } else if (liters > 25) {
                discount = reduction - (reduction * 0.1);
                System.out.printf("%.2f lv.", discount);
            }
        }
        if (fuel.equals("Diesel") && clubCard.equals("No")) {
            if (liters >= 20 && liters <= 25) {
                discount = costDiesel - (costDiesel * 0.08);
                System.out.printf("%.2f lv.", discount);
            } else if (liters > 25) {
                discount = costDiesel - (costDiesel * 0.1);
                System.out.printf("%.2f lv.", discount);
            } else {
                System.out.printf("%.2f lv.", costDiesel);
            }
        }
        if (fuel.equals("Gas") && clubCard.equals("Yes")) {
            reduction = costGas - (liters * 0.08);
            if(liters<20) {
                System.out.printf("%.2f lv.", reduction);
            }
            if (liters >= 20 && liters <= 25) {
                discount = reduction - (reduction * 0.08);
                System.out.printf("%.2f lv.", discount);
            } else if (liters > 25) {
                discount = reduction - (reduction * 0.1);
                System.out.printf("%.2f lv.", discount);
            }
        }
        if (fuel.equals("Gas") && clubCard.equals("No")) {
            if (liters >= 20 && liters <= 25) {
                discount = costGas - (costGas * 0.08);
                System.out.printf("%.2f lv.", discount);
            } else if (liters > 25) {
                discount = costGas - (costGas * 0.1);
                System.out.printf("%.2f lv.", discount);
            } else {
                System.out.printf("%.2f lv.", costGas);
            }
        }
    }
}



