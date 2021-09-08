import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers_01_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double>  sequence = Arrays.stream(scan.nextLine().split("\\s+")).map(Double::parseDouble)
                .collect(Collectors.toList());
        for (int i = 0; i < sequence.size() - 1 ; i++) {
            if(sequence.get(i).equals(sequence.get(i+1))) {
                sequence.set(i, sequence.get(i) + sequence.get(i + 1));
                sequence.remove(sequence.get(i + 1));
                i = -1;
            }

        }
        DecimalFormat decimalFormat = new DecimalFormat("0.##########");
        for (Double element : sequence) {
            System.out.print(decimalFormat.format(element) + " ");
        }
    }
}
