import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstGroupOfStudents = Integer.parseInt(scan.nextLine());
        int secondGroupOfStudents = Integer.parseInt(scan.nextLine());
        int thirdGroupOfStudents = Integer.parseInt(scan.nextLine());
        int employeeEfficiency = firstGroupOfStudents + secondGroupOfStudents + thirdGroupOfStudents;
        int totalCountOfStudents = Integer.parseInt(scan.nextLine());
        int day = 0;
        int hours = 0;
        while (totalCountOfStudents > 0) {
            hours ++;
            if (hours % 4 == 0) {
            continue;
            } else {
                if (totalCountOfStudents >= employeeEfficiency) {
                    totalCountOfStudents -= employeeEfficiency;
                } else {
                    totalCountOfStudents = 0;
                    break;
                }
            }

            if ( hours > 24) {
                day++;
                hours = hours - 24;
            }
        }
        System.out.printf("Time needed: %dh.", day * 24 + hours);
    }
}
