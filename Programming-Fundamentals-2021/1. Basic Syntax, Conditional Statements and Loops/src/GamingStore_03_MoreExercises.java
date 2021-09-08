import java.util.Scanner;

public class GamingStore_03_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double currentBalance = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();
        double cost;
        double totalSpent =0;
        while (!input.equals("Game Time")) {
            String game = input;
            switch (game) {
                case "OutFall 4":
                    cost = 39.99;
                    if(currentBalance <= 0 ) {
                        System.out.println("Out of money!");
                        return;
                    } else if(currentBalance < cost ) {
                        System.out.println("Too Expensive");
                    } else {
                        currentBalance -= 39.99;
                        totalSpent += cost;
                        System.out.printf("Bought %s%n",game);
                    }
                    break;
                case "CS: OG":
                    cost = 15.99;
                    if(currentBalance  <= 0) {
                        System.out.println("Out of money!");
                        return;
                    } else if(currentBalance < cost ) {
                        System.out.println("Too Expensive");
                    } else {
                        currentBalance -= cost;
                        totalSpent += cost;
                        System.out.printf("Bought %s%n",game);
                    }
                    break;
                case "Zplinter Zell":
                    cost = 19.99;
                    if(currentBalance <= 0) {
                        System.out.println("Out of money!");
                        return;
                    } else if(currentBalance < cost ) {
                        System.out.println("Too Expensive");
                    } else {
                        currentBalance -= cost;
                        totalSpent += cost;
                        System.out.printf("Bought %s%n",game);
                    }
                    break;
                case "Honored 2":
                    cost = 59.99;
                    if(currentBalance <= 0) {
                        System.out.println("Out of money!");
                        return;
                    } else if(currentBalance < cost ) {
                        System.out.println("Too Expensive");
                    } else {
                        currentBalance -= cost;
                        totalSpent += cost;
                        System.out.printf("Bought %s%n",game);
                    }
                    break;
                case "RoverWatch":
                    cost = 29.99;
                    if(currentBalance  <= 0) {
                        System.out.println("Out of money!");
                        return;
                    } else if(currentBalance < cost ) {
                        System.out.println("Too Expensive");
                    }else {
                        currentBalance -= cost;
                        totalSpent += cost;
                        System.out.printf("Bought %s%n",game);
                    }
                    break;
                case "RoverWatch Origins Edition":
                    cost = 39.99;
                    if(currentBalance <= 0) {
                        System.out.println("Out of money!");
                        return;
                    } else if(currentBalance < cost ) {
                        System.out.println("Too Expensive");
                    }else {
                        currentBalance -= cost;
                        totalSpent += cost;
                        System.out.printf("Bought %s%n",game);
                    }
                    break;
                default :
                    System.out.println("Not Found");
                    break;
            }
            input = scan.nextLine();
        }
        if(currentBalance == 0) {
            System.out.println("Out of money!");
        } else {

            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent,currentBalance);
        }
    }
}
