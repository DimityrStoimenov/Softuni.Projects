import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Judge_02_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, LinkedHashMap<String, Integer>> users = new LinkedHashMap<>();
        String input = scan.nextLine();
        while (!input.equals("no more time")) {
            String [] databaseUsers = input.split(" -> ");
            String userName = databaseUsers[0];
            String contest = databaseUsers[1];
            int points = Integer.parseInt(databaseUsers[2]);
            users.putIfAbsent(contest, new LinkedHashMap<>());
            users.get(contest).putIfAbsent(userName, 0);
            if (users.get(contest).get(userName) < points) {
                users.get(contest).put(userName, points);
            }
            input = scan.nextLine();
        }
        AtomicInteger number = new AtomicInteger();
        users
                .entrySet()
                .stream()
                .forEach(e -> {
                    number.set(1);
                    System.out.printf("%s: %d participants%n", e.getKey(),e.getValue().size());
                    e.getValue().entrySet().stream().sorted((a,b) -> {
                        int result = b.getValue().compareTo(a.getValue());
                        if (result == 0) {
                            return a.getKey().compareTo(b.getKey());
                        }
                        return result;
                    }).forEach(i -> System.out.printf("%d. %s <::> %d%n", number.getAndIncrement(),
                            i.getKey(),i.getValue()));
                });
        LinkedHashMap<String, Integer> standings = new LinkedHashMap<>();
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : users.entrySet()) {
          for (Map.Entry<String, Integer> en : entry.getValue().entrySet()) {
              standings.putIfAbsent(en.getKey(), 0);
              standings.put(en.getKey(), standings.get(en.getKey()) + en.getValue());
          }
        }
        System.out.println("Individual standings:");
        number.set(1);
        standings.entrySet().stream().sorted((a,b) -> {
            int result = b.getValue().compareTo(a.getValue());
            if (result == 0) {
                return a.getKey().compareTo(b.getKey());
            }
            return result;
        }). forEach( o -> System.out.printf("%d. %s -> %d%n", number.getAndIncrement(),o.getKey(),o.getValue()));
    }
}
