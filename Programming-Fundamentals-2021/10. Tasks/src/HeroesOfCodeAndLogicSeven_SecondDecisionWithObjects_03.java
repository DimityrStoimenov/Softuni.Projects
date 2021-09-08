import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeroesOfCodeAndLogicSeven_SecondDecisionWithObjects_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Heroes> heroDataBase = new ArrayList<>();
        int numberOfHeroes = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < numberOfHeroes; i++) {
            String hero = scan.nextLine();
            String[] databaseOfHero = hero.split("\\s+");
            String heroName = databaseOfHero[0];
            int hp = Integer.parseInt(databaseOfHero[1]);
            int mp = Integer.parseInt(databaseOfHero[2]);
            if (hp <= 100 && mp <= 200) {
            Heroes newHero = new Heroes(heroName,hp,mp);
            heroDataBase.add(newHero);
            }

        }
        String input = scan.nextLine();
        while (!input.equals("End")) {
            String [] tokens = input.split("\\s+-\\s+");
            String command = tokens[0];
            String heroName = tokens[1];
            switch (command) {
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(tokens[2]);
                    String spellName = tokens[3];
                    for (int i = 0; i <= heroDataBase.size() - 1 ; i++) {
                        if (heroDataBase.get(i).getHeroName().equals(heroName)) {
                            int currentMp = heroDataBase.get(i).getMp();
                            if (currentMp >= mpNeeded) {
                                int leftMP = currentMp - mpNeeded;
                                heroDataBase.get(i).setMp(leftMP);
                                System.out.printf("%s has successfully cast %s and now has %d MP!%n",
                                        heroName,spellName,leftMP);
                            } else {
                                System.out.printf("%s does not have enough MP to cast %s!%n", heroName,spellName);
                            }
                        }

                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(tokens[2]);
                    String attacker = tokens[3];
                    for (int i = 0; i <= heroDataBase.size() - 1 ; i++) {
                        if (heroDataBase.get(i).getHeroName().equals(heroName)) {
                            int currentHP = heroDataBase.get(i).getHp();
                            int leftHP = currentHP - damage;
                            if(leftHP > 0) {
                                heroDataBase.get(i).setHp(leftHP);
                                System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                                        heroName,damage,attacker,leftHP);
                            } else {
                                heroDataBase.remove(heroDataBase.get(i));
                                System.out.printf("%s has been killed by %s!%n", heroName,attacker);
                            }
                        }

                    }
                    break;
                case "Recharge":
                    int amountOfRecharge = Integer.parseInt(tokens[2]);
                    for (int i = 0; i <= heroDataBase.size() - 1 ; i++) {
                        if (heroDataBase.get(i).getHeroName().equals(heroName)) {
                            int currentMp = heroDataBase.get(i).getMp();
                            int increaseMp = currentMp + amountOfRecharge;
                            if (increaseMp > 200) {
                                increaseMp = 200;
                                heroDataBase.get(i).setMp(increaseMp);
                            }
                            else {
                                heroDataBase.get(i).setMp(increaseMp);
                            }
                            System.out.printf("%s recharged for %d MP!%n", heroName, increaseMp - currentMp);
                        }

                    }
                    break;
                case "Heal":
                    int damageOfHeal = Integer.parseInt(tokens[2]);
                    for (int i = 0; i <= heroDataBase.size() - 1 ; i++) {
                        if(heroDataBase.get(i).getHeroName().equals(heroName)) {
                            int currentHP = heroDataBase.get(i).getHp();
                            int increaseHP = currentHP + damageOfHeal;
                            if (increaseHP >= 100) {
                                increaseHP = 100;
                                heroDataBase.get(i).setHp(increaseHP);
                            } else {
                                heroDataBase.get(i).setHp(increaseHP);
                            }
                            System.out.printf("%s healed for %d HP!%n", heroName, increaseHP - currentHP);
                        }

                    }
                    break;
            }
            input = scan.nextLine();
        }
        heroDataBase.stream().sorted((a,b) -> {
            int result = Integer.compare(b.getHp(),a.getHp());
            if (result == 0) {
                result = a.getHeroName().compareTo(b.getHeroName());
            }
            return result;
        }).forEach(entry -> {
            System.out.println(entry.getHeroName());
            System.out.printf("  HP: %d%n", entry.getHp());
            System.out.printf("  MP: %d%n", entry.getMp());
        });

    }
}
class Heroes {
    private String heroName;
    private int hp;
    private int mp;

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public Heroes (String heroName, int hp, int mp) {
        this.heroName = heroName;
        this.hp = hp;
        this.mp = mp;
    }
}
