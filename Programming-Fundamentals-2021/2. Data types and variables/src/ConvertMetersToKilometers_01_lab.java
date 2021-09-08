import java.util.Scanner;

public class ConvertMetersToKilometers_01_lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  meters = Integer.parseInt(scan.nextLine());
        double kilometers = meters * 1.0 / 1000;
        System.out.printf("%.2f", kilometers);
    }
}
