
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Map<String, Double>> shops = new TreeMap<>();
        String input = scan.nextLine();
        while (!input.equals("Revision")) {
            String[] tokens = input.split(",\\s+");
            String name = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);
            if (!shops.containsKey(name)) {
                shops.putIfAbsent(name, new LinkedHashMap<>());
                shops.get(name).put(product, price);
            } else if (shops.containsKey(name)) {
                shops.get(name).put(product, price);
            }
            input = scan.nextLine();
        }
        for (Map.Entry<String, Map<String, Double>> entry : shops.entrySet()) {
          String name = entry.getKey();
          System.out.printf("%s->%n", name);
            entry.getValue().entrySet().forEach(e -> {
                System.out.print("Product: ");
                System.out.printf("%s, Price: %.1f%n", e.getKey(),e.getValue());
            });

        }
    }
}
