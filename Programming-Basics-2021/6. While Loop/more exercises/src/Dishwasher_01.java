import java.util.Scanner;

public class Dishwasher_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bottles= Integer.parseInt(scan.nextLine());
        int necessaryQuantity= bottles*750;
        String command= scan.nextLine();
        int platesCount=0;
        int potCount=0;
        int count=0;
        boolean isAction= false;
        while(!"End".equals(command)) {
            int numberOfWashingDishes= Integer.parseInt(command);
            count++;
            if("End".equals(command)) {
                isAction=true;
                break;
            }
            if(count %3 ==0 ) {
                necessaryQuantity-= 15 * numberOfWashingDishes;
                potCount+=numberOfWashingDishes;
            } else {
                necessaryQuantity-=5 * numberOfWashingDishes;
                platesCount += numberOfWashingDishes;

            }
            if(necessaryQuantity< 0) {
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(necessaryQuantity));
                return;
            }

            command= scan.nextLine();
        }
        if(necessaryQuantity< 0) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(necessaryQuantity));
        }
        if(!isAction && necessaryQuantity>= 0) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", platesCount, potCount);
            System.out.printf("Leftover detergent %d ml.", necessaryQuantity);
        } else if(!isAction && necessaryQuantity< 0) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(necessaryQuantity));

        }
    }

}
