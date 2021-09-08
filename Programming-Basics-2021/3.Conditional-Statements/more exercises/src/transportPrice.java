import java.util.Scanner;

public class transportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine()); // брой километри
        String name = scan.nextLine(); // day or night
        if(name.equals("day")&& n<20) {
            double taxiDailyRate = (0.79 * n) + 0.70;
            System.out.printf("%.2f", taxiDailyRate);
        } else if (name.equals("night")&& n<20) {
            double taxiNightRate = (0.90 * n) + 0.70;
            System.out.printf("%.2f", taxiNightRate);
        }
        if(name.equals("day")||name.equals("night")) {
            if(n>=20 && n<=99) {
                double busRate = n * 0.09;
                System.out.printf("%.2f", busRate);
            }
            if(n>=100) {
                double trainRate = n * 0.06;
                System.out.printf("%.2f", trainRate);
            }
        }
    }
}
