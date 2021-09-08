import java.util.Scanner;

public class EasterShop_04_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int initialQuantityOfEggs= Integer.parseInt(scan.nextLine());
        String command= scan.nextLine();// "Buy" или "Fill"
        int numberOfSoldEggs=0;
        int boughtEggs=0;
        int deliveredEggs=0;
        while(!"Close".equals(command)) {
           switch(command) {
               case "Buy":
                   boughtEggs = Integer.parseInt(scan.nextLine());
                   initialQuantityOfEggs -= boughtEggs;
                   numberOfSoldEggs += boughtEggs;
                   break;
               case "Fill":
                   deliveredEggs = Integer.parseInt(scan.nextLine());
                   initialQuantityOfEggs += deliveredEggs;
                   break;
           }
            if(initialQuantityOfEggs < 0) {
                break;
            }

            command= scan.nextLine();
        }
        if("Close".equals(command)) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.",numberOfSoldEggs);
        } else {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.",Math.abs(initialQuantityOfEggs + boughtEggs));

        }
    }
}
