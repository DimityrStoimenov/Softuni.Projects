import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i <= list.size() - 1; i++) {
            if (list.get(i) < 0) {
                list.remove(list.get(i));
                i--;
            }
        }
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
