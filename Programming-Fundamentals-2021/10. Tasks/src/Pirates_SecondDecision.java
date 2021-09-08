import java.util.LinkedHashMap;
import java.util.Scanner;

public class Pirates_SecondDecision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, int[]> wealthyTowns = new LinkedHashMap<>();
        String input = scan.nextLine();
        while (!input.equals("Sail")) {
            String[] tokens = input.split("\\|\\|");
            wealthyTowns.putIfAbsent(tokens[0], new int[2]);
            wealthyTowns.get(tokens[0])[0] += Integer.parseInt(tokens[1]);
            wealthyTowns.get(tokens[0])[1] += Integer.parseInt(tokens[2]);
            input = scan.nextLine();
        }
        input = scan.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("=>");
            String command = tokens[0];
            switch (command) {
                case "Plunder":
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", tokens[1],
                            Integer.parseInt(tokens[3]), Integer.parseInt(tokens[2]));
                    wealthyTowns.get(tokens[1])[0] -= Integer.parseInt(tokens[2]);
                    wealthyTowns.get(tokens[1])[1] -= Integer.parseInt(tokens[3]);
                    if (wealthyTowns.get(tokens[1])[0] == 0 || wealthyTowns.get(tokens[1])[1] == 0) {
                        wealthyTowns.remove(tokens[1]);
                        System.out.printf("%s has been wiped off the map!%n", tokens[1]);
                    }
                    break;
                case "Prosper":
                    if (Integer.parseInt(tokens[2]) < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        wealthyTowns.get(tokens[1])[1] += Integer.parseInt(tokens[2]);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                Integer.parseInt(tokens[2]), tokens[1], wealthyTowns.get(tokens[1])[1]);
                    }
                    break;
            }
            input = scan.nextLine();
        }
        if(wealthyTowns.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", wealthyTowns.size());
            wealthyTowns.entrySet().stream().sorted((a,b) -> {
                int result = b.getValue()[1] - a.getValue()[1];
                if (result == 0) {
                    return a.getKey().compareTo(b.getKey());
                } return result;
                    }).forEach(e -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                            e.getKey(), e.getValue()[0], e.getValue()[1]));
        }
    }
}

