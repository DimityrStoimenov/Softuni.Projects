import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = Integer.parseInt(scan.nextLine()); // квадратни метра лозе
        double Y = Double.parseDouble(scan.nextLine()); // килограма грозде за един квадратен метър
        int Z = Integer.parseInt(scan.nextLine()); // нужни литри вино
        int N = Integer.parseInt(scan.nextLine()); // брой работници на лозето

        double totalGrapes = X * Y;
        double  quantityWine = (0.4 * (totalGrapes /2.5));
        if(quantityWine < Z) {
            double neededLitersPerWine = Math.abs(Z - quantityWine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(neededLitersPerWine));
        } else if (quantityWine >= Z) {
            char symbol = ':';
            System.out.printf("Good harvest this year! Total wine%c %.0f liters. %n", symbol,Math.floor(quantityWine));
            double leftOverWine = Math.ceil(quantityWine - Z);
            double winePerWorker = Math.ceil(leftOverWine / N);
            char symbols = '-';
            char sym = '>';
            System.out.printf("%.0f liters left %c%c %.0f liters per person.",leftOverWine,symbols,sym,winePerWorker);
        }

    }
}
