import java.util.Scanner;

public class FishingBoat_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int budget = Integer.parseInt(scan.nextLine()); // бюджет на групата
        String season = scan.nextLine(); // сезон / "Spring" , "Summer" , "Autumn", "Winter" /
        int numberOfFisherman = Integer.parseInt(scan.nextLine()); //  брой рибари

        int rentIntSpring = 3000;
        int rentInSummer = 4200;
        int rentInAutumn = 4200;
        int rentInWinter = 2600;
        double discount;
        double decrease = 0;
        double leftMoney;
        double neededMoney;
        if ("Spring".equals(season)) {
            if (numberOfFisherman <= 6 && numberOfFisherman % 2 == 0) {
                discount = rentIntSpring - (0.1 * rentIntSpring);
                decrease = discount - (0.05 * discount);
                if (decrease <= budget) {
                    leftMoney = budget - decrease;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else if (decrease >= budget) {
                    neededMoney = decrease - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                }
            }
        }
        if ("Spring".equals(season)) {
            if (numberOfFisherman <= 6 && numberOfFisherman % 2 == 1) {
                discount = rentIntSpring - (0.1 * rentIntSpring);
                if (discount <= budget) {
                    leftMoney = budget - discount;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else if (discount >= budget) {
                    neededMoney = discount - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                }
            }
        }
        if ("Spring".equals(season)) {
            if ((numberOfFisherman >= 7 && numberOfFisherman<=11) && (numberOfFisherman % 2 == 0)) {
                discount = rentIntSpring - (0.15 * rentIntSpring);
                decrease = discount - (0.05 * discount);
                if (decrease <= budget) {
                    leftMoney = budget - decrease;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else if (decrease >= budget) {
                    neededMoney = decrease - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                }
            }
        }
        if ("Spring".equals(season)) {
            if ((numberOfFisherman >= 7 && numberOfFisherman<=11) && (numberOfFisherman % 2 == 1)) {
                discount = rentIntSpring - (0.15 * rentIntSpring);
                if (discount <= budget) {
                    leftMoney = budget - discount;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else if (discount >= budget) {
                    neededMoney = discount - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                }
            }
        }
        if ("Spring".equals(season)) {
            if ((numberOfFisherman >= 12 && numberOfFisherman % 2 == 0)) {
                discount = rentIntSpring - (0.25 * rentIntSpring);
                decrease = discount - (0.05 * discount);
                if (decrease <= budget) {
                    leftMoney = budget - decrease;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else if (decrease >= budget) {
                    neededMoney = decrease - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                }
            }
        }
        if ("Spring".equals(season)) {
            if ((numberOfFisherman >= 12 && (numberOfFisherman % 2 == 1))) {
                discount = rentIntSpring - (0.25 * rentIntSpring);
                if (discount <= budget) {
                    leftMoney = budget - discount;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else if (discount >= budget) {
                    neededMoney = discount - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                }
            }
        }
        if ("Summer".equals(season)) {
            if (numberOfFisherman <= 6 && numberOfFisherman % 2 == 0) {
                discount = rentInSummer - (0.1 * rentInSummer);
                decrease = discount - (0.05 * discount);
                if (decrease <= budget) {
                    leftMoney = budget - decrease;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else if (decrease >= budget) {
                    neededMoney = decrease - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                }
            }
        }
        if ("Summer".equals(season)) {
            if (numberOfFisherman <= 6 && numberOfFisherman % 2 == 1) {
                discount = rentInSummer - (0.1 * rentInSummer);
                if (discount <= budget) {
                    leftMoney = budget - discount;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else if (discount >= budget) {
                    neededMoney = discount - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                }
            }
        }
        if ("Summer".equals(season)) {
            if ((numberOfFisherman >= 7 && numberOfFisherman<=11) && (numberOfFisherman % 2 == 0)) {
                discount = rentInSummer - (0.15 * rentInSummer);
                decrease = discount - (0.05 * discount);
                if (decrease <= budget) {
                    leftMoney = budget - decrease;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else if (decrease >= budget) {
                    neededMoney = decrease - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                }
            }
        }
        if ("Summer".equals(season)) {
            if ((numberOfFisherman >= 7 && numberOfFisherman<=11) && (numberOfFisherman % 2 == 1)) {
                discount = rentInSummer - (0.15 * rentInSummer);
                if (discount <= budget) {
                    leftMoney = budget - discount;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else if (discount >= budget) {
                    neededMoney = discount - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                }
            }
        }
        if ("Summer".equals(season)) {
            if ((numberOfFisherman >= 12 && numberOfFisherman % 2 == 0)) {
                discount = rentInSummer - (0.25 * rentInSummer);
                decrease = discount - (0.05 * discount);
                if (decrease <= budget) {
                    leftMoney = budget - decrease;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else if (decrease >= budget) {
                    neededMoney = decrease - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                }
            }
        }
        if ("Summer".equals(season)) {
            if ((numberOfFisherman >= 12 && (numberOfFisherman % 2 == 1))) {
                discount = rentInSummer - (0.25 * rentInSummer);
                if (discount <= budget) {
                    leftMoney = budget - discount;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else if (discount >= budget) {
                    neededMoney = discount - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                }
            }
        }
        if ("Autumn".equals(season)) {
            if (numberOfFisherman <= 6) {
                discount = rentInAutumn - (0.1 * rentInAutumn);
                if (discount <= budget) {
                    leftMoney = discount - decrease;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else if (discount >= budget) {
                    neededMoney = discount - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                }
            }
        }
        if ("Autumn".equals(season)) {
            if (numberOfFisherman >= 7 && numberOfFisherman <= 11) {
                discount = rentInAutumn - (0.15 * rentInAutumn);
                if (discount <= budget) {
                    leftMoney = budget - discount;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else if (discount >= budget) {
                    neededMoney = discount - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                }
            }
        }
        if ("Autumn".equals(season)) {
            if (numberOfFisherman >= 12) {
                discount = rentInAutumn - (0.25 * rentInAutumn);
                if (discount <= budget) {
                    leftMoney = budget - discount;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else if (discount >= budget) {
                    neededMoney = discount - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                }
            }
        }
        if ("Winter".equals(season)) {
            if (numberOfFisherman <= 6 && numberOfFisherman % 2 == 0) {
                discount = rentInWinter - (0.1 * rentInWinter);
                decrease = discount - (0.05 * discount);
                if (decrease <= budget) {
                    leftMoney = budget - decrease;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else if (decrease >= budget) {
                    neededMoney = decrease - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                }
            }
        }
        if ("Winter".equals(season)) {
            if (numberOfFisherman <= 6 && numberOfFisherman % 2 == 1) {
                discount = rentInWinter - (0.1 * rentInWinter);
                if (discount <= budget) {
                    leftMoney = budget - discount;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else if (discount >= budget) {
                    neededMoney = discount - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                }
            }
        }

        if ("Winter".equals(season)) {
            if ((numberOfFisherman >= 7 && numberOfFisherman<=11) && (numberOfFisherman % 2 == 0)) {
                discount = rentInWinter - (0.15 * rentInWinter);
                decrease = discount - (0.05 * discount);
                if (decrease <= budget) {
                    leftMoney = budget - decrease;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else if (decrease >= budget) {
                    neededMoney = decrease - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                }
            }
        }
        if ("Winter".equals(season)) {
            if ((numberOfFisherman >= 7 && numberOfFisherman<=11) && (numberOfFisherman % 2 == 1)) {
                discount = rentInWinter - (0.15 * rentInWinter);
                if (discount <= budget) {
                    leftMoney = budget - discount;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else if (discount >= budget) {
                    neededMoney = discount - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                }
            }
        }
        if ("Winter".equals(season)) {
            if ((numberOfFisherman >= 12 && numberOfFisherman % 2 == 0)) {
                discount = rentInWinter - (0.25 * rentInWinter);
                decrease = discount - (0.05 * discount);
                if (decrease <= budget) {
                    leftMoney = budget - decrease;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else if (decrease >= budget) {
                    neededMoney = decrease - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                }
            }
        }
        if ("Winter".equals(season)) {
            if ((numberOfFisherman >= 12 && (numberOfFisherman % 2 == 1))) {
                discount = rentInWinter - (0.25 * rentInWinter);
                if (discount <= budget) {
                    leftMoney = budget - discount;
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney);
                } else if (discount >= budget) {
                    neededMoney = discount - budget;
                    System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                }
            }
        }

    }
}
