import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentNumbers_DecisionDimo_01_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 3 3 6 1 -> 6 6 1 -> 12 1 - проверяваме дали i и i + 1 са равни, ако са равни ги събираме
        List<Double> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Double::parseDouble)
                .collect(Collectors.toList());
        for (int i = 0; i < numbers.size() - 1; i++) {
            if(numbers.get(i).equals(numbers.get(i + 1))) {
                double sum = numbers.get(i) + numbers.get( i + 1);
                numbers.set(i, sum);
                numbers.remove(i + 1);
                i = -1;
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.######");
        for (Double number : numbers) {
            System.out.print(decimalFormat.format(number) + " ");
        }

    }
}
