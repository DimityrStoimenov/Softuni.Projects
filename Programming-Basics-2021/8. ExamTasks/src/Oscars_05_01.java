import java.util.Scanner;

public class Oscars_05_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameActor = scan.nextLine();
        double pointsAcademy = Double.parseDouble(scan.nextLine());
        int jury = Integer.parseInt(scan.nextLine());
        for (int memberOfTheJury = 1; memberOfTheJury <= jury; memberOfTheJury++) {
            String nameOfTheAppraiser = scan.nextLine();
            double pointsOfAppraiser = Double.parseDouble(scan.nextLine());
            int name = nameOfTheAppraiser.length();
            pointsAcademy += (name * pointsOfAppraiser) / 2;
            if(pointsAcademy >= 1250.5) {
                break;
            }
        }
        if(pointsAcademy>= 1250.50) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",nameActor,pointsAcademy);
        } else {
            double neededPoints= 1250.50 - pointsAcademy;
            System.out.printf("Sorry, %s you need %.1f more!", nameActor,neededPoints);
        }
    }
}

