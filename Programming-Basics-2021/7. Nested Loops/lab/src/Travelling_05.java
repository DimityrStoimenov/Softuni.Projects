import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  tripDestination= scan.nextLine(); // дестинацията

        while(!tripDestination.equals("End")) {
            // въвеждаме бюджет
            // спестяваме
            double budget= Double.parseDouble(scan.nextLine());
            //  докато не го съберем си добавяме суми
            while(budget>0){
                // бюджет - конкретна вноска
               double deposit = Double.parseDouble(scan.nextLine());; // конкретната вноска
                budget= budget - deposit;
            }
            System.out.printf("Going to %s!%n", tripDestination);
            tripDestination= scan.nextLine();
        }
    }
}
