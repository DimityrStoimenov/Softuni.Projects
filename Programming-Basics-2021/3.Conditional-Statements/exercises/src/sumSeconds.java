import java.util.Scanner;

public class sumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // read input time1, time2, time3
        int time1 = Integer.parseInt(scan.nextLine());
        int time2 = Integer.parseInt(scan.nextLine());
        int time3 = Integer.parseInt(scan.nextLine());
        // sum = time1 + time2 + time3
        int sumSeconds = time1 + time2 + time3;
        // calculate minutes
        int minutes = sumSeconds / 60;
        int seconds = sumSeconds % 60;
        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
