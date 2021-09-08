import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class HeroesCodeAndLogic7ThirdDecisionWithMapObject_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, HeroData> heroes = new LinkedHashMap<>();
        int numberOfHeroes = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < numberOfHeroes; i++) {
            String hero = scan.nextLine();
            String[] heroDataBase = hero.split("\\s+");
            String heroName = heroDataBase[0];
            int heatPoints = Integer.parseInt(heroDataBase[1]);
            int manaPoints = Integer.parseInt(heroDataBase[2]);
            if (heatPoints <= 100 && manaPoints <= 200) {
                HeroData newHero = new HeroData(heatPoints, manaPoints);
                heroes.put(heroName, newHero);
            }
        }
        String input = scan.nextLine();
        while (!input.equals("End")) {
            //CastSpell – {hero name} – {MP needed} – {spell name}
            //TakeDamage – {hero name} – {damage} – {attacker}
            //Recharge – {hero name} – {amount}
            //Heal – {hero name} – {amount}
            String[] tokens = input.split("\\s+-\\s+");
            String command = tokens[0];
            String heroName = tokens[1];
            switch (command) {
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(tokens[2]);
                    int currentMp = heroes.get(heroName).getMp();
                    String spellName = tokens[3];
                    if (currentMp >= mpNeeded) {
                        int leftMp = currentMp - mpNeeded;
                        heroes.get(heroName).setMp(leftMp);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, leftMp);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(tokens[2]);
                    String attacker = tokens[3];
                    int currentHp = heroes.get(heroName).getHp();
                    int leftHp = currentHp - damage;
                    if (leftHp > 0) {
                        heroes.get(heroName).setHp(leftHp);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                                heroName, damage, attacker, leftHp);
                    } else {
                        heroes.remove(heroName);
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    }
                    break;
                case "Recharge":
                    int amountToRecharge = Integer.parseInt(tokens[2]);
                    int currentMPToRecharge = heroes.get(heroName).getMp();
                    int increasedMp = currentMPToRecharge + amountToRecharge;
                    if (increasedMp > 200) {
                        increasedMp = 200;
                        heroes.get(heroName).setMp(increasedMp);

                    } else {
                        heroes.get(heroName).setMp(increasedMp);
                    }
                    System.out.printf("%s recharged for %d MP!%n", heroName, increasedMp - currentMPToRecharge);
                    break;
                case "Heal":
                    int amountToRechargeHP = Integer.parseInt(tokens[2]);
                    int currentHPToRecharge = heroes.get(heroName).getHp();
                    int increaseHP = currentHPToRecharge + amountToRechargeHP;
                    if (increaseHP >= 100) {
                        increaseHP = 100;
                        heroes.get(heroName).setHp(increaseHP);
                    } else {
                        heroes.get(heroName).setHp(increaseHP);
                    }
                    System.out.printf("%s healed for %d HP!%n", heroName, increaseHP - currentHPToRecharge);
                    break;
            }
            input = scan.nextLine();
        }
        heroes.entrySet().stream().sorted((a, b) -> {
            int result = Integer.compare(b.getValue().getHp(), a.getValue().getHp());
            if (result == 0) {
                result = a.getKey().compareTo(b.getKey());
            }
            return result;
        }).forEach(entry -> {
            System.out.printf("%s%n", entry.getKey());
            System.out.printf("  HP: %d%n", entry.getValue().getHp());
            System.out.printf("  MP: %s%n", entry.getValue().getMp());
        });
    }
}

class HeroData {
    private int hp;
    private int mp;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public HeroData(int hp, int mp) {
        this.hp = hp;
        this.mp = mp;
    }
}



