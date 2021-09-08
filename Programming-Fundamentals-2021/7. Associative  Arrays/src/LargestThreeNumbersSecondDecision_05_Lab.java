import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;


public class LargestThreeNumbersSecondDecision_05_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String largeThreeNumbers = Arrays.stream(scan.nextLine().split("\\s+")).map(n -> Integer.parseInt(n))
                .sorted((a,b) -> b.compareTo(a)).limit(3).map( n-> n.toString()).
                collect(Collectors.joining(" "));
        System.out.print(largeThreeNumbers);
    }
}
