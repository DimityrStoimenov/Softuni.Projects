import java.util.*;

public class ForceBook_09_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap<String, List<String>> forceBook = new TreeMap<>();
        String forceSide;
        String forceUser;
        String input = scan.nextLine();
        while (!input.equals("Lumpawaroo")) {
            String [] database = input.split(" \\| ");
            if (database.length != 1) {
                forceSide = database[0];
                forceUser = database[1];
                boolean isForceUser = false;
                for (Map.Entry<String, List<String>> entry : forceBook.entrySet()) {
                    if (entry.getValue().contains(forceUser)) {
                        isForceUser = true;
                        break;
                    }
                } if (!isForceUser) {
                    if (!forceBook.containsKey(forceSide)) {
                        forceBook.put(forceSide, new ArrayList<>());
                        forceBook.get(forceSide).add(forceUser);
                    } else if (forceBook.containsKey(forceSide) && !forceBook.get(forceSide).contains(forceUser)) {
                        forceBook.get(forceSide).add(forceUser);
                    }
                }
            } else {
                database = input.split(" -> ");
                forceUser = database[0];
                forceSide = database[1];
                for (Map.Entry<String, List<String>> entry : forceBook.entrySet()) {
                    if (entry.getValue().contains(forceUser)) {
                        forceBook.get(entry.getKey()).remove(forceUser);
                        break;
                    }
                } if (!forceBook.containsKey(forceSide)) {
                    forceBook.put(forceSide, new ArrayList<>());
                    forceBook.get(forceSide).add(forceUser);
                    System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
                } else if (forceBook.containsKey(forceSide) && !forceBook.get(forceSide).contains(forceUser)) {
                    forceBook.get(forceSide).add(forceUser);
                    System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
                }
            }
            input = scan.nextLine();
        }
        forceBook
                .entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 0)
                .sorted((a,b) -> {
                    int result = b.getValue().size() - a.getValue().size();
                    if (result == 0) {
                        return a.getKey().compareTo(b.getKey());
                    }
                    return result;
                }).forEach(entry -> {
            System.out.printf("Side: %s, Members: %d%n", entry.getKey(),entry.getValue().size());
            entry.getValue().stream().sorted(String::compareTo).forEach(e -> System.out.printf("! %s%n", e));
        });
    }
}
