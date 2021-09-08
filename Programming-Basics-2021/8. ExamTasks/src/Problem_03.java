import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String sex = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String sport = scan.nextLine();
        double card = 0;
        double diff = 0;
        if (sex.equals("m") && sport.equals("Gym") && (age >= 1 && age <= 19)) {
            card = 42 - (42 * 0.2);
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }
        if (sex.equals("m") && sport.equals("Boxing") && (age >= 1 && age <= 19)) {
            card = 41 - (41 * 0.2);
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }
        if (sex.equals("m") && sport.equals("Yoga") && (age >= 1 && age <= 19)) {
            card = 45 - (45 * 0.2);
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }
        if (sex.equals("m") && sport.equals("Zumba") && (age >= 1 && age <= 19)) {
            card = 34 - (34 * 0.2);
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }
        if (sex.equals("m") && sport.equals("Dances") && (age >= 1 && age <= 19)) {
            card = 51 - (51 * 0.2);
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }
        if (sex.equals("m") && sport.equals("Pilates") && (age >= 1 && age <= 19)) {
            card = 39 - (39 * 0.2);
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }


        if (sex.equals("m") && sport.equals("Gym") && age > 19) {
            card = 42;
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }

        }
        if (sex.equals("m") && sport.equals("Boxing") &&  age > 19) {
            card = 41;
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }
        if (sex.equals("m") && sport.equals("Yoga") && age > 19) {
            card = 45;
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }
        if (sex.equals("m") && sport.equals("Zumba") && age > 19) {
            card = 34;
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }
        if (sex.equals("m") && sport.equals("Dances") && age > 19) {
            card = 51;
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }
        if (sex.equals("m") && sport.equals("Pilates") && age>19) {
            card = 39;
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }
        if (sex.equals("f") && sport.equals("Gym") && (age >= 1 && age <= 19)) {
            card = 35 - (35 * 0.2);
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }
        if (sex.equals("f") && sport.equals("Boxing") && (age >= 1 && age <= 19)) {
            card = 37 - (37 * 0.2);
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }
        if (sex.equals("f") && sport.equals("Yoga") && (age >= 1 && age <= 19)) {
            card = 42 - (42 * 0.2);
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }
        if (sex.equals("f") && sport.equals("Zumba") && (age >= 1 && age <= 19)) {
            card = 31 - (31 * 0.2);
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }
        if (sex.equals("f") && sport.equals("Dances") && (age >= 1 && age <= 19)) {
            card = 53 - (53 * 0.2);
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }
        if (sex.equals("f") && sport.equals("Pilates") && (age >= 1 && age <= 19)) {
            card = 37 - (37 * 0.2);
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }


        if (sex.equals("f") && sport.equals("Gym") && age > 19) {
            card = 35;
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }

        }
        if (sex.equals("f") && sport.equals("Boxing") &&  age > 19) {
            card = 37;
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }
        if (sex.equals("f") && sport.equals("Yoga") && age > 19) {
            card = 42;
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }
        if (sex.equals("f") && sport.equals("Zumba") && age > 19) {
            card = 31;
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }
        if (sex.equals("f") && sport.equals("Dances") && age > 19) {
            card = 53;
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }
        if (sex.equals("f") && sport.equals("Pilates") && age>19) {
            card = 37;
            if (card <= budget) {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            } else {
                diff = card - budget;
                System.out.printf("You don't have enough money! You need $%.2f more.", diff);

            }
        }

    }
}



