import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String,Integer> resources = new LinkedHashMap<>();
        String input = scan.nextLine();
        while(!input.equals("stop")) {
            int quantity = Integer.parseInt(scan.nextLine());
            if(!resources.containsKey(input)) {
                resources.put(input,quantity);
            } else {
                resources.put(input, resources.get(input) + quantity);
            }
            input = scan.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(),entry.getValue());
        }
    }
}
