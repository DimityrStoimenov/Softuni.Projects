import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts_06_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<String> listOfProducts = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            String product = scan.nextLine();
            listOfProducts.add(product);
        }
        Collections.sort(listOfProducts);
        for (int i = 0; i <= listOfProducts.size() -1 ; i++) {
            System.out.printf("%d.%s%n", i + 1, listOfProducts.get(i));

        }
    }
}
