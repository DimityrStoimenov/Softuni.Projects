import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> listOfProducts = Arrays.stream(scan.nextLine().split("!")).collect(Collectors.toList());
        String input = scan.nextLine();
        while (!input.equals("Go Shopping!")) {
            String [] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Urgent":
                    if(!listOfProducts.contains(tokens[1])) {
                        listOfProducts.add(0, tokens[1]);
                    }
                    break;
                case "Unnecessary":
                    if (listOfProducts.contains(tokens[1])) {
                        listOfProducts.remove(tokens[1]);
                    }
                    break;
                case "Correct":
                    String oldItem = tokens[1];
                    String newItem = tokens[2];
                    int indexOfOldItem = listOfProducts.indexOf(oldItem);
                    if (listOfProducts.contains(oldItem)) {
                        listOfProducts.set(indexOfOldItem, newItem);
                    }
                    break;
                case "Rearrange":
                    String grocery = tokens[1];
                    if (listOfProducts.contains(grocery)) {
                        listOfProducts.remove(grocery);
                        listOfProducts.add(grocery);
                    }
                    break;
            }
            input = scan.nextLine();
        }
        System.out.println(String.join(", ", listOfProducts));
    }
}
