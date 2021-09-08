import java.util.Scanner;

public class Grades_02_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        correspondingGrade(Double.parseDouble(scan.nextLine()));
    }

    private static void correspondingGrade(double grade) {
        if (grade >= 2.00 && grade <= 2.99) {
            System.out.print("Fail");
        } else if (grade >= 3.00 && grade <= 3.49) {
            System.out.print("Poor");
        } else if (grade >= 3.50 && grade <= 4.49) {
            System.out.print("Good");
        } else if (grade >= 4.50 && grade <= 5.49) {
            System.out.print("Very good");
        } else if (grade >= 5.50 && grade <= 6.00) {
            System.out.print("Excellent");
        }
    }
}
