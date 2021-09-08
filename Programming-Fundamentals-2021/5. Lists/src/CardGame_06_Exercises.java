import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardGame_06_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> firstDeck = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondDeck = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        for (int i = 0; i <= firstDeck.size() - 1 ; i++) {
            for (int j = 0; j <= secondDeck.size() - 1 ; j++) {
                if (firstDeck.get(i) > secondDeck.get(j)) {
                    firstDeck.add(firstDeck.get(i));
                    firstDeck.remove(firstDeck.get(i));
                    firstDeck.add(secondDeck.get(j));
                    secondDeck.remove(secondDeck.get(j));
                    i--;
                    break;
                } else if (firstDeck.get(i) < secondDeck.get(j)) {
                    secondDeck.add(secondDeck.get(j));
                    secondDeck.remove(secondDeck.get(j));
                    secondDeck.add(firstDeck.get(i));
                    firstDeck.remove(firstDeck.get(i));
                    i--;
                    break;

                } else{
                    firstDeck.remove(firstDeck.get(i));
                    secondDeck.remove(secondDeck.get(j));
                    i--;
                    break;

                }

            }
            if(firstDeck.size() < 1) {
                break;
            } else if (secondDeck.size() < 1) {
                break;
            }
        }
        if (firstDeck.size() > 1) {
            int sum = 0;
            for (int i = 0; i <= firstDeck.size() - 1 ; i++) {
                sum += firstDeck.get(i);
            }
            System.out.printf("First player wins! Sum: %d%n", sum);
        } else if (secondDeck.size() > 1) {
            int result = 0;
            for (int i = 0; i <= secondDeck.size() - 1 ; i++) {
                result += secondDeck.get(i);
            }
            System.out.printf("Second player wins! Sum: %d%n", result);
        }
    }
}
