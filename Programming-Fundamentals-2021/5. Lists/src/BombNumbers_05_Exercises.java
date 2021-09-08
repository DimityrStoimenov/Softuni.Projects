import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> sequenceOfNumbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String [] numbers = scan.nextLine().split("\\s+");
        int bombNumber = Integer.parseInt(numbers[0]);
        int power = Integer.parseInt(numbers[1]);
        while (sequenceOfNumbers.contains(bombNumber)) {
            int indexOfBombNumber = sequenceOfNumbers.indexOf(bombNumber);
            if (indexOfBombNumber >= 0 && indexOfBombNumber <= sequenceOfNumbers.size() - 1) {
                int leftBound = Math.max(indexOfBombNumber - power, 0);
                int rightBound = Math.min(indexOfBombNumber + power, sequenceOfNumbers.size() - 1);
                for (int i = rightBound; i >= leftBound; i--) {
                    sequenceOfNumbers.remove(i);
                }
            }
        }
        int sum = 0;
        for (Integer sequenceOfNumber : sequenceOfNumbers) {
            sum += sequenceOfNumber;
        }
        System.out.println(sum);
    }
}
