import java.util.Scanner;

public class HappyCatParking_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfDays= Integer.parseInt(scan.nextLine());
        int numberOfHoursForEachDay= Integer.parseInt(scan.nextLine());
        double total =0.0;
        double tax=0.0;
        int day=0;
        for (int i = 1; i <= numberOfDays; i++) {
            for (int j = 1; j <= numberOfHoursForEachDay; j++) {
                if( i % 2 !=0 && j %2 == 0) {
                  tax+= 1.25;
                } else if(  i % 2 ==0 && j %2 !=0) {
                    tax+= 2.50;
                } else {
                    tax+= 1.0;
                }

            }
            day++;
            System.out.printf("Day: %d - %.2f leva%n", day, tax);
            total+=tax;
            tax = 0;

        }
        System.out.printf("Total: %.2f leva", total);
    }
}
