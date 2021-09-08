import java.util.Scanner;

public class FilmPremiere_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String projection = scan.nextLine();
        String moviePackage= scan.nextLine();
        int numberTickets= Integer.parseInt(scan.nextLine());
        double cost =0;
        switch(projection) {
            case "John Wick":
                if(moviePackage. equals("Drink")) {
                    cost= numberTickets * 12;
                    System.out.printf("Your bill is %.2f leva.", cost);
                } else if(moviePackage.equals("Popcorn")) {
                    cost= numberTickets * 15;
                    System.out.printf("Your bill is %.2f leva.", cost);
                } else if(moviePackage.equals("Menu")){
                    cost= numberTickets * 19;
                    System.out.printf("Your bill is %.2f leva.", cost);
                }
                break;
            case "Star Wars":
                if(moviePackage. equals("Drink")) {
                    cost = numberTickets * 18;
                } else if(moviePackage.equals("Popcorn")) {
                    cost = numberTickets * 25;

                } else if(moviePackage.equals("Menu")){
                    cost = numberTickets * 30;
                }
                break;
            case "Jumanji":
                if(moviePackage. equals("Drink")) {
                    cost = numberTickets * 9;

                } else if(moviePackage.equals("Popcorn")) {
                    cost= numberTickets * 11;
                } else if(moviePackage.equals("Menu")){
                    cost= numberTickets * 14;
                }
                break;

        }
        if(projection.equals("Star Wars") && ((moviePackage.equals("Drink"))|| (moviePackage.equals("Popcorn")) ||
                (moviePackage.equals("Menu")))&& numberTickets <4) {
            System.out.printf("Your bill is %.2f leva.", cost);
        }
        if(projection.equals("Star Wars") && ((moviePackage.equals("Drink"))|| (moviePackage.equals("Popcorn")) ||
                ( moviePackage.equals("Menu"))) && numberTickets >= 4) {
            cost= cost - (cost * 0.30);
            System.out.printf("Your bill is %.2f leva.", cost);
        }
        if(projection.equals("Jumanji") && ((moviePackage.equals("Drink"))|| (moviePackage.equals("Popcorn")) ||
                (moviePackage.equals("Menu")))&& numberTickets !=2) {
            System.out.printf("Your bill is %.2f leva.", cost);
        }
        if (projection.equals("Jumanji") && ((moviePackage.equals("Drink"))|| (moviePackage.equals("Popcorn")) ||
                (moviePackage.equals("Menu")))&& numberTickets == 2) {
            cost= cost - (cost * 0.15);
            System.out.printf("Your bill is %.2f leva.", cost);
        }
    }
}
