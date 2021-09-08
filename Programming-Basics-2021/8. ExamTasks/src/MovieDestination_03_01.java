import java.util.Scanner;

public class MovieDestination_03_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget= Double.parseDouble(scan.nextLine());
        String destination = scan.nextLine();
        String season= scan.nextLine();
        int numberDays= Integer.parseInt(scan.nextLine());
        int price=0;
        double cost= 0;
        double leftMoney=0;
        double neededMoney=0;
        switch(destination) {
            case "Dubai":
                if(season. equals("Winter")) {
                   price= (numberDays * 45000);
                   cost = price - (price * 0.30);
                } else if(season.equals("Summer")) {
                    price= numberDays * 40000;
                    cost = price - (price * 0.30);
                }
                break;
            case "Sofia":
                if(season. equals("Winter")) {
                    price= (numberDays * 17000);
                    cost = price + (price * 0.25);
                } else if(season.equals("Summer")) {
                    price= numberDays * 12500;
                    cost = price + (price * 0.25);
                }
                break;
            case "London":
                if(season. equals("Winter")) {
                   cost= (numberDays * 24000);
                } else if(season.equals("Summer")) {
                    cost= numberDays * 20250;
                }

                break;
        }
        if(destination.equals("Dubai") && ((season.equals("Winter")) || season.equals("Summer"))&& (cost<budget)) {
            leftMoney= budget - cost;
            System.out.printf( "The budget for the movie is enough! We have %.2f leva left!",leftMoney);
        } else if ((destination.equals("Dubai") && ((season.equals("Winter")) || season.equals("Summer"))&& (cost>=budget))) {
            neededMoney= cost - budget;
            System.out.printf("The director needs %.2f leva more!", neededMoney);
        }
        if(destination.equals("Sofia") && ((season.equals("Winter")) || season.equals("Summer"))&& (cost<budget)) {
            leftMoney= budget - cost;
            System.out.printf( "The budget for the movie is enough! We have %.2f leva left!",leftMoney);
        } else if ((destination.equals("Sofia") && ((season.equals("Winter")) || season.equals("Summer"))&& (cost>=budget))) {
            neededMoney= cost - budget;
            System.out.printf("The director needs %.2f leva more!", neededMoney);
        }
        if(destination.equals("London") && ((season.equals("Winter")) || season.equals("Summer"))&& (cost<budget)) {
            leftMoney= budget - cost;
            System.out.printf( "The budget for the movie is enough! We have %.2f leva left!",leftMoney);
        } else if ((destination.equals("London") && ((season.equals("Winter")) || season.equals("Summer"))&& (cost>=budget))) {
            neededMoney= cost - budget;
            System.out.printf("The director needs %.2f leva more!", neededMoney);
        }

    }
}
