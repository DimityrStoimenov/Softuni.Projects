
import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers_01_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> listOfRealNumbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Double::parseDouble)
                .collect(Collectors.toList());
        TreeMap<Double, Integer> countRealNumbers = new TreeMap<>();
        for (int i = 0; i <= listOfRealNumbers.size() - 1 ; i++) {
            double currentNumber = listOfRealNumbers.get(i);
            if (!countRealNumbers.containsKey(currentNumber)) {
                countRealNumbers.put(currentNumber, 1);
            } else {
                countRealNumbers.put(currentNumber, countRealNumbers.get(currentNumber) + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : countRealNumbers.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(),entry.getValue());
        }
    }
}
