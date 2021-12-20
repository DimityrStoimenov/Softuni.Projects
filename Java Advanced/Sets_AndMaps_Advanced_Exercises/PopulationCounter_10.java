import java.util.*;

public class PopulationCounter_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //  country      city   population
        Map<String, Map<String, Long>> countries = new LinkedHashMap<>();
        String input = scan.nextLine();

        while (!input.equals("report")) {
            String [] tokens = input.split("\\|");
            String city = tokens[0];
            String country = tokens[1];
            long population = Long.parseLong(tokens[2]);
            countries.putIfAbsent(country, new LinkedHashMap<>());
            countries.get(country).putIfAbsent(city, population);
            input = scan.nextLine();
        }
        countries.entrySet().stream().sorted((c1,c2) -> {
            long p1 = c1.getValue().values().stream().mapToLong(l -> l).sum();
            long p2 = c2.getValue().values().stream().mapToLong(l -> l).sum();
            return Long.compare(p2,p1);
        }).forEach(c ->  {
            long totalPopulation = c.getValue().values().stream().mapToLong(p -> p).sum();
            System.out.println(String.format("%s (total population: %d)",c.getKey(),totalPopulation));
            Map<String, Long> cityInfo = c.getValue();
            cityInfo.entrySet().stream().sorted((c1,c2) -> Long.compare(c2.getValue(),c1.getValue()))
                    .forEach(t -> System.out.printf("=>%s: %d%n", t.getKey(),t.getValue()));

        });
    }
}
