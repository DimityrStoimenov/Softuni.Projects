import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfBitcoin = Integer.parseInt(scan.nextLine());
        double numberOfYuan = Double.parseDouble(scan.nextLine());
        double commission = Double.parseDouble(scan.nextLine());

        double bitcoinToLeva = numberOfBitcoin * 1168;
        double yuanToDollar = numberOfYuan * 0.15;
        double dollarToLeva = yuanToDollar * 1.76;
        double totalSumOfLeva = bitcoinToLeva + dollarToLeva;
        double levaToEuro = totalSumOfLeva /1.95;
        double percentOfCommission = (levaToEuro * commission)/100;
        double totalSumOfCurrency = levaToEuro - percentOfCommission;
        System.out.println(totalSumOfCurrency);
    }
}
