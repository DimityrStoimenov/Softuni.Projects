import java.util.*;

public class PiratesThirdDecisionWithObjects_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Pirate> pirates = new TreeMap<>();
        String input = scan.nextLine();
        while (!input.equals("Sail")) {
            String[] tokens = input.split("\\|\\|");
            String town = tokens[0];
            int people = Integer.parseInt(tokens[1]);
            int treasure = Integer.parseInt(tokens[2]);
            if (!pirates.containsKey(town)) {
                Pirate newPirate = new Pirate(people, treasure);
                pirates.put(town, newPirate);
            } else {
                pirates.get(town).setPopulation(pirates.get(town).getPopulation() + people);
                pirates.get(town).setGold(pirates.get(town).getGold() + treasure);
            }

            input = scan.nextLine();
        }
        input = scan.nextLine();
        while (!input.equals("End")) {
            //•	"Plunder=>{town}=>{people}=>{gold}"
            //•	"Prosper=>{town}=>{gold}"
            String [] tokens = input.split("=>");
            String command = tokens[0];
            String town = tokens[1];
            switch (command) {
                case "Plunder":
                    int people = Integer.parseInt(tokens[2]);
                    int gold = Integer.parseInt(tokens[3]);
                    int currentPopulation = pirates.get(town).getPopulation() - people ;
                    int currentGold = pirates.get(town).getGold() - gold;
                    if (currentPopulation <= 0 || currentGold <= 0) {
                        pirates.remove(town);
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",
                                town, gold, people);
                        System.out.printf("%s has been wiped off the map!%n", town);
                    } else {
                        pirates.get(town).setPopulation(currentPopulation);
                        pirates.get(town).setGold(currentGold);
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",
                                town, gold, people);
                    }
                    break;
                case "Prosper":
                    int treasure = Integer.parseInt(tokens[2]);
                    if (treasure < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        int addedGold = pirates.get(town).getGold() + treasure;
                        pirates.get(town).setGold(addedGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                treasure,town,addedGold);
                    }
                    break;
            }

            input = scan.nextLine();
        }
        if (pirates.size() > 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", pirates.size());
            pirates.entrySet().stream().sorted((a,b) ->{
                int result = Integer.compare(b.getValue().getGold(),a.getValue().getGold());
                if (result == 0) {
                    result = a.getKey().compareTo(b.getKey());
                }
                return result;
            }).forEach(entry -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                    entry.getKey(),entry.getValue().getPopulation(),entry.getValue().getGold()));

        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}

class Pirate {
    private int population;
    private int gold;

    public int getPopulation() {
        return population;
    }

    public int getGold() {
        return gold;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public Pirate(int population, int gold) {
        this.population = population;
        this.gold = gold;
    }

}
