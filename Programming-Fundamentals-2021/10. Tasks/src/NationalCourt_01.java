import java.util.Scanner;

public class NationalCourt_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstGroupOfCustomers = Integer.parseInt(scan.nextLine());
        int secondGroupOfCustomers = Integer.parseInt(scan.nextLine());
        int thirdGroupOfCustomers = Integer.parseInt(scan.nextLine());
        int employeeEfficiency = firstGroupOfCustomers + secondGroupOfCustomers + thirdGroupOfCustomers;
        int totalCountOfCustomers = Integer.parseInt(scan.nextLine());
        int day = 0;
        int hours = 0;
        while (totalCountOfCustomers > 0) {
            hours++;
            if (hours % 4 == 0) {

            } else {
                if (totalCountOfCustomers >= employeeEfficiency) {
                    totalCountOfCustomers -= employeeEfficiency;

                } else {
                    totalCountOfCustomers = 0;
                    break;
                }
            }
            if (day > 24) {
                day ++;
                hours = hours - 24;
            }
        }
        System.out.printf("Time needed: %dh.", day * 24 + hours);
    }
}
