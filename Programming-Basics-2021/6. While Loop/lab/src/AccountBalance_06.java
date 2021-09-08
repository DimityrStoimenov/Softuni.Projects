import java.util.Scanner;

public class AccountBalance_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // deposit - колко вноски очакваме
        // currentDeposit= 1 ( първият ни депозит , от който започваме да броим
        // ДОКАТО
        // currentDeposit<= deposit
        // double income ( сумите които ще получваме като число и ще ги прибавяме към сметката (sum)
        // sum= sum + income
        // Правим проверка за прихода(currentdeposit<=deposit)
        // инкрементираме с currentDeposit++ и пак правим проверка за броя на вноските , докато стигнат равни на числото deposit

        int deposit= Integer.parseInt(scan.nextLine());
        int currentDeposit = 1;
        double sum = 0;
        while (currentDeposit <= deposit) {
            double income = Double.parseDouble(scan.nextLine());
            if(income <0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n",income);
            sum +=  income;
            currentDeposit++;
        }
        System.out.printf("Total: %.2f%n", sum);
    }
}

