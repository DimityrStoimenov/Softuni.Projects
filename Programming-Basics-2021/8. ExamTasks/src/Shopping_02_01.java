import java.util.Scanner;

public class Shopping_02_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int vCards = Integer.parseInt(scan.nextLine());
        int pcs = Integer.parseInt(scan.nextLine());
        int ram = Integer.parseInt(scan.nextLine());
        int prizeVCards = vCards * 250;
        double prizePcs = (prizeVCards * 0.35) * pcs;
        double prizeRam = (prizeVCards * 0.1) * ram;
        double total = prizeVCards + prizePcs + prizeRam;
        if(vCards > pcs) {
            total = total - (total* 0.15);
        }
        if( total <= budget) {
            double left = budget - total;
            System.out.printf("You have %.2f leva left!", left);
        } else {
            double needed = total - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", needed);
        }
    }
}
