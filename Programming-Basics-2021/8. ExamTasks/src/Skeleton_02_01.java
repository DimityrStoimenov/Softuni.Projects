import java.util.Scanner;

public class Skeleton_02_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minutesOfPassCheck = Integer.parseInt(scan.nextLine());
        int secondsOfPassCheck = Integer.parseInt(scan.nextLine());
        double lengthOfRunwayInMeters= Double.parseDouble(scan.nextLine());
        int secondsForPassingAHundredMeters = Integer.parseInt(scan.nextLine());
        int totalTime = (minutesOfPassCheck * 60) + secondsOfPassCheck;
        double timesReduction= lengthOfRunwayInMeters / 120;
        double totalReduction = timesReduction * 2.5;
        double totalTimeToPassAllDistance = (lengthOfRunwayInMeters / 100) * secondsForPassingAHundredMeters -totalReduction;
        if(totalTimeToPassAllDistance <= totalTime ) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.",totalTimeToPassAllDistance);
        } else {
            double neededTime = totalTimeToPassAllDistance - totalTime;
            System.out.printf("No, Marin failed! He was %.3f second slower.",neededTime);
        }

    }
}
