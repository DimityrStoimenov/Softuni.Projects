import java.util.Scanner;

public class fruitShop_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruitName = scan.nextLine();
        String dayOfWeek = scan.nextLine();
        double amount = Double.parseDouble(scan.nextLine());
        double cost = 0;
        switch (dayOfWeek) {
            case "Monday":
                switch (fruitName) {
                    case "banana":
                        cost = amount * 2.50;
                        System.out.printf("%.2f", cost);
                        break;
                    case "apple":
                        cost = amount * 1.20;
                        System.out.printf("%.2f", cost);
                        break;
                    case "orange":
                        cost = amount * 0.85;
                        System.out.printf("%.2f", cost);
                        break;
                    case "grapefruit":
                        cost = amount * 1.45;
                        System.out.printf("%.2f", cost);
                        break;
                    case "kiwi":
                        cost = amount * 2.70;
                        System.out.printf("%.2f", cost);
                        break;
                    case "pineapple":
                        cost = amount * 5.50;
                        System.out.printf("%.2f", cost);
                        break;
                    case "grapes":
                        cost = amount * 3.85;
                        System.out.printf("%.2f", cost);
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "Tuesday":
                switch (fruitName) {
                    case "banana":
                        cost = amount * 2.50;
                        System.out.printf("%.2f", cost);
                        break;
                    case "apple":
                        cost = amount * 1.20;
                        System.out.printf("%.2f", cost);
                        break;
                    case "orange":
                        cost = amount * 0.85;
                        System.out.printf("%.2f", cost);
                        break;
                    case "grapefruit":
                        cost = amount * 1.45;
                        System.out.printf("%.2f", cost);
                        break;
                    case "kiwi":
                        cost = amount * 2.70;
                        System.out.printf("%.2f", cost);
                        break;
                    case "pineapple":
                        cost = amount * 5.50;
                        System.out.printf("%.2f", cost);
                        break;
                    case "grapes":
                        cost = amount * 3.85;
                        System.out.printf("%.2f", cost);
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "Wednesday":
                switch (fruitName) {
                    case "banana":
                        cost = amount * 2.50;
                        System.out.printf("%.2f", cost);
                        break;
                    case "apple":
                        cost = amount * 1.20;
                        System.out.printf("%.2f", cost);
                        break;
                    case "orange":
                        cost = amount * 0.85;
                        System.out.printf("%.2f", cost);
                        break;
                    case "grapefruit":
                        cost = amount * 1.45;
                        System.out.printf("%.2f", cost);
                        break;
                    case "kiwi":
                        cost = amount * 2.70;
                        System.out.printf("%.2f", cost);
                        break;
                    case "pineapple":
                        cost = amount * 5.50;
                        System.out.printf("%.2f", cost);
                        break;
                    case "grapes":
                        cost = amount * 3.85;
                        System.out.printf("%.2f", cost);
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "Thursday":
                switch (fruitName) {
                    case "banana":
                        cost = amount * 2.50;
                        System.out.printf("%.2f", cost);
                        break;
                    case "apple":
                        cost = amount * 1.20;
                        System.out.printf("%.2f", cost);
                        break;
                    case "orange":
                        cost = amount * 0.85;
                        System.out.printf("%.2f", cost);
                        break;
                    case "grapefruit":
                        cost = amount * 1.45;
                        System.out.printf("%.2f", cost);
                        break;
                    case "kiwi":
                        cost = amount * 2.70;
                        System.out.printf("%.2f", cost);
                        break;
                    case "pineapple":
                        cost = amount * 5.50;
                        System.out.printf("%.2f", cost);
                        break;
                    case "grapes":
                        cost = amount * 3.85;
                        System.out.printf("%.2f", cost);
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "Friday":
                switch (fruitName) {
                    case "banana":
                        cost = amount * 2.50;
                        System.out.printf("%.2f", cost);
                        break;
                    case "apple":
                        cost = amount * 1.20;
                        System.out.printf("%.2f", cost);
                        break;
                    case "orange":
                        cost = amount * 0.85;
                        System.out.printf("%.2f", cost);
                        break;
                    case "grapefruit":
                        cost = amount * 1.45;
                        System.out.printf("%.2f", cost);
                        break;
                    case "kiwi":
                        cost = amount * 2.70;
                        System.out.printf("%.2f", cost);
                        break;
                    case "pineapple":
                        cost = amount * 5.50;
                        System.out.printf("%.2f", cost);
                        break;
                    case "grapes":
                        cost = amount * 3.85;
                        System.out.printf("%.2f", cost);
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "Saturday":
                switch (fruitName) {
                    case "banana":
                        cost = amount * 2.70;
                        System.out.printf("%.2f", cost);
                        break;
                    case "apple":
                        cost = amount * 1.25;
                        System.out.printf("%.2f", cost);
                        break;
                    case "orange":
                        cost = amount * 0.90;
                        System.out.printf("%.2f", cost);
                        break;
                    case "grapefruit":
                        cost = amount * 1.60;
                        System.out.printf("%.2f", cost);
                        break;
                    case "kiwi":
                        cost = amount * 3.00;
                        System.out.printf("%.2f", cost);
                        break;
                    case "pineapple":
                        cost = amount * 5.60;
                        System.out.printf("%.2f", cost);
                        break;
                    case "grapes":
                        cost = amount * 4.20;
                        System.out.printf("%.2f", cost);
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "Sunday":
                switch (fruitName) {
                    case "banana":
                        cost = amount * 2.70;
                        System.out.printf("%.2f", cost);
                        break;
                    case "apple":
                        cost = amount * 1.25;
                        System.out.printf("%.2f", cost);
                        break;
                    case "orange":
                        cost = amount * 0.90;
                        System.out.printf("%.2f", cost);
                        break;
                    case "grapefruit":
                        cost = amount * 1.60;
                        System.out.printf("%.2f", cost);
                        break;
                    case "kiwi":
                        cost = amount * 3.00;
                        System.out.printf("%.2f", cost);
                        break;
                    case "pineapple":
                        cost = amount * 5.60;
                        System.out.printf("%.2f", cost);
                        break;
                    case "grapes":
                        cost = amount * 4.20;
                        System.out.printf("%.2f", cost);
                        break;
                    default:
                        System.out.println("error");

                }
                break;
        }
    }
}


