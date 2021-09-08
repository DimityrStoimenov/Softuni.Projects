import java.util.Scanner;

public class skiTrip_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = Integer.parseInt(scan.nextLine()); // дни за престой
        String typeOfRoom = scan.nextLine(); // вид помещение
        String rating = scan.nextLine(); // оценка

        double nights = day - 1.0;
        double nightsPerTrip= 0;
        double discount = 0 ;
        double evaluation = 0;
        double costForRoomForOnePerson = nights * 18.00;
        double costForApartment = nights * 25.00;
        double costForPresidentApartment = nights * 35.00;

        if (typeOfRoom.equals("room for one person") && rating.equals("positive")) {
            if (day < 10) {
                nightsPerTrip = costForRoomForOnePerson;
                evaluation = nightsPerTrip + (0.25 * nightsPerTrip);
                System.out.printf("%.2f", evaluation);
            }
        }
        if (typeOfRoom.equals("room for one person") && rating.equals("negative")) {
            if (day < 10) {
                nightsPerTrip = costForRoomForOnePerson;
                evaluation = nightsPerTrip - (0.1 * nightsPerTrip);
                System.out.printf("%.2f", evaluation);
            }
        }

        if (typeOfRoom.equals("room for one person") && rating.equals("positive")) {
            if (day >= 10 && day <= 15) {
                nightsPerTrip = costForRoomForOnePerson;
                evaluation = nightsPerTrip + (0.25 * nightsPerTrip);
                System.out.printf("%.2f", evaluation);
            }
        }
        if (typeOfRoom.equals("room for one person") && rating.equals("negative")) {
            if (day >= 10 && day <= 15) {
                nightsPerTrip = costForRoomForOnePerson;
                evaluation = nightsPerTrip - (0.1 * nightsPerTrip);
                System.out.printf("%.2f", evaluation);
            }
        }

        if (typeOfRoom.equals("room for one person") && rating.equals("positive")) {
            if (day > 15) {
                nightsPerTrip = costForRoomForOnePerson;
                evaluation = nightsPerTrip + (0.25 * nightsPerTrip);
                System.out.printf("%.2f", evaluation);
            }
        }
        if (typeOfRoom.equals("room for one person") && rating.equals("negative")) {
            if (day > 15) {
                nightsPerTrip = costForRoomForOnePerson;
                evaluation = nightsPerTrip - (0.1 * nightsPerTrip);
                System.out.printf("%.2f", evaluation);
            }
        }
        if (typeOfRoom.equals("apartment") && rating.equals("positive")) {
            if (day < 10) {
                nightsPerTrip = costForApartment;
                discount = nightsPerTrip - (nightsPerTrip * 0.3);
                evaluation = discount + (discount * 0.25);
                System.out.printf("%.2f", evaluation);
            }
        }
        if (typeOfRoom.equals("apartment") && rating.equals("negative")) {
            if (day < 10) {
                nightsPerTrip = costForApartment;
                discount = nightsPerTrip - (nightsPerTrip * 0.3);
                evaluation = discount - (discount * 0.1);
                System.out.printf("%.2f", evaluation);
            }
        }

        if (typeOfRoom.equals("apartment") && rating.equals("positive")) {
            if (day >= 10 && day <= 15) {
                nightsPerTrip = costForApartment;
                discount = nightsPerTrip - (nightsPerTrip * 0.35);
                evaluation = discount + (discount * 0.25);
                System.out.printf("%.2f", evaluation);
            }
        }
        if (typeOfRoom.equals("apartment") && rating.equals("negative")) {
            if (day >= 10 && day <= 15) {
                nightsPerTrip = costForApartment;
                discount = nightsPerTrip - (nightsPerTrip * 0.35);
                evaluation = discount - (discount * 0.1);
                System.out.printf("%.2f", evaluation);
            }
        }

        if (typeOfRoom.equals("apartment") && rating.equals("positive")) {
            if (day > 15) {
                nightsPerTrip = costForApartment;
                discount = nightsPerTrip - (nightsPerTrip * 0.5);
                evaluation = discount + (discount * 0.25);
                System.out.printf("%.2f", evaluation);
            }
        }
        if (typeOfRoom.equals("apartment") && rating.equals("negative")) {
            if (day > 15) {
                nightsPerTrip = costForApartment;
                discount = nightsPerTrip - (nightsPerTrip * 0.5);
                evaluation = discount - (discount * 0.1);
                System.out.printf("%.2f", evaluation);
            }
        }
        if (typeOfRoom.equals("president apartment") && rating.equals("positive")) {
            if (day < 10) {
                nightsPerTrip = costForPresidentApartment;
                discount = nightsPerTrip - (nightsPerTrip * 0.1);
                evaluation = discount + (discount * 0.25);
                System.out.printf("%.2f", evaluation);
            }
        }
        if (typeOfRoom.equals("president apartment") && rating.equals("negative")) {
            if (day < 10) {
                nightsPerTrip = costForPresidentApartment;
                discount = nightsPerTrip - (nightsPerTrip * 0.1);
                evaluation = discount - (discount * 0.1);
                System.out.printf("%.2f", evaluation);
            }
        }

        if (typeOfRoom.equals("president apartment") && rating.equals("positive")) {
            if (day >= 10 && day <= 15) {
                nightsPerTrip = costForPresidentApartment;
                discount = nightsPerTrip - (nightsPerTrip * 0.15);
                evaluation = discount + (discount * 0.25);
                System.out.printf("%.2f", evaluation);
            }
        }
        if (typeOfRoom.equals("president apartment") && rating.equals("negative")) {
            if (day >= 10 && day <= 15) {
                nightsPerTrip = costForPresidentApartment;
                discount = nightsPerTrip - (nightsPerTrip * 0.15);
                evaluation = discount - (discount * 0.1);
                System.out.printf("%.2f", evaluation);
            }
        }

        if (typeOfRoom.equals("president apartment") && rating.equals("positive")) {
            if (day > 15) {
                nightsPerTrip = costForPresidentApartment;
                discount = nightsPerTrip - (nightsPerTrip* 0.2);
                evaluation = discount + (discount * 0.25);
                System.out.printf("%.2f", evaluation);
            }
        }
        if (typeOfRoom.equals("president apartment") && rating.equals("negative")) {
            if (day > 15) {
                nightsPerTrip = costForPresidentApartment;
                discount = nightsPerTrip - (nightsPerTrip* 0.2);
                evaluation = discount - (discount * 0.1);
                System.out.printf("%.2f", evaluation);
            }
        }
    }
}
