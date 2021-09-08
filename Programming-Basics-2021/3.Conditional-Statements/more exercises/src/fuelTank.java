import java.util.Scanner;

public class fuelTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kindOfFuel = scan.nextLine().toLowerCase(); // вид на горивото - "Diesel", "Gasoline", "Gas"
        double liters = Double.parseDouble(scan.nextLine()); // литри гориво
        if (kindOfFuel.equals("diesel") || kindOfFuel.equals("gasoline") || kindOfFuel.equals("gas")) {
            if (25 <= liters) {
                System.out.printf("You have enough %s.", kindOfFuel);
            } else if (25 >= liters) {
                System.out.printf("Fill your tank with %s!", kindOfFuel);
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}



