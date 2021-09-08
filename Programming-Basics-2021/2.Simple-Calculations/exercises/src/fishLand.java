import java.util.Scanner;

public class fishLand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mackerelPrice = Double.parseDouble(scan.nextLine()); // цена на скумрията в килограми
        double spratPrice = Double.parseDouble(scan.nextLine()); // цена на цацата в килограми
        double chamoisKg = Double.parseDouble(scan.nextLine()); // килограми паламуд
        double scadKg = Double.parseDouble(scan.nextLine()); // килограми сафрид
        int musselsKg = Integer.parseInt(scan.nextLine()); // килограма миди

        double chamoisPrice = mackerelPrice + (mackerelPrice * 0.6); // цена на паламуда
        double scadPrice = spratPrice + (spratPrice * 0.8); // цена на сафрида
        double chamois = chamoisKg * chamoisPrice; // закупен паламуд
        double scad = scadKg * scadPrice; //  закупен сафрид
        double mussels = musselsKg * 7.50; // закупени миди
        double fisheryProducts = chamois + scad + mussels; // закупени рибни продукти
        System.out.printf("%.2f", fisheryProducts);


    }
}
