import java.util.Scanner;

public class BeerKegs_08_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfKegs = Integer.parseInt(scan.nextLine());
       double max = Double.MIN_VALUE;
       String winnerKeg = "";
        for (int i = 0; i < numberOfKegs ; i++) {
            String keg = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());
            double volumeOfTheWinner = radius * radius * Math.PI * height;
            if(volumeOfTheWinner > max) {
                max = volumeOfTheWinner;
                winnerKeg = keg;
            }
        }
        System.out.printf("%s", winnerKeg);
    }
}
