import java.util.Scanner;

public class vegetableMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double costVegPerKg = Double.parseDouble(scan.nextLine());
        double costFruPerKg = Double.parseDouble(scan.nextLine());
        int kgVeg = Integer.parseInt(scan.nextLine());
        int kgFru = Integer.parseInt(scan.nextLine());

        double vegetables = (costVegPerKg * kgVeg);
        double fruits = (costFruPerKg * kgFru);
        double vegAndFruInEuro = (vegetables + fruits)/1.94;
        System.out.printf("%.2f", vegAndFruInEuro);

    }
}
