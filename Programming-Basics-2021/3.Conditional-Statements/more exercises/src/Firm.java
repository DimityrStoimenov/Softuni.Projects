import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = Integer.parseInt(scan.nextLine()); // необходимите часове
        int D = Integer.parseInt(scan.nextLine()); // необходимите дни
        int N = Integer.parseInt(scan.nextLine()); // брой служители, работещи извънредно

        double daysFotTheProject = D - (D * 0.1);
        double workingHours = daysFotTheProject *8;
        double overtimeHours = D * 2 * N;
        double totalHours = Math.floor(workingHours + overtimeHours);

        if (H <= totalHours) {
            double leftHours = totalHours - H;
            System.out.printf("Yes!%.0f hours left.",leftHours);
        } else if(H>= totalHours) {
            double neededHours = H - totalHours;
            System.out.printf("Not enough time!%.0f hours needed.", neededHours);
        }
    }
}
