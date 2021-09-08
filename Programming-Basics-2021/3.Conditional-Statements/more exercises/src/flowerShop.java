import java.util.Scanner;

public class flowerShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfMagnolias = Integer.parseInt(scan.nextLine()); // брой магнолии
        int numberOfHyacinths = Integer.parseInt(scan.nextLine()); // брой зюмбюли
        int numberOfRoses = Integer.parseInt(scan.nextLine()); // брой рози
        int numberOfCactuses = Integer.parseInt(scan.nextLine()); // брой кактуси
        double giftPrice = Double.parseDouble(scan.nextLine()); // цена на подаръка

        double magnoliasSold = numberOfMagnolias * 3.25;
        double hyacinthsSold = numberOfHyacinths * 4.0;
        double rosesSold = numberOfRoses * 3.50;
        double cactusesSold = numberOfCactuses * 8.0;
        double allFlowersSold = magnoliasSold + hyacinthsSold + rosesSold + cactusesSold;
        double tax = allFlowersSold * 0.05;
        double pureProfit = allFlowersSold - tax;

        if(giftPrice <= pureProfit) {
            double leftMoney = Math.floor(pureProfit - giftPrice);
            System.out.printf("She is left with %.0f leva.", leftMoney);
        } else if(giftPrice > pureProfit) {
            double neededMoney = Math.ceil(giftPrice - pureProfit);
            System.out.printf("She will have to borrow %.0f leva.", neededMoney);
        }
    }
}
