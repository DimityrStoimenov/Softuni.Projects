
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_04_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, Double> products = new LinkedHashMap<>();
        LinkedHashMap<String, Integer>  quantity = new LinkedHashMap<>();
        String input = scan.nextLine();
        while (!input.equals("buy")) {
            String [] tokens = input.split("\\s+");
            String nameOfProduct = tokens[0];
            double prizeOfProduct = Double.parseDouble(tokens[1]);
            int quantityOfProduct = Integer.parseInt(tokens[2]);
            if (!products.containsKey(nameOfProduct)) {
                products.put(nameOfProduct, prizeOfProduct * quantityOfProduct);
                quantity.put(nameOfProduct,quantityOfProduct);
            } else {
             quantity.put(nameOfProduct,quantity.get(nameOfProduct) + quantityOfProduct);
             products.put(nameOfProduct,quantity.get(nameOfProduct) * prizeOfProduct);
            }
            input = scan.nextLine();
        }
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(),entry.getValue());
        }
    }
}
