import java.util.Scanner;

public class FruitMarket_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // прочитаме си входа
        double priceOfStrawberries= Double.parseDouble(scan.nextLine());
        double quantityOfBananasInKilograms= Double.parseDouble(scan.nextLine());
        double quantityOfOrangesInKilograms= Double.parseDouble(scan.nextLine());
        double quantityOfRaspberriesInKilograms= Double.parseDouble(scan.nextLine());
        double strawberriesInKilograms= Double.parseDouble(scan.nextLine());
        // намираме цената на малините за килограм
        double priceOfRaspberries= priceOfStrawberries - (priceOfStrawberries * 0.5);
        //  намираме цената на портокалите за килограм
        double priceOfOranges = priceOfRaspberries - (priceOfRaspberries * 0.4);
        //  намираме цената на бананите за килограм
        double costOfBananas= priceOfRaspberries - (priceOfRaspberries * 0.8);
        //  и сега умножаваме съотвените цени по количествата и произведенията  ги събираме за
        //  намерим общата цена
        double strawberries = priceOfStrawberries * strawberriesInKilograms;
        double raspberries= priceOfRaspberries * quantityOfRaspberriesInKilograms;
        double oranges= priceOfOranges*quantityOfOrangesInKilograms;
        double bananas= costOfBananas*quantityOfBananasInKilograms;
        double totalSum= strawberries+raspberries+oranges+bananas;
        System.out.printf("%.2f",totalSum);
    }
}

