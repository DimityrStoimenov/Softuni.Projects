import java.util.Arrays;
import java.util.Scanner;

public class TheLift_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int peopleInQueue = Integer.parseInt(scan.nextLine());
        int [] cabins = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < cabins.length ; i++) {
            int peopleInCabin = cabins[i];
            int freeSpaceInCabin = 4 - peopleInCabin;
            if (cabins[i] == 4) {
                continue;
            }
            if (freeSpaceInCabin >= peopleInQueue) {
                cabins[i] = cabins[i] + peopleInQueue;
                peopleInQueue = 0;
                break;
            }
            cabins[i] = 4;
            peopleInQueue = peopleInQueue - freeSpaceInCabin;
        }
        boolean isEmptySpots = false;
        for (int cabin : cabins) {
            if(cabin < 4) {
                isEmptySpots = true;
                break;
            }
        }
        if (isEmptySpots) {
            System.out.println("The lift has empty spots!");
        } else if (!isEmptySpots && peopleInQueue != 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n",peopleInQueue);
        }
       Arrays.stream(cabins).forEach(e -> System.out.print( e + " "));
    }
}
