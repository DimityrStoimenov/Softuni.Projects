import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> sequence = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        int counter = 0;
        String userInput = scan.nextLine();
        while (!userInput.equals("end")) {
            int [] indexes = Arrays.stream(userInput.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int firstIndex = indexes[0];
            int secondIndex = indexes[1];
            counter++;
            if(ismakeAttemptsToCheatingInGame(firstIndex,secondIndex,sequence)) {
                System.out.println("Invalid input! Adding additional elements to the board");
                String penaltyNumber = String.format("-%da", counter);
                userInput = scan.nextLine();
                sequence.add(sequence.size()/ 2,penaltyNumber);
                sequence.add(sequence.size()/ 2,penaltyNumber);
                continue;
            }
            String firstElement = sequence.get(firstIndex);
            String secondElement = sequence.get(secondIndex);
            if (firstElement.equals(secondElement)) {
                sequence.remove(firstElement);
                sequence.remove(secondElement);
                System.out.printf("Congrats! You have found matching elements - %s!%n", firstElement);
            } else {
                System.out.println("Try again!");
            }
            if ( sequence.size() == 0) {
                break;
            }
            userInput = scan.nextLine();
        }
        if (sequence.isEmpty()) {
            System.out.printf("You have won in %d turns!%n",counter);
        } else {
            System.out.println("Sorry you lose :(");
            System.out.print(String.join(" ", sequence));
        }

    }

    private static boolean ismakeAttemptsToCheatingInGame(int firstIndex, int secondIndex, List<String> sequence) {
        if(firstIndex == secondIndex) {
            return true;
        }
        if ( firstIndex < 0 || firstIndex >= sequence.size()) {
            return true;
        }
        if ( secondIndex < 0 || secondIndex >= sequence.size()) {
            return true;
        }
        return false;
    }
}
