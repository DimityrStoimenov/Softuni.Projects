import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceWhiskey = Double.parseDouble(scan.nextLine());
        double quantityBeerInLiters= Double.parseDouble(scan.nextLine());
        double quantityWineInLiters= Double.parseDouble(scan.nextLine());
        double quantityRakiaInLiters= Double.parseDouble(scan.nextLine());
        double quantityWhiskeyInLiters= Double.parseDouble(scan.nextLine());
        double rakiaPrice=priceWhiskey /2;
        double winePrice= rakiaPrice -(0.4*rakiaPrice);
        double beerPrice= rakiaPrice-(0.8*rakiaPrice);
        double totalPrice= ((priceWhiskey*quantityWhiskeyInLiters)+(winePrice*quantityWineInLiters) +(rakiaPrice*quantityRakiaInLiters)+(beerPrice*quantityBeerInLiters));
        System.out.printf("%.2f", totalPrice);
    }

}
