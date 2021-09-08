import java.util.Scanner;

public class pipePools {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int V = Integer.parseInt(scan.nextLine()); // обем на басейна
        int P1 = Integer.parseInt(scan.nextLine()); // дебит на първата тръба в час
        int P2 = Integer.parseInt(scan.nextLine()); // дебит на втората тръба в час
        double H = Double.parseDouble(scan.nextLine()); // часовете за които работникът е излязъл

        int volumePerHour = P1 + P2;
        double volumePerHHours = volumePerHour * H;

        if(volumePerHHours <= V) {
            double percentageOfPoolVolume =  (volumePerHHours / V) * 100;
            double percentageOfWaterPerP1 = ((P1 *H) / volumePerHHours)*100;
            double percentageOfWaterPerP2 = ((P2 * H) / volumePerHHours)*100;
            char sym = '%';
            char symbol = ':';
            System.out.printf("The pool is %.2f%c full. Pipe 1%c %.2f%c. Pipe 2%c %.2f%c.",percentageOfPoolVolume,sym,symbol,percentageOfWaterPerP1,sym,symbol,percentageOfWaterPerP2,sym);
        } else if (volumePerHHours >= V) {
            double moreLiters = volumePerHHours - V;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",H,moreLiters);
        }
    }
}
