import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] neighbourHood = Arrays.stream(scan.nextLine().split("@")).mapToInt(Integer::parseInt)
                .toArray();
        String input = scan.nextLine();
        int currentIndex = 0;
        while (!input.equals("Love!")) {
            String [] tokens = input.split("\\s+");
            if(tokens[0].equals("Jump")) {
            int index = Integer.parseInt(tokens[1]);
            currentIndex += index;
            if (currentIndex < 0 || currentIndex > neighbourHood.length - 1) {
                currentIndex = 0;

            }
            if(neighbourHood[currentIndex] == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
            } else {
                    neighbourHood[currentIndex] -= 2;
                    if (neighbourHood[currentIndex] == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                    }
                }
            }
            input = scan.nextLine();
        }
        boolean isMissionPossible = true;
        for (int cupidHome : neighbourHood) {
            if(cupidHome != 0) {
                isMissionPossible = false;
                break;
            }

        }
        int cupidFailedCounter = 0;
        for (int cupidHome : neighbourHood) {
            if(cupidHome != 0) {
                cupidFailedCounter++;
            }
        }
        System.out.printf("Cupid's last position was %d.%n", currentIndex);
        if (isMissionPossible) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.%n", cupidFailedCounter);
        }
    }
}
