import java.util.*;
import java.util.stream.Collectors;

public class CitiesByContinentAndCountry_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Map<String, List<String>>> databaseOfCountries = new LinkedHashMap<>();
        int counter = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < counter; i++) {
            String[] database = scan.nextLine().split("\\s+");
            String continent = database[0];
            String country = database[1];
            String city = database[2];
            if (!databaseOfCountries.containsKey(continent)) {
                databaseOfCountries.put(continent, new LinkedHashMap<>());
                databaseOfCountries.get(continent).put(country, new ArrayList<>());
                databaseOfCountries.get(continent).get(country).add(city);
            } else {
                if (databaseOfCountries.get(continent).containsKey(country)) {
                    databaseOfCountries.get(continent).get(country).add(city);
                } else {
                    databaseOfCountries.get(continent).putIfAbsent(country, new ArrayList<>());
                    databaseOfCountries.get(continent).get(country).add(city);
                }
            }
        }
        for (Map.Entry<String, Map<String, List<String>>> entry : databaseOfCountries.entrySet()) {
            String nameOfContinent = entry.getKey();
            System.out.printf("%s:%n", nameOfContinent);
            entry.getValue().entrySet().forEach(e -> {
                System.out.printf("  %s -> ",e.getKey());
                ArrayList<String> values = new ArrayList<>(e.getValue());
                System.out.print(String.join(", ",values));
                System.out.println();
            });

        }
    }
}
