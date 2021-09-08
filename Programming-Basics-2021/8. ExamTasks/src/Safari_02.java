import java.util.Scanner;
public class Safari_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        double requiredLitersOfFuel= Double.parseDouble(scan.nextLine());
        String dayOfWeek = scan.nextLine(); //"Saturday" и "Sunday"
        double prizeOfFuel= requiredLitersOfFuel * 2.10;
        double Prize = prizeOfFuel + 100;
        double netPrize=0;
        if(dayOfWeek.equals("Saturday")) {
            netPrize = Prize - (Prize * 0.1);
        } else if(dayOfWeek.equals("Sunday")) {
            netPrize = Prize - (Prize * 0.2);
        }
        if(netPrize<= budget) {
            double leftMoney = budget - netPrize;
            System.out.printf("Safari time! Money left: %.2f lv.", leftMoney);
        } else {
            double neededMoney = netPrize - budget;
            System.out.printf("Not enough money! Money needed: %.2f lv.", neededMoney);
        }
    }
}
