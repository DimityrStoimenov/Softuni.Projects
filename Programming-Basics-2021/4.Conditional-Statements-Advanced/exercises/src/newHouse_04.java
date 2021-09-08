import java.util.Scanner;

public class newHouse_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String flowerType = scan.nextLine(); // вид цветя - между "Roses", "Dahlias", "Tulips", "Narcissus","Gladiolus"
        int flowerCount = Integer.parseInt(scan.nextLine()); // брой цветя
        int budget = Integer.parseInt(scan.nextLine()); // разполагаем бюджет на семейството

        double costRoses = flowerCount * 5.0;
        double costDahlias = flowerCount * 3.80;
        double costTulips = flowerCount * 2.80;
        double costNarcissus = flowerCount * 3.0;
        double costGladiolus = flowerCount * 2.50;
        double discount = 0;
        double surcharge = 0;
        double leftMoney = 0;
        double neededMoney = 0;

        if ("Roses".equals(flowerType) && flowerCount <= 80) {
            if (costRoses <= budget) {
                leftMoney = budget - costRoses;
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, leftMoney);
            } else if(costRoses>=budget) {
                neededMoney = costRoses - budget;
                System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
            }
        }
        if ("Roses".equals(flowerType) && flowerCount > 80) {
            discount = costRoses - (costRoses * 0.1);
            if (discount <= budget) {
                leftMoney = budget - discount;
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, leftMoney);
            } else if (discount >=budget) {
                neededMoney = discount - budget;
                System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
            }
        }
        if ("Dahlias".equals(flowerType) && flowerCount <= 90) {
            if (costDahlias <= budget) {
                leftMoney = budget - costDahlias;
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, leftMoney);
            } else if(costDahlias>=budget) {
                neededMoney = costDahlias - budget;
                System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
            }
        }
        if ("Dahlias".equals(flowerType) && flowerCount > 90) {
            discount = costDahlias - (costDahlias * 0.15);
            if (discount <= budget) {
                leftMoney = budget - discount;
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, leftMoney);
            } else if(discount>=budget) {
                neededMoney = discount - budget;
                System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
            }
        }
        if ("Tulips".equals(flowerType) && flowerCount <= 80) {
            if (costTulips <= budget) {
                leftMoney = budget - costTulips;
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, leftMoney);
            } else if(costTulips>=budget) {
                neededMoney = costTulips - budget;
                System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
            }
        }
        if ("Tulips".equals(flowerType) && flowerCount > 80) {
            discount = costTulips - (costTulips * 0.15);
            if (discount <= budget) {
                leftMoney = budget - discount;
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, leftMoney);
            } else if(discount>=budget) {
                neededMoney = (discount - budget);
                System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
            }
        }
        if ("Narcissus".equals(flowerType) &&  flowerCount < 120) {
            surcharge = costNarcissus + (costNarcissus * 0.15);
            if (surcharge <= budget) {
                leftMoney = budget - surcharge;
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, leftMoney);
            } else if(surcharge>=budget) {
                neededMoney = (surcharge - budget);
                System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
            }
        }
        if ("Narcissus".equals(flowerType) && flowerCount >= 120) {
            if (costNarcissus <= budget) {
                leftMoney = budget - costNarcissus;
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, leftMoney);
            } else if(costNarcissus>=budget) {
                neededMoney = (costNarcissus - budget);
                System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
            }
        }
        if ("Gladiolus".equals(flowerType) && flowerCount < 80) {
            surcharge = costGladiolus + (costGladiolus * 0.20);
            if (surcharge <= budget) {
                leftMoney = budget - surcharge;
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, leftMoney);
            } else if(surcharge>=budget) {
                neededMoney = (surcharge - budget);
                System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
            }
        }
        if ("Gladiolus".equals(flowerType) && flowerCount >= 80) {
            if (costGladiolus <= budget) {
                leftMoney = budget - costGladiolus;
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, leftMoney);
            } else if(costGladiolus>=budget) {
                neededMoney =(costGladiolus - budget);
                System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
            }
        }
    }
}


