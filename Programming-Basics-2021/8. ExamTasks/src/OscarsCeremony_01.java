import java.util.Scanner;

public class OscarsCeremony_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rentalHall = Integer.parseInt(scan.nextLine());
        double figurines = rentalHall - ( rentalHall * 0.3);
        double catering = figurines - (figurines * 0.15);
        double soundSystem = catering /2;
        double totalCosts = rentalHall + figurines + catering + soundSystem;
        System.out.printf("%.2f", totalCosts);
    }
}
