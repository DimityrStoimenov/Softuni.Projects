import java.util.Scanner;

public class sewingWorkshop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine()); // а - брой маси
        double h = Double.parseDouble(scan.nextLine()); // h - дължина на правоъгълната покривка
        double w = Double.parseDouble(scan.nextLine()); // w - широчина на правоъгълната покривка
        double areaOfTheTablecloth = (a *((h+2*0.30) * (w + 2 *0.30)));
        double areaOfBoxBlanca = a *(h/2 * h/2);
        double costInUsd = (areaOfTheTablecloth * 7) + (areaOfBoxBlanca*9);
        double costInBgn = costInUsd *1.85;
        System.out.printf("%.2f",costInUsd);
        System.out.println(" " + "USD");
        System.out.printf("%.2f", costInBgn);
        System.out.println(" " + "BGN");

    }
}
