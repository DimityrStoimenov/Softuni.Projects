import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_SecondDecision_07_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        list.removeIf(e -> e < 0);
        Collections.reverse(list);
        if (list.isEmpty()) {
            System.out.print("empty");
        } else {
            for (Integer element : list) {
                System.out.print(element + " ");
            }
        }
    }
}
