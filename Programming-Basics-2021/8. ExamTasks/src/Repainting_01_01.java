import java.util.Scanner;

public class Repainting_01_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amountOfNylon = Integer.parseInt(scan.nextLine());
        int amountOfPaint = Integer.parseInt(scan.nextLine());
        int amountOfThinner = Integer.parseInt(scan.nextLine());
        int workHours = Integer.parseInt(scan.nextLine());
        double totalPaint = amountOfPaint  * 1.1;
        double prizePaint = totalPaint * 14.50;
        double prizeNylon = (amountOfNylon * 1.50) + (2 * 1.50);
        double prizeThinner = amountOfThinner * 5.00;
        double totalCost = prizeNylon + prizePaint+ prizeThinner + 0.40;
        double costWorkers = workHours * (totalCost * 0.3);
        double Cost = totalCost + costWorkers;
        System.out.printf("Total expenses: %.2f lv.",Cost);
    }
}
