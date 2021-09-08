import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords_SecondDecision_01_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> sequenceOfWords = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        Random random = new Random();
        while (sequenceOfWords.size() > 0) {
            String word = sequenceOfWords.remove(random.nextInt(sequenceOfWords.size()));
            System.out.println(word);
        }
    }
}
