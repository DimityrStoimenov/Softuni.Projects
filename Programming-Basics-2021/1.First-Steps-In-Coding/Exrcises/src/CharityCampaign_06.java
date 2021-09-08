import java.util.Scanner;

public class CharityCampaign_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // прочитаме си входа
        int numberDaysOfCharityCampaign = Integer.parseInt(scan.nextLine());
        int numberOfConfectioners = Integer.parseInt(scan.nextLine());
        int numberOfCakes = Integer.parseInt(scan.nextLine());
        int numberOfWaffles = Integer.parseInt(scan.nextLine());
        int numberOfPanCakes = Integer.parseInt(scan.nextLine());
        // намираме цeнaта на всички торти
        int costForAllCakes= numberOfCakes * 45;
        //  намираме цената на всички гофрети
        double costForAllWaffles= numberOfWaffles * 5.80;
        // намираме цената на всички палачинки
        double costForAllPanCakes= numberOfPanCakes * 3.20;
        // намираме общата цена на всички сладкарски изделия
        double totalCostOfAllSweets= costForAllCakes+costForAllWaffles+costForAllPanCakes;
        // изчисляваме общата сума на сладкарските изделия, които ще бъдат приготвени от всички сладкари за деня
        double totalSumForAllConfectioners= totalCostOfAllSweets * numberOfConfectioners;
        //  намериме общата сума на сладкарските изделия за цялата компания
        double totalSumForAllCharityCampaign= numberDaysOfCharityCampaign * totalSumForAllConfectioners;
        // намираме сумата( за покриване на разходите за продуктите
        double costForProducts = totalSumForAllCharityCampaign / 8;
        //  и ни остава да намерим крайната сума като от нея извадим  разходите за продуктите
        double netSum= totalSumForAllCharityCampaign - costForProducts;
        System.out.printf("%.2f",netSum);

    }
}
