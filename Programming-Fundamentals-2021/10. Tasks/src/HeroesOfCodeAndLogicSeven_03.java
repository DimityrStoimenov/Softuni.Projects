import java.util.LinkedHashMap;
import java.util.Scanner;

public class HeroesOfCodeAndLogicSeven_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, int[]> heroes = new LinkedHashMap<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n ; i++) {
          String [] tokens = scan.nextLine().split("\\s+");
          heroes.putIfAbsent(tokens[0], new int[2]);
          heroes.get(tokens[0])[0] += Integer.parseInt(tokens[1]);
          if(heroes.get(tokens[0])[0] > 100) {
              heroes.get(tokens[0])[0] = 100;
          }
          heroes.get(tokens[0])[1] += Integer.parseInt(tokens[2]);
          if(heroes.get(tokens[0])[1] > 200) {
              heroes.get(tokens[0])[1] = 200;
          }
        }
        String input = scan.nextLine();
        while (!input.equals("End")) {
            String [] tokens = input.split("\\s+-\\s+");
            String command = tokens[0];
            switch(command) {
                case "CastSpell":
                    if(heroes.containsKey(tokens[1])) {
                        String hero = tokens[1];
                        int hp = Integer.parseInt(tokens[2]);
                        if(heroes.get(hero)[1] >= hp) {
                            heroes.get(hero)[1] -= hp;
                            System.out.printf("%s has successfully cast %s and now has %d MP!%n", tokens[1], tokens[3],
                                    heroes.get(hero)[1]);
                        } else {
                            System.out.printf("%s does not have enough MP to cast %s!%n", tokens[1],tokens[3]);
                        }
                    }
                    break;
                case "TakeDamage":
                    heroes.get(tokens[1])[0] -= Integer.parseInt(tokens[2]);
                    if(heroes.get(tokens[1])[0] > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", tokens[1],
                                Integer.parseInt(tokens[2]), tokens[3], heroes.get(tokens[1])[0]);
                    } else {
                        heroes.remove(tokens[1]);
                        System.out.printf("%s has been killed by %s!%n", tokens[1], tokens[3]);
                    }
                    break;
                case "Recharge":
                    if (heroes.get(tokens[1])[1] + Integer.parseInt(tokens[2]) > 200) {
                        System.out.printf("%s recharged for %d MP!%n", tokens[1],
                                ((200 - heroes.get(tokens[1])[1])));
                        heroes.get(tokens[1])[1] = 200;
                    } else {
                        heroes.get(tokens[1])[1] += Integer.parseInt(tokens[2]);
                        System.out.printf("%s recharged for %d MP!%n", tokens[1], Integer.parseInt(tokens[2]));
                    }
                    break;
                case "Heal":
                    if (heroes.get(tokens[1])[0] + Integer.parseInt(tokens[2]) >= 100) {
                        System.out.printf("%s healed for %d HP!%n",
                                 tokens[1], (100 -  heroes.get(tokens[1])[0]));
                        heroes.get(tokens[1])[0] = 100;
                    } else {
                        heroes.get(tokens[1])[0] += Integer.parseInt(tokens[2]);
                        System.out.printf("%s healed for %d HP!%n", tokens[1], Integer.parseInt(tokens[2]));
                    }
                    break;
            }
            input = scan.nextLine();
        }
        if (heroes.size() > 0) {
            heroes.entrySet().stream(). filter(i -> i.getValue()[0] > 0).sorted((a,b) -> {
                int result = b.getValue()[0] - a.getValue()[0];
                if (result == 0) {
                    return a.getKey().compareTo(b.getKey());
                }
                return result;
            }).forEach(e -> {
                System.out.printf("%s%n", e.getKey());
                System.out.printf(" HP: %d%n", e.getValue()[0]);
                System.out.printf(" MP: %d%n", e.getValue()[1]);
            });
        }

    }
}
