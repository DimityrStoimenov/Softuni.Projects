import java.util.Arrays;
import java.util.Scanner;

public class CarRace_02_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] carRaceTrack = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();
        double totalTimeLeftRace = calculateTimeLeftRace(carRaceTrack);
        double totalTimeRightRace = calculateTimeRightRace(carRaceTrack);
        if ( totalTimeLeftRace > totalTimeRightRace) {
            System.out.printf("The winner is right with total time: %.1f", totalTimeRightRace);
        } else {
            System.out.printf("The winner is left with total time: %.1f", totalTimeLeftRace);
        }
    }

    private static double calculateTimeRightRace(int[] carRaceTrack) {
        double totalTimeRightRace = 0;
        for (int i = carRaceTrack.length - 1; i > carRaceTrack.length / 2 ; i --) {
            int currentElement = carRaceTrack[i];
            if (currentElement != 0) {
                totalTimeRightRace += carRaceTrack[i];
            } else {
                totalTimeRightRace *= 0.8;
            }

        }
        return totalTimeRightRace;
    }

    private static double calculateTimeLeftRace(int[] carRaceTrack) {
        double totalResultOfLeftRace = 0;
        for (int i = 0; i < carRaceTrack.length / 2; i++) {
            int currentElement = carRaceTrack[i];
            if (currentElement != 0) {
                totalResultOfLeftRace += carRaceTrack[i];
            } else {
                totalResultOfLeftRace *= 0.8;
            }
        }
        return totalResultOfLeftRace;
    }
}
