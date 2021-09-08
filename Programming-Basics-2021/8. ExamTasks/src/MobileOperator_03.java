import java.util.Scanner;

public class MobileOperator_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String termOfContract = scan.nextLine();// "one", или "two"
        String typeOfContract = scan.nextLine();// "Small",  "Middle", "Large"или "ExtraLarge"
        String addedMobileNet = scan.nextLine(); // "yes" или "no"
        int numberOfMonthsToPay = Integer.parseInt(scan.nextLine());
        double tax = 0;
        double bill = 0;
        double addedCost = 0;
        switch (termOfContract) {
            case "one":
                if (typeOfContract.equals("Small") && addedMobileNet.equals("yes")) {
                    tax = 9.98 + 5.50;
                    addedCost = tax * numberOfMonthsToPay;
                } else if (typeOfContract.equals("Small") && addedMobileNet.equals("no")) {
                    bill = numberOfMonthsToPay * 9.98;
                }
                if (typeOfContract.equals("Middle") && addedMobileNet.equals("yes")) {
                    tax = 18.99 + 4.35;
                    addedCost = tax * numberOfMonthsToPay;
                } else if (typeOfContract.equals("Middle") && addedMobileNet.equals("no")) {
                    bill = numberOfMonthsToPay * 18.99;
                }
                if (typeOfContract.equals("Large") && addedMobileNet.equals("yes")) {
                    tax = 25.98 + 4.35;
                    addedCost = tax * numberOfMonthsToPay;
                } else if (typeOfContract.equals("Large") && addedMobileNet.equals("no")) {
                    bill = numberOfMonthsToPay * 25.98;
                }
                if (typeOfContract.equals("ExtraLarge") && addedMobileNet.equals("yes")) {
                    tax = 35.99 + 3.85;
                    addedCost = tax * numberOfMonthsToPay;
                } else if (typeOfContract.equals("ExtraLarge") && addedMobileNet.equals("no")) {
                    bill = numberOfMonthsToPay * 35.99;
                }

                break;
            case "two":
                if (typeOfContract.equals("Small") && addedMobileNet.equals("yes")) {
                    tax = 8.58 + 5.50;
                    addedCost = tax * numberOfMonthsToPay;
                } else if (typeOfContract.equals("Small") && addedMobileNet.equals("no")) {
                    bill = numberOfMonthsToPay * 8.58;
                }
                if (typeOfContract.equals("Middle") && addedMobileNet.equals("yes")) {
                    tax = 17.09 + 4.35;
                    addedCost = tax * numberOfMonthsToPay;
                } else if (typeOfContract.equals("Middle") && addedMobileNet.equals("no")) {
                    bill = numberOfMonthsToPay * 17.09;
                }
                if (typeOfContract.equals("Large") && addedMobileNet.equals("yes")) {
                    tax = 23.59 + 4.35;
                    addedCost = tax * numberOfMonthsToPay;
                } else if (typeOfContract.equals("Large") && addedMobileNet.equals("no")) {
                    bill = numberOfMonthsToPay * 23.59;
                }
                if (typeOfContract.equals("ExtraLarge") && addedMobileNet.equals("yes")) {
                    tax = 31.79 + 3.85;
                    addedCost = tax * numberOfMonthsToPay;
                } else if (typeOfContract.equals("ExtraLarge") && addedMobileNet.equals("no")) {
                    bill = numberOfMonthsToPay * 31.79;
                }
                break;

        }
        if((termOfContract.equals("one")) & ((typeOfContract.equals("Small"))||(typeOfContract.equals("Middle"))||
                (typeOfContract.equals("Large")) ||(typeOfContract.equals("ExtraLarge"))) &&
                (addedMobileNet.equals("yes"))) {
            System.out.printf("%.2f lv.", addedCost);
        } else if((termOfContract.equals("one")) & ((typeOfContract.equals("Small"))||(typeOfContract.equals("Middle"))||
                (typeOfContract.equals("Large")) ||(typeOfContract.equals("ExtraLarge"))) &&
                (addedMobileNet.equals("no"))) {
            System.out.printf("%.2f lv.", bill);
        }
        if((termOfContract.equals("two")) & ((typeOfContract.equals("Small"))||(typeOfContract.equals("Middle"))||
                (typeOfContract.equals("Large")) ||(typeOfContract.equals("ExtraLarge"))) &&
                (addedMobileNet.equals("yes"))) {
            double discount = addedCost - (addedCost * 0.0375);
            System.out.printf("%.2f lv.", discount);
        } else if((termOfContract.equals("two")) & ((typeOfContract.equals("Small"))||(typeOfContract.equals("Middle"))||
                (typeOfContract.equals("Large")) ||(typeOfContract.equals("ExtraLarge"))) &&
                (addedMobileNet.equals("no"))) {
            double reduction = bill - (bill * 0.0375);
            System.out.printf("%.2f lv.",reduction);
        }
    }
}
