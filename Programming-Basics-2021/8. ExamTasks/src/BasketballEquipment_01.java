import java.util.Scanner;

public class BasketballEquipment_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int annualFee = Integer.parseInt(scan.nextLine());
        double sneakers = annualFee - (annualFee * 0.4);
        double outfit = sneakers - (sneakers * 0.2);
        double ball = outfit /4;
        double accessories = ball /5;
        double totalCosts = annualFee + sneakers + outfit +ball + accessories;
        System.out.printf("%.2f", totalCosts);
    }
}
