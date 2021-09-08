import java.util.LinkedHashMap;
import java.util.Scanner;

public class MOBAChallenger_03_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, LinkedHashMap<String, Integer>> game = new LinkedHashMap<>();
        String input = scan.nextLine();
        while (!input.equals("Season end")) {
            String [] dataBasePlayers = input.split(" -> ");
            if(dataBasePlayers.length > 2) {
                String player = dataBasePlayers[0];
                String position = dataBasePlayers[1];
                int skill = Integer.parseInt(dataBasePlayers[2]);
                game.putIfAbsent(player, new LinkedHashMap<>());
                game.get(player).putIfAbsent(position, 0);
                if (game.get(player).get(position) < skill) {
                    game.get(player).put(position,skill);
                }
            } else {
                dataBasePlayers = input.split(" vs ");
                String playerOne = dataBasePlayers[0];
                String playerTwo = dataBasePlayers[1];
                if (game.containsKey(playerOne) && game.containsKey(playerTwo)){
                    boolean isCommon = false;
                    for ( String p1 : game.get(playerOne). keySet()) {
                        for(String p2 : game.get(playerTwo).keySet()) {
                            if (p1.equals(p2)) {
                                isCommon = true;
                                break;
                            }
                        }
                    }
                    if (isCommon) {
                        if (game.get(playerOne).values().stream().mapToInt(Integer::intValue).sum()
                        > game.get(playerTwo).values().stream().mapToInt(Integer::intValue).sum()) {
                            game.remove(playerTwo);
                        } else if (game.get(playerTwo).values().stream().mapToInt(Integer::intValue).sum() >
                        game.get(playerOne).values().stream().mapToInt(Integer::intValue).sum()) {
                            game.remove(playerOne);
                        }
                    }
                }
            }

            input = scan.nextLine();
        }
        game
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int result = Integer.compare(b.getValue().values().stream().mapToInt(Integer::intValue)
                    .sum(), a.getValue().values().stream().mapToInt(Integer::intValue).sum()); {
                        if( result == 0) {
                            return a.getKey().compareTo(b.getKey());
                        }
                        return result;
                    }
                }).forEach(entry -> {
            System.out.printf("%s: %d skill%n", entry.getKey(),
                    entry.getValue().values().stream().mapToInt(Integer::intValue).sum());
            entry.getValue().entrySet().stream().sorted((c,d) -> {
                int result = d.getValue().compareTo(c.getValue());
                if (result == 0) {
                    return c.getKey().compareTo(d.getKey());
                }
                return result;
            }).forEach(i -> System.out.printf("- %s <::> %d%n", i.getKey(),i.getValue()));
        });
    }
}
