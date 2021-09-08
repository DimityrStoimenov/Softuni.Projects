import java.util.Scanner;

public class LunchBreak_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameOfSerial= scan.nextLine();
        int episodeDuration= Integer.parseInt(scan.nextLine());
        int breakDuration= Integer.parseInt(scan.nextLine());
       double lunchDuration= breakDuration*1.0 /8;
        double rest = breakDuration * 1.0/4;
        double estimatedTime= breakDuration - lunchDuration-rest;
        if(estimatedTime<episodeDuration) {
            double requiredTime = Math.ceil(episodeDuration - estimatedTime);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",nameOfSerial,requiredTime);
        } else if(estimatedTime>= episodeDuration) {
            double leftTime= Math.ceil(estimatedTime - episodeDuration);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameOfSerial,leftTime);
        }

    }
}
