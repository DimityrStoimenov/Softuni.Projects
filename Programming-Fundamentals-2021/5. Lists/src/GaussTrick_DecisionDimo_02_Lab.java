import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_DecisionDimo_02_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listOfIntegers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        // 10 11 12 13 14 15(size = 6) ->  size / 2 = 3 -> (1.(10 +15); 2.(11+14)
        // 3.(12+13))
        int halfSize = listOfIntegers.size() /2;
        for (int i = 0; i < halfSize; i++) {
            int sum = listOfIntegers.get(i) + listOfIntegers.get(i +1);
            listOfIntegers.remove( listOfIntegers.size() - 1);
        }
        for (Integer listOfInteger : listOfIntegers) {
            System.out.print(listOfInteger + " ");
        }
    }
}
