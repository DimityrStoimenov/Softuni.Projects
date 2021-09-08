import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming_03_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap<String,Integer> keyMaterials = new TreeMap<>();
        TreeMap<String,Integer> junkMaterials = new TreeMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);
        String winner = " ";
        while (winner.equals(" ")) {
            String[] databaseOfMinerals = scan.nextLine().toLowerCase().split("\\s+");
            for (int i = 0; i <= databaseOfMinerals.length - 1; i++) {
                String currentOre = databaseOfMinerals[i];
                if (i % 2 == 0) {
                    continue;
                }
                if (currentOre.equals("shards") || currentOre.equals("fragments") || currentOre.equals("motes")) {
                    keyMaterials.put(currentOre, keyMaterials.get(currentOre)
                            + Integer.parseInt(databaseOfMinerals[i - 1]));
                    winner = determineTheWinner(currentOre, winner, keyMaterials);
                    if (!winner.equals(" ")) {
                        recalculateMaterialOfWinner(currentOre, keyMaterials);
                        break;
                    }
                } else {
                    if (!junkMaterials.containsKey(currentOre)) {
                        junkMaterials.put(currentOre, Integer.parseInt(databaseOfMinerals[i - 1]));
                    } else {
                        junkMaterials.put(currentOre, junkMaterials.get(currentOre) +
                                Integer.parseInt(databaseOfMinerals[i - 1]));
                    }
                }
            }
        }
            System.out.printf("%s obtained!%n", winner);
            keyMaterials
                    .entrySet()
                    .stream()
                    .sorted(Map.Entry.<String,Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                    .forEach(e -> System.out.printf("%s: %d%n", e.getKey(),e.getValue()));
            junkMaterials
                    .entrySet()
                    .stream()
                    .sorted(Map.Entry.<String,Integer>comparingByKey())
                    .forEach(e -> System.out.printf("%s: %d%n", e.getKey(),e.getValue()));

    }

    private static void recalculateMaterialOfWinner(String currentOre, TreeMap<String, Integer> keyMaterials) {
            int currentValue = keyMaterials.get(currentOre) - 250;
            keyMaterials.put(currentOre,currentValue);
    }

    private static String determineTheWinner(String currentOre, String winner,
                                             TreeMap<String, Integer> keyMaterials) {
        if(keyMaterials.get(currentOre) >= 250) {
            switch(currentOre) {
                case "shards": winner = "Shadowmourne";
                break;
                case "fragments": winner = "Valanyr";
                    break;
                case "motes": winner = "Dragonwrath";
                    break;
            }
        }
        return winner;
    }
}
