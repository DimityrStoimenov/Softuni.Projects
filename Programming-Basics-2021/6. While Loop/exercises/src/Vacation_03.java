import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double moneyVacation = Double.parseDouble(scan.nextLine()); // пари нужни за екскурзията
        double availableMoney = Double.parseDouble(scan.nextLine()); // налични пари
        int countAllDays=0;
        int countSpendDays=0;
        // СТОП
        // ако 5 последователни дни харчи
        // ако събере парите за екскурзията ->  availableMoney>= moneyVacation
        // ПРОДЪЛЖАВА ДА СЪБИРА ДОКАТО:
        //  нейните пари( availbaleMoney) са < moneyVacation
        // вкарваме условието в while: нейните пари ( availableMoney< moneyVacation)
        while(availableMoney < moneyVacation) {
            // събира пари
            String action= scan.nextLine(); // save или spend
            double price= Double.parseDouble(scan.nextLine()); // парите които харчи/ пести
            countAllDays++;
            if( action. equals("save")) {
               availableMoney+=price;
                countSpendDays=0;

            } else if(action.equals("spend")) {
                availableMoney -= price;
                countSpendDays++;
            }
                if (availableMoney < 0) {
                    availableMoney = 0;

            }
                if( countSpendDays == 5) {
                    System.out.println("You can't save the money.");
                    System.out.printf("%d", countAllDays);
                    break;
                }

            }

        if(availableMoney>= moneyVacation) {
            System.out.printf("You saved the money for %d days.", countAllDays);
        }

    }
}
