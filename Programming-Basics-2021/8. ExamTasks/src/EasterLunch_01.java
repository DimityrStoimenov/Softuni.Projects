import java.util.Scanner;
public class EasterLunch_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfEasters= Integer.parseInt(scan.nextLine());
        int numberOfEggsPackages= Integer.parseInt(scan.nextLine());
        int kilogramsOfCookies= Integer.parseInt(scan.nextLine());
        double prizeOfEasters= numberOfEasters * 3.20;
        double prizeOfEggs= numberOfEggsPackages * 4.35;
        double prizeOfPaintedEggs = numberOfEggsPackages * 12 * 0.15;
        double prizeOfCookies = kilogramsOfCookies * 5.40;
        double totalCost = prizeOfEasters + prizeOfEggs + prizeOfPaintedEggs + prizeOfCookies;
        System.out.printf("%.2f", totalCost);
    }
}
