import java.util.Scanner;

public class hasMoney {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bankAccount = 50;
        int requiredMoney = Integer.parseInt(scan.nextLine());
        if (requiredMoney <= bankAccount) {
            System.out.println(requiredMoney);
        } else {
            System.out.println("Недостатъчна наличност");
        }
        System.out.println("Goodbye");
    }
}
