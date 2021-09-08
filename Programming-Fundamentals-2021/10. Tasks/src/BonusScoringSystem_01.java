import java.util.Scanner;

public class BonusScoringSystem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfTheStudents = Integer.parseInt(scan.nextLine());
        int countOfTheLectures = Integer.parseInt(scan.nextLine());
        int initialBonus = Integer.parseInt(scan.nextLine());
        double maxBonus = Double.MIN_VALUE;
        double totalBonus;
        int winnersStudentAttendances = 0;
        for (int i = 0; i < countOfTheStudents ; i++) {
            int studentAttendances = Integer.parseInt(scan.nextLine());
             totalBonus = (studentAttendances * 1.0 / countOfTheLectures) * (5 + initialBonus);
             if (totalBonus > maxBonus) {
                 maxBonus = totalBonus;
                 winnersStudentAttendances = studentAttendances;
             }
        }
        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", winnersStudentAttendances);

    }
}
