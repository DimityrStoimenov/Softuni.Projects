import java.util.Scanner;

public class EasterTrip_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();//"France", "Italy" или "Germany"
        String datesOfReservation= scan.nextLine();//"21-23","24-27" или "28-31"
        int numberOfNights = Integer.parseInt(scan.nextLine());
        double prizeOfNights = 0;
        switch(datesOfReservation) {
            case "21-23":
                if(destination.equals("France")) {
                prizeOfNights = numberOfNights * 30;
                } else if(destination.equals("Italy")) {
                    prizeOfNights = numberOfNights * 28;
                } else if ( destination.equals("Germany")) {
                    prizeOfNights = numberOfNights * 32;
                }
                break;
            case "24-27":
                if(destination.equals("France")) {
                    prizeOfNights = numberOfNights * 35;
                } else if(destination.equals("Italy")) {
                    prizeOfNights = numberOfNights * 32;
                } else if ( destination.equals("Germany")) {
                    prizeOfNights = numberOfNights * 37;
                }
                break;
            case "28-31":
                if(destination.equals("France")) {
                    prizeOfNights = numberOfNights * 40;
                } else if(destination.equals("Italy")) {
                    prizeOfNights = numberOfNights * 39;
                } else if ( destination.equals("Germany")) {
                    prizeOfNights = numberOfNights * 43;
                }
                break;
        }
        if((destination.equals("France")|| (destination.equals("Italy")) || (destination.equals("Germany"))) &&
                (datesOfReservation. equals("21-23") || (datesOfReservation.equals("24-27"))||
                        datesOfReservation.equals("28-31"))) {
            System.out.printf("Easter trip to %s : %.2f leva.",destination,prizeOfNights);
        }
    }
}
