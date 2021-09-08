import java.util.Scanner;

public class cleverLily_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ageLily = Integer.parseInt(scan.nextLine());
        double costWashMachine= Double.parseDouble(scan.nextLine());
        int costPerToy = Integer.parseInt(scan.nextLine());
        int toy=0;
        double moneyForEvenBirthday=0;
        int decrementMoney=0;
        double moneyAfterSellingTheToys=0;
        double pureMoney= 0;
        double totalMoney=0;

        for (int i = 0; i <=ageLily ; i++) {
            if (i % 2 == 1) {
                toy+=1;
            }

        }
            for (int i = 0; i <=ageLily ; i++) {
                if (i % 2 == 0) {
                    moneyForEvenBirthday=moneyForEvenBirthday +10;
                    moneyForEvenBirthday+=10;

                }
            }


        moneyAfterSellingTheToys = toy * costPerToy;
        totalMoney= moneyAfterSellingTheToys + moneyForEvenBirthday;
        if(totalMoney>=costWashMachine) {
            double leftMoney = totalMoney - costWashMachine;
            System.out.printf("Yes! %.2f", leftMoney);
        }
        if(totalMoney<=costWashMachine) {
            double neededMoney = costWashMachine-totalMoney;
            System.out.printf("No! %.2f", neededMoney);
        }
    }

}
