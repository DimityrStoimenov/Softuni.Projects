import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] sequenceOfIntegers = Arrays.stream(scan.nextLine().split("\\s+")).
                mapToInt(Integer::parseInt).toArray();
        int bestLength  = 0;
        int sequence = 1;
        int index = 0;
        for (int i = 0; i < sequenceOfIntegers.length - 1; i++) {
            if(sequenceOfIntegers[i] == sequenceOfIntegers[i+1]) {
                sequence += 1;
            } else {
                sequence = 1;
            }
            if(sequence > bestLength ) {
                bestLength = sequence;
                index = sequenceOfIntegers[i];
            }

        }
        for (int i = 0; i < bestLength ; i++) {
            System.out.print(index + " ");
        }
    }
}
