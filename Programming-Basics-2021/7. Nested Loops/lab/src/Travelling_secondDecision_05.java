import java.util.Scanner;

public class Travelling_secondDecision_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tripDestination = scan.nextLine(); // дестинацията

        while (!tripDestination.equals("End")) {
            // въвеждаме бюджет
            // спестяваме
           double budget = Double.parseDouble(scan.nextLine());
            //  докато не го съберем си добавяме суми
            double savings= 0; // спестявания
            while (budget > savings) {
                // бюджет - конкретна вноска
                double deposit = Double.parseDouble(scan.nextLine()); // конкретната вноска
                savings= savings + deposit;
            }
            System.out.printf("Going to %s!%n", tripDestination);
            tripDestination = scan.nextLine();
        }
    }
}


