import java.util.Scanner;

public class fruitShopSecondDecision_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String workDay = scan.nextLine();
        double amount = Double.parseDouble(scan.nextLine());
        double cost = 0;
        boolean isFruit = (fruit.equals("banana") || fruit.equals("apple") || fruit.equals("orange") || fruit.equals("grapefruit")
                || fruit.equals("kiwi") || fruit.equals("pineapple") || fruit.equals("grapes"));
        boolean isdayOfWeek = (workDay.equals("Monday") || workDay.equals("Tuesday") || workDay.equals("Wednesday")
                || workDay.equals("Thursday") || workDay.equals("Friday") || workDay.equals("Saturday") || workDay.equals("Sunday"));
        if (isFruit) {
            if (fruit.equals("banana")) {
                if (isdayOfWeek) {
                    if ((workDay.equals("Monday") || workDay.equals("Tuesday") || workDay.equals("Wednesday")
                            || workDay.equals("Thursday") || workDay.equals("Friday"))) {
                        cost = amount * 2.50;
                        System.out.printf("%.2f", cost);
                    } else {
                        cost = amount * 2.70;
                        System.out.printf("%.2f", cost);
                    }
                }
            }
        }
        if (isFruit) {
            if (isdayOfWeek)
                if (fruit.equals("apple")) {
                    if ((workDay.equals("Monday") || workDay.equals("Tuesday") || workDay.equals("Wednesday")
                            || workDay.equals("Thursday") || workDay.equals("Friday"))) {
                        cost = amount * 1.20;
                        System.out.printf("%.2f", cost);
                    } else {
                        cost = amount * 1.25;
                        System.out.printf("%.2f", cost);
                    }
                }
        }
        if (isFruit) {
            if (isdayOfWeek) {
                if (fruit.equals("orange")) {
                    if ((workDay.equals("Monday") || workDay.equals("Tuesday") || workDay.equals("Wednesday")
                            || workDay.equals("Thursday") || workDay.equals("Friday"))) {
                        cost = amount * 0.85;
                        System.out.printf("%.2f", cost);
                    } else {
                        cost = amount * 0.90;
                        System.out.printf("%.2f", cost);
                    }
                }
            }
        }
        if (isFruit) {
            if (isdayOfWeek) {
                if (fruit.equals("grapefruit")) {
                    if ((workDay.equals("Monday") || workDay.equals("Tuesday") || workDay.equals("Wednesday")
                            || workDay.equals("Thursday") || workDay.equals("Friday"))) {
                        cost = amount * 1.45;
                        System.out.printf("%.2f", cost);
                    } else {
                        cost = amount * 1.60;
                        System.out.printf("%.2f", cost);
                    }
                }
            }
        }
        if (isFruit) {
            if (isdayOfWeek) {
                if (fruit.equals("kiwi")) {
                    if ((workDay.equals("Monday") || workDay.equals("Tuesday") || workDay.equals("Wednesday")
                            || workDay.equals("Thursday") || workDay.equals("Friday"))) {
                        cost = amount * 2.70;
                        System.out.printf("%.2f", cost);
                    } else  {
                        cost = amount * 3.00;
                        System.out.printf("%.2f", cost);
                    }
                }
            }
        }
        if (isFruit) {
            if (isdayOfWeek) {
                if (fruit.equals("pineapple")) {
                    if ((workDay.equals("Monday") || workDay.equals("Tuesday") || workDay.equals("Wednesday")
                            || workDay.equals("Thursday") || workDay.equals("Friday"))) {
                        cost = amount * 5.50;
                        System.out.printf("%.2f", cost);
                    } else {
                        cost = amount * 5.60;
                        System.out.printf("%.2f", cost);
                    }
                }
            }
        }
        if (isFruit) {
            if (isdayOfWeek) {
                if (fruit.equals("grapes")) {
                    if ((workDay.equals("Monday") || workDay.equals("Tuesday") || workDay.equals("Wednesday")
                            || workDay.equals("Thursday") || workDay.equals("Friday"))) {
                        cost = amount * 3.85;
                        System.out.printf("%.2f", cost);
                    } else {
                        cost = amount * 4.20;
                        System.out.printf("%.2f", cost);
                    }
                }
            }

        }
        if(!isFruit && isdayOfWeek) {
            System.out.println("error");
        }
        if(isFruit &&!isdayOfWeek) {
            System.out.println("error");
        }
        if(!isFruit && !isdayOfWeek) {
            System.out.println("error");
        }
    }
}





