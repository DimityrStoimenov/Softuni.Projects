import java.util.*;
import java.util.stream.Collectors;

public class Pirates_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, Integer> targetTowns = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> wealthCity = new LinkedHashMap<>();
        String input = scan.nextLine();
        int getValueOfPopulation;
        int getValueOfGold;
        boolean isPopulation = false;
        boolean isGold = false;
        while (!input.equals("Sail")) {
            String[] databaseOfTowns = input.split("\\|\\|");
            String town = databaseOfTowns[0];
            int townPopulation = Integer.parseInt(databaseOfTowns[1]);
            int goldOfTown = Integer.parseInt(databaseOfTowns[2]);
            if (!targetTowns.containsKey(town) && !wealthCity.containsKey(town)) {
                targetTowns.put(town, townPopulation);
                wealthCity.put(town, goldOfTown);
            } else {
                targetTowns.put(town, targetTowns.get(town) + townPopulation);
                wealthCity.put(town, wealthCity.get(town) + goldOfTown);
            }
            input = scan.nextLine();
        }
        input = scan.nextLine();

        while (!input.equals("End")) {
            String[] attackedTown = input.split("=>");
            String command = attackedTown[0];
            if (command.equals("Plunder")) {
                String town = attackedTown[1];
                int population = Integer.parseInt(attackedTown[2]);
                int gold = Integer.parseInt(attackedTown[3]);
                for (Map.Entry<String, Integer> entry : targetTowns.entrySet()) {
                    String getTown = entry.getKey();
                    if (getTown.equals(town)) {
                        targetTowns.put(entry.getKey(), targetTowns.get(entry.getKey()) - population);
                        getValueOfPopulation = targetTowns.get(entry.getKey());
                        if (getValueOfPopulation <= 0) {
                            isPopulation = false;
                            break;
                        } else {
                            isPopulation = true;
                            break;
                        }
                    }
                }
                for (Map.Entry<String, Integer> entry : wealthCity.entrySet()) {
                    String getCity = entry.getKey();
                    if (getCity.equals(town)) {
                        wealthCity.put(entry.getKey(), wealthCity.get(entry.getKey()) - gold);
                        getValueOfGold = wealthCity.get(entry.getKey());
                        if (getValueOfGold <= 0) {
                            isGold = false;
                            break;
                        } else {
                            isGold = true;
                            break;
                        }
                    }
                }
                if (isPopulation && isGold) {
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, population);
                } else {
                    targetTowns.remove(town);
                    wealthCity.remove(town);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, population);
                    System.out.printf("%s has been wiped off the map!%n", town);
                }

            }
            if (command.equals("Prosper")) {
                String city = attackedTown[1];
                int treasure = Integer.parseInt(attackedTown[2]);
                if (treasure <= 0) {
                    System.out.println("Gold added cannot be a negative number!");
                } else {
                    for (Map.Entry<String, Integer> entry : wealthCity.entrySet()) {
                        String town = entry.getKey();
                        if (town.equals(city)) {
                            wealthCity.put(city, wealthCity.get(city) + treasure);
                            System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                    treasure, city, wealthCity.get(city));
                        }
                    }
                }
            }
            input = scan.nextLine();
        }
        TreeMap<String, List<Integer>> wealthySettlements = new TreeMap<>();
        if (targetTowns.size() > 0 && wealthCity.size() > 0) {
            int counter = 0;
            for (Map.Entry<String, Integer> entry : targetTowns.entrySet()) {
                String survivingCity = entry.getKey();
                int survivingPopulation = entry.getValue();
                wealthySettlements.putIfAbsent(survivingCity, new ArrayList<>());
                wealthySettlements.get(survivingCity).add(survivingPopulation);
                for (Map.Entry<String, Integer> entryOne : wealthCity.entrySet()) {
                    String wealth = entryOne.getKey();
                    int remainingGold = entryOne.getValue();
                    if (wealth.equals(survivingCity)) {
                        wealthySettlements.get(wealth).add(remainingGold);
                    }
                }
                counter++;
            }
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", counter);
           wealthySettlements.entrySet().stream().sorted((a,b) -> {
               int result = b.getValue().get(1) - a.getValue().get(1);
               if (result == 0) {
                   return a.getKey().compareTo(b.getKey());
               }
               return result;
           }).forEach(e -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                   e.getKey(),e.getValue().get(0), e.getValue().get(1)));



        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
