import java.util.Scanner;
public class CoffeeMachine_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String drink = scan.nextLine(); // "Espresso", "Cappuccino" или "Tea"
        String sugar = scan.nextLine(); // "Without", "Normal" или "Extra"
        int numberOfDrinks = Integer.parseInt(scan.nextLine());
        double prize = 0;
        switch(drink) {
            case "Espresso":
                if (sugar.equals("Without")) {
                    prize = numberOfDrinks * 0.90;
                    prize = prize - (prize * 0.35);
                if (numberOfDrinks > 5) {
                    prize = prize - (prize * 0.25);
                }
        } else if(sugar.equals("Normal")) {
                    prize = numberOfDrinks * 1.0;
                    if (numberOfDrinks > 5) {
                        prize = prize - (prize * 0.25);
                    }
                } else if(sugar.equals("Extra")) {
                    prize = numberOfDrinks * 1.20;
                    if (numberOfDrinks > 5) {
                        prize = prize - (prize * 0.25);
                    }
                }
                break;
            case "Cappuccino":
                if (sugar.equals("Without")) {
                    prize = numberOfDrinks * 1.00;
                    prize = prize - (prize * 0.35);

                } else if(sugar.equals("Normal")) {
                    prize = numberOfDrinks * 1.20;

                } else if(sugar.equals("Extra")) {
                    prize = numberOfDrinks * 1.60;

                }
                break;
            case "Tea":
                if (sugar.equals("Without")) {
                    prize = numberOfDrinks * 0.50;
                   prize = prize - (prize * 0.35);

                } else if(sugar.equals("Normal")) {
                    prize = numberOfDrinks * 0.60;

                } else if(sugar.equals("Extra")) {
                    prize = numberOfDrinks * 0.70;

                }
                break;
        }
        if(((drink.equals("Espresso"))|| (drink.equals("Cappuccino"))||(drink.equals("Tea"))) &&
                ((sugar.equals("Without"))||(sugar.equals("Normal"))||(sugar.equals("Extra")))&&
                (prize <= 15.0)) {
            System.out.printf("You bought %d cups of %s for %.2f lv.",numberOfDrinks,drink,prize);

        } else if (((drink.equals("Espresso"))|| (drink.equals("Cappuccino"))||(drink.equals("Tea"))) &&
                ((sugar.equals("Without"))||(sugar.equals("Normal"))||(sugar.equals("Extra")))&&
                (prize > 15.0)) {
            double discount = prize - ( prize * 0.2);
            System.out.printf("You bought %d cups of %s for %.2f lv.",numberOfDrinks,drink,discount);
        }
    }
}
