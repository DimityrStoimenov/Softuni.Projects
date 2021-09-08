import java.util.Scanner;

public class Scholarship_08_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double incomeInBGN = Double.parseDouble(scan.nextLine()); // доход в лева
        double averageSuccess = Double.parseDouble(scan.nextLine()); // среден успех
        double minimalSalary = Double.parseDouble(scan.nextLine()); // минимална работна заплата
        double socialScholarship = Math.floor(minimalSalary * 0.35);
        double scholarshipForExcellentResult = Math.floor(averageSuccess * 25);
        if (incomeInBGN <= minimalSalary) {
            if (averageSuccess <= 4.5) {
                System.out.println("You cannot get a scholarship!");
            } else if (averageSuccess > 4.50 && averageSuccess < 5.50) {
                System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
            }
        }
        if (incomeInBGN <= minimalSalary) {
            if (averageSuccess >= 5.50) {
                if (scholarshipForExcellentResult <= socialScholarship) {
                    System.out.printf("You get a Social scholarship %.0f BGN",socialScholarship);
                } else if (scholarshipForExcellentResult > socialScholarship) {
                    System.out.printf("You get a scholarship for excellent results %.0f BGN", scholarshipForExcellentResult);
                }
            }
        }
        if (incomeInBGN > minimalSalary) {
            if (averageSuccess < 5.50) {
                System.out.println("You cannot get a scholarship!");
            } else if (averageSuccess >= 5.50) {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", scholarshipForExcellentResult);
            }
        }
    }
}














