import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter_04_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> listOfProducts = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        for (int i = 0; i <= listOfProducts.size() - 1 ; i++) {
            String currentProduct = listOfProducts.get(i);
            if (currentProduct.length() % 2 == 1) {
                listOfProducts.remove(listOfProducts.get(i));
                i--;
            }
        }
        for (String listOfProduct : listOfProducts) {
            System.out.println(listOfProduct);
        }
    }
}
