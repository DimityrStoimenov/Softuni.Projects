import java.util.Scanner;

public class Series_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget= Double.parseDouble(scan.nextLine());
        int numberOfSerials= Integer.parseInt(scan.nextLine());

        for(int serial= 0; serial<numberOfSerials; serial++) {
            String nameSerial= scan.nextLine();
            double costOfSerial = Double.parseDouble(scan.nextLine());
            if(nameSerial.equals("Thrones")) {
                budget-= costOfSerial - (costOfSerial*0.5);
            } else if(nameSerial.equals("Lucifer")) {
                budget-=costOfSerial-(costOfSerial*0.4);
            } else if(nameSerial.equals("Protector")) {
                budget -= costOfSerial - (costOfSerial*0.3);
                } else if(nameSerial.equals("TotalDrama")) {
                budget -= costOfSerial - (costOfSerial*0.2);
            } else if(nameSerial.equals("Area")) {
                budget -= costOfSerial - (costOfSerial*0.1);
            } else {
                budget -= costOfSerial;
            }

        }
        if(budget >=0) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(budget));
        }
    }
}
