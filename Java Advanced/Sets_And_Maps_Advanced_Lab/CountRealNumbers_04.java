import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double [] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double, Integer> sequence = new LinkedHashMap<>();
        for (double number : numbers) {
            if(!sequence.containsKey(number)) {
               sequence.put(number,1);
            } else {
                sequence.put(number, sequence.get(number) + 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : sequence.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(),entry.getValue());
        }
    }
}
