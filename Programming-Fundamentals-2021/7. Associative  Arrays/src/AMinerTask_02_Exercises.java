import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, Integer> resources  = new LinkedHashMap<>();
         String input = scan.nextLine();
         while (!input.equals("stop")) {
             String ore = input;
             int valueOfOre = Integer.parseInt(scan.nextLine());
             if(!resources.containsKey(ore)){
                 resources.put(ore,valueOfOre);

             } else {
                 resources.put(ore,resources.get(ore)  + valueOfOre);
             }
             input = scan.nextLine();
         }
        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(),entry.getValue());
        }
    }
}
