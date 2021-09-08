import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> minerals = Arrays.stream(scan.nextLine().split(",\\s+")).collect(Collectors.toList());
        String input = scan.nextLine();
        while (!input.equals("Craft!")) {
            String [] tokens = input.split(" - ");
            String command = tokens[0];
            switch (command) {
                case "Collect":
                    String ore = tokens[1];
                    if (!minerals.contains(ore)) {
                        minerals.add(ore);
                    }
                    break;
                case "Drop":
                    String element = tokens[1];
                    if (minerals.contains(element)) {
                        minerals.remove(element);
                    }
                    break;
                case "Combine Items":
                    String [] combine = tokens[1].split(":");
                    String oldItem = combine[0];
                    String newItem = combine[1];
                    int indexOfOldItem = minerals.indexOf(oldItem) + 1;
                    if (minerals.contains(oldItem)) {
                        minerals.add(indexOfOldItem, newItem);
                    }
                    break;
                case "Renew":
                    String mineral = tokens[1];
                    if(minerals.contains(mineral)) {
                        minerals.remove(mineral);
                        minerals.add(mineral);
                    }
                    break;
            }
            input = scan.nextLine();
        }
        System.out.println(String.join(", ", minerals));
    }
}
