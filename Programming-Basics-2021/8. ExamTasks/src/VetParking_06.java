import java.util.Scanner;
public class VetParking_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfDays = Integer.parseInt(scan.nextLine());
        int numberOfHoursForEachDay = Integer.parseInt(scan.nextLine());
        double tax =0;
        double totalTax=0;
        for (int i = 1; i <=numberOfDays; i++) {
            for (int j = 1; j <=numberOfHoursForEachDay; j++) {
                if(i % 2 == 0 && j % 2 ==1) {
                    tax += 2.50;
                } else if(i % 2 == 1 && j % 2 ==0) {
                    tax += 1.25;
                } else {
                    tax += 1.00;
                }
                
            }
            System.out.printf("Day: %d - %.2f leva%n", i,tax);
            totalTax+= tax;
            tax=0;
        }
        System.out.printf("Total: %.2f leva",totalTax);
    }
}
