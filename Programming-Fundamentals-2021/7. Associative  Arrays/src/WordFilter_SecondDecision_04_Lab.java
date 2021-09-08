import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter_SecondDecision_04_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> listOfProducts = Arrays.stream(scan.nextLine().split("\\s+")).
                filter(e -> e.length() % 2 == 0).collect(Collectors.toList());
        for (String listOfProduct : listOfProducts) {
            System.out.println(listOfProduct);
        }
    }
}

