import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestThreeNumbers_05_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listOfIntegers = Arrays.stream(scan.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> largestThreeNumbers = listOfIntegers.stream().sorted(Comparator.reverseOrder())
                .limit(3).collect(Collectors.toList());
        for (int i = 0; i <= largestThreeNumbers.size() - 1 ; i++) {
            System.out.print(largestThreeNumbers.get(i));
            if ( i < largestThreeNumbers.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
