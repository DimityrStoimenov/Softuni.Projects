import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class ParkingLot_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Set<String> registrationNumbers = new LinkedHashSet<>();
         while (!input .equals("END")) {
             String [] tokens = input .split(",\\s+");
             String command = tokens[0];
             String number = tokens[1];
              switch (command) {
                  case "IN":
                      registrationNumbers.add(number);

                      break;
                  case "OUT":
                      registrationNumbers.remove(number);
                      break;

              }
             input = scan.nextLine();

         }
       if ( registrationNumbers.isEmpty()) {
           System.out.println("Parking Lot is Empty");
       } else {
           for (String registrationNumber : registrationNumbers) {
               System.out.println(registrationNumber);
           }
       }
    }
}
