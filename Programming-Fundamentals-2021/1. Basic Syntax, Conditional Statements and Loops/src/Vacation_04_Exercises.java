import java.util.Scanner;

public class Vacation_04_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int groupOfPeople = Integer.parseInt(scan.nextLine());
        String typeOfTheGroup= scan.nextLine();
        String dayOfWeek = scan.nextLine();
        double priceOfGroup = 0;
        double discount = 0;
        switch (dayOfWeek) {
            case "Friday":
                if (typeOfTheGroup.equals("Students")) {
                   priceOfGroup = groupOfPeople * 8.45;
                   if (groupOfPeople >= 30) {
                       discount = priceOfGroup -( priceOfGroup * 0.15);
                   }
                } else if (typeOfTheGroup.equals("Business")) {
                    priceOfGroup = groupOfPeople * 10.90;
                    if(groupOfPeople >= 100) {
                        discount = (groupOfPeople - 10) * 10.90;
                    }
                } else if (typeOfTheGroup.equals("Regular")) {
                    priceOfGroup = groupOfPeople * 15;
                    if( groupOfPeople >= 10 && groupOfPeople <= 20) {
                        discount = priceOfGroup - ( priceOfGroup * 0.05);
                    }
                }
                break;
            case "Saturday":
                if (typeOfTheGroup.equals("Students")) {
                    priceOfGroup = groupOfPeople * 9.80;
                    if (groupOfPeople >= 30) {
                        discount = priceOfGroup -( priceOfGroup * 0.15);
                    }
                } else if (typeOfTheGroup.equals("Business")) {
                    priceOfGroup = groupOfPeople * 15.60;
                    if(groupOfPeople >= 100) {
                        discount = (groupOfPeople - 10) * 15.60;
                    }
                } else if (typeOfTheGroup.equals("Regular")) {
                    priceOfGroup = groupOfPeople * 20;
                    if( groupOfPeople >= 10 && groupOfPeople <= 20) {
                        discount = priceOfGroup - ( priceOfGroup * 0.05);
                    }
                }
                break;
            case "Sunday":
                if (typeOfTheGroup.equals("Students")) {
                    priceOfGroup = groupOfPeople * 10.46;
                    if (groupOfPeople >= 30) {
                        discount = priceOfGroup -( priceOfGroup * 0.15);
                    }
                } else if (typeOfTheGroup.equals("Business")) {
                    priceOfGroup = groupOfPeople * 16;
                    if(groupOfPeople >= 100) {
                        discount = (groupOfPeople - 10) * 16;
                    }
                } else if (typeOfTheGroup.equals("Regular")) {
                    priceOfGroup = groupOfPeople * 22.50;
                    if( groupOfPeople >= 10 && groupOfPeople <= 20) {
                        discount = priceOfGroup - ( priceOfGroup * 0.05);
                    }
                }
                break;
        }
        if ((dayOfWeek.equals("Friday") || (dayOfWeek.equals("Saturday")) || (dayOfWeek.equals("Sunday")))
        && (typeOfTheGroup.equals("Students")) && (groupOfPeople > 0 && groupOfPeople < 30)) {
            System.out.printf("Total price: %.2f%n",priceOfGroup);
        } else if ((dayOfWeek.equals("Friday") || (dayOfWeek.equals("Saturday")) || (dayOfWeek.equals("Sunday")))
                && (typeOfTheGroup.equals("Students")) &&  groupOfPeople >= 30) {
            System.out.printf("Total price: %.2f%n",discount);
        }
        if ((dayOfWeek.equals("Friday") || (dayOfWeek.equals("Saturday")) || (dayOfWeek.equals("Sunday")))
                && (typeOfTheGroup.equals("Business")) && (groupOfPeople > 0 && groupOfPeople < 100)) {
            System.out.printf("Total price: %.2f%n",priceOfGroup);
        } else if ((dayOfWeek.equals("Friday") || (dayOfWeek.equals("Saturday")) || (dayOfWeek.equals("Sunday")))
                && (typeOfTheGroup.equals("Business")) &&  groupOfPeople >= 100) {
            System.out.printf("Total price: %.2f%n",discount);
        }
        if ((dayOfWeek.equals("Friday") || (dayOfWeek.equals("Saturday")) || (dayOfWeek.equals("Sunday")))
                && (typeOfTheGroup.equals("Regular")) && ((groupOfPeople >= 10 && groupOfPeople <= 20)))  {
            System.out.printf("Total price: %.2f%n",discount);
        } else if ((dayOfWeek.equals("Friday") || (dayOfWeek.equals("Saturday")) || (dayOfWeek.equals("Sunday")))
                && (typeOfTheGroup.equals("Regular"))&& ((groupOfPeople > 0 && groupOfPeople < 10) || (groupOfPeople > 20))) {
            System.out.printf("Total price: %.2f%n",priceOfGroup);

        }
    }
}
