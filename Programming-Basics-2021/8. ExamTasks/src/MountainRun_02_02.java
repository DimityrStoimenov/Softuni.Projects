import java.util.Scanner;

public class MountainRun_02_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double recordInSeconds= Double.parseDouble(scan.nextLine());
        double distanceInMeters= Double.parseDouble(scan.nextLine());
        double timeInSecondsForClimbingOneMeter= Double.parseDouble(scan.nextLine());
        double timeForClimbingMountain= distanceInMeters *timeInSecondsForClimbingOneMeter;
        double lag = Math.floor(distanceInMeters / 50) * 30;
        double totalTime = timeForClimbingMountain + lag;
        if( totalTime < recordInSeconds){
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        }else if(totalTime >=recordInSeconds) {
            double diff= totalTime - recordInSeconds;
            System.out.printf("No! He was %.2f seconds slower.", diff);
        }
    }
}
