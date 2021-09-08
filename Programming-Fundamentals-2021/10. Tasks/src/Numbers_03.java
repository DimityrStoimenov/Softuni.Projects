import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listOfIntegers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> numbersGreaterThanAverage = listOfIntegers.stream().filter(e -> e > listOfIntegers
        .stream().mapToDouble(Integer::doubleValue).average().orElse(0.00)).sorted(Comparator.reverseOrder())
        .limit(5).collect(Collectors.toList());
        if (numbersGreaterThanAverage.isEmpty()) {
            System.out.print("No");
        } else {
            System.out.println(Arrays.toString(new List[] {numbersGreaterThanAverage}).
                    replaceAll("[\\[\\]]","").replaceAll(", ", " "));
        }
    }
}
