import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class SoftUniExamResults_10_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap<String, List<String>> languages = new TreeMap<>();
        TreeMap<String, Integer> points = new TreeMap<>();
        String input = scan.nextLine();
        while (!input.equals("exam finished")) {
            String[] database = input.split("-");
            String name = database[0];
            String language = database[1];
            if (database[1].equals("banned")) {
                points.remove(name);
            } else {
                int currentPoints = Integer.parseInt(database[2]);
                if (!points.containsKey(name)) {
                    points.put(name, currentPoints);
                } else if (points.containsKey(name) && points.get(name) < currentPoints) {
                    points.put(name, currentPoints);
                }
                if (!languages.containsKey(language)) {
                    languages.put(language, new ArrayList<>());
                    languages.get(language).add(name);
                } else {
                    languages.get(language).add(name);
                }
            }
            input = scan.nextLine();
        }
        System.out.println("Results:");
        points
                .entrySet()
                .stream()
                .sorted((a,b) -> {
                    int result = b.getValue().compareTo(a.getValue());
                    if (result == 0) {
                        return a.getKey().compareTo(b.getKey());
                    }
                    return result;
                }).forEach(entry -> System.out.printf("%s | %d%n", entry.getKey(),entry.getValue()));
        System.out.println("Submissions:");
        languages
                .entrySet()
                .stream()
                .sorted((a,b) -> {
                    int result = b.getValue().size() - a.getValue().size();
                    if(result == 0) {
                        return a.getKey().compareTo(b.getKey());
                    }
                    return result;
                }).forEach(e -> System.out.printf("%s - %d%n", e.getKey(),e.getValue().size()));
    }
}

