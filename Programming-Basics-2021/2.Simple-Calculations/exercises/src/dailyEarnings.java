import java.util.Scanner;

public class dailyEarnings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int workingDaysPerMouth = Integer.parseInt(scan.nextLine());
        double moneyPerMouth = Double.parseDouble(scan.nextLine());
        double dollarPerLev = Double.parseDouble(scan.nextLine());

        double monthlySalaryInUSD = workingDaysPerMouth * moneyPerMouth;
        double annualRevenue = (monthlySalaryInUSD * 12) +(monthlySalaryInUSD *2.5);
        double annualTax =  annualRevenue * 0.25;
        double netAnnualTax = annualRevenue - annualTax;
        double annualIncomeInBGN = netAnnualTax * dollarPerLev;
        double averageDailyProfitInBGN = annualIncomeInBGN / 365;
        System.out.printf("%.2f", averageDailyProfitInBGN);
    }
}
