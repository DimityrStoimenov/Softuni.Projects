import java.util.Scanner;

public class TheatrePromotions_07_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        int ticket = 0;
        switch (day) {
            case "Weekday":
                if((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                    ticket = 12;
                } else if(age > 18 && age <= 64) {
                    ticket = 18;
                }
                break;
            case "Weekend":
                if((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                    ticket = 15;
                } else if(age > 18 && age <= 64) {
                    ticket = 20;
                }
                break;
            case "Holiday":
                if(age >= 0 && age <= 18) {
                    ticket = 5;
                } else if(age > 18 && age <= 64) {
                    ticket = 12;
                } else if(age > 64 && age <= 122) {
                    ticket = 10;
                }
                break;
        }
        if ( (age >=0 && age <= 122)) {
            System.out.printf("%d$", ticket);
        } else {
            System.out.println("Error!");
        }
    }
}
