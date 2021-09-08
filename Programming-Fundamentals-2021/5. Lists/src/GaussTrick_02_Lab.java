import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listOfIntegers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        for (int i = 0; i < listOfIntegers.size() - 1; i++) {
            listOfIntegers.set(i, listOfIntegers.get(i) + listOfIntegers.get(listOfIntegers.size() -1));
            listOfIntegers.remove(listOfIntegers.get(listOfIntegers.size() - 1));
        }
        for (Integer listOfInteger : listOfIntegers) {
            System.out.print(listOfInteger + " ");
        }
    }
}
