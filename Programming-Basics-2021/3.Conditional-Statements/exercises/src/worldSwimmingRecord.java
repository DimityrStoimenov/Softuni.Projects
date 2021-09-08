import java.util.Scanner;

public class worldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scan.nextLine());
        double distanceInMeters = Double.parseDouble(scan.nextLine());
        double timeInSecondsPerMeter = Double.parseDouble(scan.nextLine());
        double wholeDistanceInSeconds =(distanceInMeters * timeInSecondsPerMeter);
        double addedTime = Math.floor((distanceInMeters /15)) * 12.5;
        double totalTime =(wholeDistanceInSeconds + addedTime);
        if (recordInSeconds >totalTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);
        } else if (totalTime>= recordInSeconds) {
            double timeOverRecord = totalTime - recordInSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.",timeOverRecord);
        }
    }
}
