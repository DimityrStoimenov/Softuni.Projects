import java.util.Scanner;

public class HotelRoom_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine(); // месеци - "May" ,"June", "July" , "August", "September", "October"
        int numberOfNights = Integer.parseInt(scan.nextLine()); // брой нощувки
        String room = " ";
        double costStudioInMayAndO = 50.0 * numberOfNights;
        double costStudioInJuneAndS = 75.20 * numberOfNights;
        double costStudioInJulyAndA = 76.0 * numberOfNights;
        double costApartmentInMayAndO = 65.0 * numberOfNights;
        double costApartmentInJuneAndS = 68.70 * numberOfNights;
        double costApartmentInJulyAndA = 77.00 * numberOfNights;
        double priceOfStay = 0;
        if ((month.equals("May") || month.equals("October")) && numberOfNights>=0 && numberOfNights <=7) {
            room = "Apartment";
            System.out.printf("%s: %.2f lv.%n", room, costApartmentInMayAndO);
            room = "Studio";
            System.out.printf("%s: %.2f lv.", room, costStudioInMayAndO);
        } else if ((month.equals("May") || month.equals("October")) && (numberOfNights > 7 && numberOfNights <= 14)) {
            room = "Apartment";
            System.out.printf("%s: %.2f lv.%n", room, costApartmentInMayAndO);
            room = "Studio";
            priceOfStay = costStudioInMayAndO - (costStudioInMayAndO * 0.05);
            System.out.printf("%s: %.2f lv.", room, priceOfStay);
        } else if (month.equals("May") || month.equals("October") && numberOfNights > 14) {
            room = "Apartment";
            priceOfStay = costApartmentInMayAndO - (0.1 * costApartmentInMayAndO);
            System.out.printf("%s: %.2f lv.%n", room, priceOfStay);
            room = "Studio";
            priceOfStay = costStudioInMayAndO - (costStudioInMayAndO * 0.3);
            System.out.printf("%s: %.2f lv.", room, priceOfStay);
        }
        if ((month.equals("June") || month.equals("September")) && numberOfNights>=0 && numberOfNights <=7) {
            room = "Apartment";
            System.out.printf("%s: %.2f lv.%n", room, costApartmentInJuneAndS);
            room = "Studio";
            System.out.printf("%s: %.2f lv.", room, costStudioInJuneAndS);
        } else if ((month.equals("June") || month.equals("September")) && (numberOfNights > 7 && numberOfNights <= 14)) {
            room = "Apartment";
            System.out.printf("%s: %.2f lv.%n", room, costApartmentInJuneAndS);
            room = "Studio";
            System.out.printf("%s: %.2f lv.", room, costStudioInJuneAndS);
        } else if (month.equals("June") || month.equals("September") && numberOfNights > 14) {
            room = "Apartment";
            priceOfStay = costApartmentInJuneAndS - (0.1 * costApartmentInJuneAndS);
            System.out.printf("%s: %.2f lv.%n", room, priceOfStay);
            room = "Studio";
            priceOfStay = costStudioInJuneAndS - (costStudioInJuneAndS * 0.2);
            System.out.printf("%s: %.2f lv.", room, priceOfStay);
        }
        if ((month.equals("July") || month.equals("August")) && numberOfNights>=0 && numberOfNights <=7) {
            room = "Apartment";
            System.out.printf("%s: %.2f lv.%n", room, costApartmentInJulyAndA);
            room = "Studio";
            System.out.printf("%s: %.2f lv.", room, costStudioInJulyAndA);
        } else if ((month.equals("July") || month.equals("August")) && (numberOfNights > 7 && numberOfNights <= 14)) {
            room = "Apartment";
            System.out.printf("%s: %.2f lv.%n", room,costApartmentInJulyAndA);
            room = "Studio";
            System.out.printf("%s: %.2f lv.", room,costStudioInJulyAndA);
        } else if (month.equals("July") || month.equals("August") && numberOfNights > 14) {
            room = "Apartment";
            priceOfStay = costApartmentInJulyAndA - (0.1 * costApartmentInJulyAndA);
            System.out.printf("%s: %.2f lv.%n", room, priceOfStay);
            room = "Studio";
            System.out.printf("%s: %.2f lv.", room, costStudioInJulyAndA);
        }
    }
}
